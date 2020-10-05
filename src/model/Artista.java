package model;

import java.util.Objects;

public class Artista {

  private String nome, descricao;

  private Artista() {}

  private Artista(String nome, String descricao) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Artista artista = (Artista) o;
    return nome.equals(artista.nome) &&
        Objects.equals(descricao, artista.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, descricao);
  }
}
