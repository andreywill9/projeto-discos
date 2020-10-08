package model;

import java.util.List;

public class Disco {

  private String titulo;
  private List<Artista> artistas;
  private int ano, idDisco;
  private List<Musica> musicas;
  private Integer idGenero;
  
  private Disco() {}

  private Disco(String titulo, List<Artista> artistas, Integer ano, List<Musica> musicas) {
    this.titulo = titulo;
    this.artistas = artistas;
    this.ano = ano;
    this.musicas = musicas;
  }

  private Disco(String titulo, Integer ano) {
    this.titulo = titulo;
    this.ano = ano;
  }

  private Disco(String titulo, List<Artista> artistas, Integer ano) {
    this.titulo = titulo;
    this.artistas = artistas;
    this.ano = ano;
  }

  private Disco(String titulo, Integer ano, List<Musica> musicas) {
    this.titulo = titulo;
    this.ano = ano;
    this.musicas = musicas;
  }

  private Disco(int idDisco, String titulo, List<Artista> artistas, Integer ano, List<Musica> musicas) {
    this.idDisco = idDisco;
    this.titulo = titulo;
    this.artistas = artistas;
    this.ano = ano;
    this.musicas = musicas;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public List<Artista> getArtistas() {
    return artistas;
  }

  public void setArtistas(List<Artista> artistas) {
    this.artistas = artistas;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public List<Musica> getMusicas() {
    return musicas;
  }

  public void setMusicas(List<Musica> musicas) {
    this.musicas = musicas;
  }

  private Integer getQuantidadeMusicas() {
    return musicas != null ?
        musicas.size() : null;
  }

  public int getIdDisco() {
    return idDisco;
  }

  public Integer getIdGenero() {
    return idGenero;
  }

  public void setIdGenero(Integer idGenero) {
    this.idGenero = idGenero;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Disco disco = (Disco) o;

    return idDisco == disco.idDisco;
  }

  @Override
  public int hashCode() {
    return idDisco;
  }
}
