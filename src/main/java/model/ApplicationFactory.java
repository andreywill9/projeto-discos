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
}
