package model;

import java.util.List;

public class Genero {

  private int idGenero;
  private String nome;
  private List<Integer> idsDiscos;
  private Integer idGeneroPai;
  private List<Integer> idsSubgeneros;

  private Genero() {}

  private Genero(String nome) {
    this.nome = nome;
  }

  private Genero(int idGenero, String nome, List<Integer> idsDiscos, Integer idGeneroPai, List<Integer> idsSubgeneros) {
    this.idGenero = idGenero;
    this.nome = nome;
    this.idsDiscos = idsDiscos;
    this.idGeneroPai = idGeneroPai;
    this.idsSubgeneros = idsSubgeneros;
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

  public Integer getIdGeneroPai() {
    return idGeneroPai;
  }

  public void setIdGeneroPai(Integer idGeneroPai) {
    this.idGeneroPai = idGeneroPai;
  }

  public List<Integer> getIdsSubgeneros() {
    return idsSubgeneros;
  }

  public void setIdsSubgeneros(List<Integer> idsSubgeneros) {
    this.idsSubgeneros = idsSubgeneros;
  }

  public int getIdGenero() {
    return idGenero;
  }
}
