package model;

import java.util.Objects;

public class Artista {

  private int idArtista;
  private String nome, descricao;

  private Artista() {}

  private Artista(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
  }

  private Artista(int idArtista, String nome, String descricao) {
    this.idArtista = idArtista;
    this.nome = nome;
    this.descricao = descricao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getIdArtista() {
    return idArtista;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Artista artista = (Artista) o;
    return idArtista == artista.idArtista;
  }

  @Override
  public int hashCode() {
    return Objects.hash(idArtista);
  }
}
