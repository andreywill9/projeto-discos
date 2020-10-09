package controller;

public enum Tabelas {

  ARTISTAS(
      "artistas",
      "create table artistas(id_artista int not null auto_increment," +
          "nome varchar(30) not null, descricao varchar(200), primary key(id_artista))"),
  GENEROS(
      "generos",
      "create table generos(id_genero int not null auto_increment," +
          "nome varchar(20) not null, id_genero_pai int, primary key(id_genero))"),
  DISCOS(
      "discos",
      "create table discos(id_disco int not null auto_increment, titulo varchar(30) not null," +
          "ano int not null, id_genero int, primary key(id_disco), foreign key(id_genero) references generos(id_genero))"
  ),
  ARTISTA_DISCO(
      "artista_disco",
      "create table artista_disco(id_artista int not null, id_disco int not null," +
          "foreign key(id_artista) references artistas(id_artista), foreign key(id_disco) references discos(id_disco))"
  ),
  MUSICA_DISCO(
      "musica_disco",
      "create table musica_disco(nome varchar(30) not null, duracao float," +
          "id_disco int not null, foreign key(id_disco) references discos(id_disco))"
  );

  public String nome;
  public String script;

  Tabelas(String nome, String script) {
    this.nome = nome;
    this.script = script;
  }
}
