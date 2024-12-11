package com.meuapp;

import java.sql.*;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para cadastrar um usuário
    public void cadastrarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO Usuarios (nome, sobrenome, email, senha, setor) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getSetor());
            stmt.executeUpdate();
        }
    }

    // Método para autenticar o usuário
    public Usuario autenticar(String email, String senha) throws SQLException {
        String sql = "SELECT * FROM Usuarios WHERE email = ? AND senha = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("sobrenome"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("setor")
                );
            }
        }
        return null;
    }
}
