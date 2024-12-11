package com.meuapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    private static final String URL = "jdbc:h2:mem:EquipamentosDB;DB_CLOSE_DELAY=-1";  // Banco em memória
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        
        // Criando tabelas se não existirem
        String createUsuariosTable = "CREATE TABLE IF NOT EXISTS Usuarios (" +
                                      "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                      "nome VARCHAR(100) NOT NULL, " +
                                      "sobrenome VARCHAR(100), " +
                                      "email VARCHAR(100) UNIQUE NOT NULL, " +
                                      "senha VARCHAR(255) NOT NULL, " +
                                      "setor VARCHAR(100));";
        String createEquipamentosTable = "CREATE TABLE IF NOT EXISTS Equipamentos (" +
                                         "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                         "nome VARCHAR(100) NOT NULL, " +
                                         "modelo VARCHAR(100), " +
                                         "idade_mes INT NOT NULL, " +
                                         "usuario_id INT, " +
                                         "FOREIGN KEY (usuario_id) REFERENCES Usuarios(id));";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createUsuariosTable);
            stmt.execute(createEquipamentosTable);
        }
        
        return connection;
    }
}
