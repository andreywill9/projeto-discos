package model;

import java.util.ArrayList;
import java.util.List;

public class Genero {

  private int idGenero;
  private String nome;
  private List<Integer> idsDiscos;
  private List<Genero> subgeneros;
  private String nomeGeneroPai;

  public Genero() {
    subgeneros = new ArrayList<>();
  }

  public Genero(String nome, Genero generoPai) {
    this.nome = nome;
    subgeneros = new ArrayList<>();
    idsDiscos = new ArrayList<>();
    nomeGeneroPai = generoPai != null ?
        generoPai.nome :
        null;
  }

  public Genero(String nome, List<Genero> subgeneros, Genero generoPai) {
    this.nome = nome;
    this.subgeneros = subgeneros;
    idsDiscos = new ArrayList<>();
    nomeGeneroPai = generoPai != null ?
        generoPai.nome :
        null;
  }

  public Genero(String nome, List<Integer> idsDiscos, List<Genero> subgeneros, Genero generoPai) {
    this.nome = nome;
    this.idsDiscos = idsDiscos;
    this.subgeneros = subgeneros;
    nomeGeneroPai = generoPai != null ?
        generoPai.nome :
        null;
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

  public void setIdGenero(int idGenero) {
    this.idGenero = idGenero;
  }

  public void adicionarSubgenero(Genero novoSubgenero) {
    subgeneros.add(novoSubgenero);
  }

  public boolean possuiSubgenero() {
    return !subgeneros.isEmpty();
  }

  public String getNomeGeneroPai() {
    return nomeGeneroPai;
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

  @Override
  public String toString() {
    return nome;
  }
}
