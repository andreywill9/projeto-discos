package model;

import java.util.List;

public class Genero {

  private int idGenero;
  private String nome;
  private List<Integer> idsDiscos;

  private Genero() {}

  private Genero(String nome) {
    this.nome = nome;
  }

  private Genero(int idGenero, String nome, List<Integer> idsDiscos) {
    this.idGenero = idGenero;
    this.nome = nome;
    this.idsDiscos = idsDiscos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Integer> getIdsDiscos() {
    return idsDiscos;
  }

  public void setIdsDiscos(List<Integer> idsDiscos) {
    this.idsDiscos = idsDiscos;
  }
}
