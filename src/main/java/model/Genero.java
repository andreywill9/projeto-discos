package model;

import java.util.ArrayList;
import java.util.List;

public class Genero {

  private int idGenero;
  private String nome;
  private List<Integer> idsDiscos;
  private List<Genero> subgeneros;

  private Genero() {
    subgeneros = new ArrayList<>();
  }

  private Genero(String nome) {
    this.nome = nome;
    subgeneros = new ArrayList<>();
  }

  private Genero(int idGenero, String nome, List<Integer> idsDiscos, List<Genero> subgeneros) {
    this.idGenero = idGenero;
    this.nome = nome;
    this.idsDiscos = idsDiscos;
    this.subgeneros = subgeneros;
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

  public void adicionarDisco(Integer idDisco) {
    idsDiscos.add(idDisco);
  }

  public List<Genero> getSubgeneros() {
    return subgeneros;
  }

  public void setSubgeneros(List<Genero> subgeneros) {
    this.subgeneros = subgeneros;
  }

  public int getIdGenero() {
    return idGenero;
  }

  public void adicionarSubgenero(Genero novoSubgenero) {
    subgeneros.add(novoSubgenero);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Genero genero = (Genero) o;

    return idGenero == genero.idGenero;
  }

  @Override
  public int hashCode() {
    return idGenero;
  }
}
