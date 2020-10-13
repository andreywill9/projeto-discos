package model;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArvoresGeneros {

  private List<Genero> listaGeneros;
  private int quantidadeGeneros;

  public ArvoresGeneros() {
    quantidadeGeneros = 0;
  }

  public ArvoresGeneros(List<Genero> listaGeneros) {
    this.listaGeneros = listaGeneros;
    quantidadeGeneros = calcularQuantidadeGeneros(listaGeneros);
  }

  private int calcularQuantidadeGeneros(List<Genero> generos) {
    return generos != null && !generos.isEmpty() ?
        1 + generos.stream().mapToInt(
            genero -> calcularQuantidadeGeneros(genero.getSubgeneros()))
            .sum() :
        0;
  }

  public void adicionarGenero(Genero genero, @Nullable Integer idGeneroPai) throws Exception {
    genero.setIdGenero(++quantidadeGeneros);
    if (idGeneroPai == null) {
      listaGeneros.add(genero);
      return;
    }
    boolean sucesso = adicionarGenero(genero, idGeneroPai, listaGeneros);
    if (!sucesso) throw new Exception("O gênero pai especificado não foi encontrado");
  }

  private boolean adicionarGenero(Genero genero, int idGeneroPai, List<Genero> listaSubgeneros) {
    for (Genero generoLista : listaSubgeneros) {
      if (generoLista.getIdGenero() == idGeneroPai) {
        generoLista.adicionarSubgenero(genero);
        return true;
      }
    }
    return listaSubgeneros.stream().anyMatch(generoLista ->
        adicionarGenero(genero, idGeneroPai, generoLista.getSubgeneros()));
  }

  public void adicionarDisco(Disco disco) throws Exception {
    if (disco.getIdGenero() == null) { return; }
    boolean resultado = adicionarDisco(disco, listaGeneros);
    if (!resultado) throw new Exception("O gênero especificado não foi encontrado");
  }

  private boolean adicionarDisco(Disco disco, List<Genero> generos) {
    for (Genero genero : generos) {
      if (disco.getIdGenero() == genero.getIdGenero()) {
        genero.adicionarDisco(disco.getIdDisco());
        return true;
      }
    }
    return generos.stream().anyMatch(genero ->
        adicionarDisco(disco, genero.getSubgeneros()));
  }

  public List<Genero> paraLista() {
    List<Genero> lista = new ArrayList<>();
    listaGeneros.forEach(genero -> adicionarSubgenerosLista(genero, lista));
    return lista.stream().sorted(
        Comparator.comparing(Genero::getNome)).collect(Collectors.toList());
  }

  private void adicionarSubgenerosLista(Genero genero, List<Genero> lista) {
    genero.getSubgeneros().forEach(subgenero -> adicionarSubgenerosLista(subgenero, lista));
    lista.add(genero);
  }
}
