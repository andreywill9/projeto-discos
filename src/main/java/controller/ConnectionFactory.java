package controller;

import java.sql.*;

public class ConnectionFactory {

  private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String ENDERECO_BANCO = "jdbc:mysql://localhost:3306";
  private static final String TIMEZONE_SSL = "useTimezone=true&serverTimezone=UTC&useSSL=false";
  private static final String BANCO = "lojaDiscos";
  private static final String USUARIO = "**USUARIO**";
  private static final String SENHA = "**SENHA**";

  private PreparedStatement preStatement;
  private Statement statement;
  private ResultSet result;
  private Connection con;

  public ConnectionFactory() {
    try {
      Class.forName(DRIVER);
      String configuracoesBanco = String.format("%s/%s?%s", ENDERECO_BANCO, BANCO, TIMEZONE_SSL);
      con = DriverManager.getConnection(configuracoesBanco, USUARIO, SENHA);
    } catch (SQLException e) {
      criarBanco();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void criarBanco() {
    try {
      Class.forName(DRIVER);
      String configuracoesBanco = String.format("?%s&user=%s&password=%s", TIMEZONE_SSL, USUARIO, SENHA);
      con = DriverManager.getConnection(ENDERECO_BANCO + configuracoesBanco);
      Statement s = con.createStatement();
      s.executeUpdate("CREATE DATABASE IF NOT EXISTS " + BANCO);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
