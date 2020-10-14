package model;

import java.util.HashMap;
import java.util.Map;

public class ApplicationFactory {

  private Map<Integer, Disco> todosDiscos;
  private ArvoresGeneros generos;

  public ApplicationFactory() {
    todosDiscos = new HashMap<>();
    generos = new ArvoresGeneros();
  }

  public void cadastrarGenero(String nome) throws Exception {
    Genero novoGenero = new Genero(nome);
    generos.adicionarGenero(novoGenero, null);
  }

  public void cadastrarGenero(String nome, Integer idGeneroPai) throws Exception {
    Genero novoGenero = new Genero(nome);
    generos.adicionarGenero(novoGenero, idGeneroPai);
  }

  public void cadastrarDisco(String titulo, int ano) {
    Disco novoDisco = new Disco(titulo, ano);
    novoDisco.setIdDisco(todosDiscos.size() + 1);
    todosDiscos.put(novoDisco.getIdDisco(), novoDisco);
  }

  public void cadastrarDisco(String titulo, int ano, Integer idGenero) throws Exception {
    Disco novoDisco = new Disco(titulo, ano, idGenero);
    novoDisco.setIdDisco(todosDiscos.size() + 1);
    generos.adicionarDisco(novoDisco);
    todosDiscos.put(novoDisco.getIdDisco(), novoDisco);
  }
}
