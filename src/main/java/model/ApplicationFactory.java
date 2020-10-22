package model;

import java.util.*;

public class ApplicationFactory {

  private Map<Integer, Disco> todosDiscos;
  private ArvoresGeneros generos;

  public ApplicationFactory() {
    todosDiscos = new HashMap<>();
    generos = new ArvoresGeneros();
  }

  public void cadastrarGenero(String nome) {
    Genero novoGenero = new Genero(nome);
    generos.adicionarGenero(novoGenero, null);
  }

  public void cadastrarGenero(String nome, Genero generoPai) {
    Genero novoGenero = new Genero(nome);
    Integer idGeneroPai = generoPai != null ?
        generoPai.getIdGenero() : null;
    generos.adicionarGenero(novoGenero, idGeneroPai);
  }

  public void cadastrarDisco(String titulo, int ano) {
    Disco novoDisco = new Disco(titulo, ano);
    novoDisco.setIdDisco(todosDiscos.size() + 1);
    todosDiscos.put(novoDisco.getIdDisco(), novoDisco);
  }

  public void cadastrarDisco(String titulo, int ano, Genero genero) {
    Disco novoDisco = new Disco(titulo, ano, genero);
    novoDisco.setIdDisco(todosDiscos.size() + 1);
    generos.adicionarDisco(novoDisco);
    todosDiscos.put(novoDisco.getIdDisco(), novoDisco);
  }

  public List<Genero> getTodosGeneros() {
    List<Genero> todosGeneros = new ArrayList<>();
    todosGeneros.add(null);
    todosGeneros.addAll(generos.paraLista());
    return todosGeneros;
  }

  public List<Disco> getTodosDiscos() {
    return new ArrayList<Disco>(todosDiscos.values());
  }
}
