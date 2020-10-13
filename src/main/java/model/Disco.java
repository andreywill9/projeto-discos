package model;

public class Disco {

  private String titulo;
  private int ano, idDisco;
  private Integer idGenero;
  
  public Disco() {}

  public Disco(String titulo, int ano, int idDisco, Integer idGenero) {
    this.titulo = titulo;
    this.ano = ano;
    this.idDisco = idDisco;
    this.idGenero = idGenero;
  }

  public Disco(String titulo, int ano, int idDisco) {
    this.titulo = titulo;
    this.ano = ano;
    this.idDisco = idDisco;
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
