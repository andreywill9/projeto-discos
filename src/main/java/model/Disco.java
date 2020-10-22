package model;

public class Disco {

  private String titulo;
  private int ano, idDisco;
  private Genero genero;
  
  public Disco() {}

  public Disco(String titulo, int ano, int idDisco, Genero genero) {
    this.titulo = titulo;
    this.ano = ano;
    this.idDisco = idDisco;
    this.genero = genero;
  }

  public Disco(String titulo, int ano, Genero genero) {
    this.titulo = titulo;
    this.ano = ano;
    this.genero = genero;
  }

  public Disco(String titulo, int ano) {
    this.titulo = titulo;
    this.ano = ano;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getIdDisco() {
    return idDisco;
  }

  public void setIdDisco(int idDisco) {
    this.idDisco = idDisco;
  }

  public Genero getGenero() {
    return genero;
  }

  public void setIdGenero(Genero genero) {
    this.genero = genero;
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

  @Override
  public String toString() {
    String nomeGenero = genero != null ?
        genero.getNome() :
        "";
    return titulo.concat(", ").concat(String.valueOf(ano)).concat(", " + nomeGenero);
  }
}
