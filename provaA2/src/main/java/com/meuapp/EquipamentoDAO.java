package com.meuapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoDAO {
    private Connection connection;

    public EquipamentoDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para cadastrar um equipamento
    public void cadastrarEquipamento(Equipamento equipamento) throws SQLException {
        String sql = "INSERT INTO Equipamentos (nome, modelo, idade_mes, usuario_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, equipamento.getNome());
            stmt.setString(2, equipamento.getModelo());
            stmt.setInt(3, equipamento.getIdadeMes());
            stmt.setInt(4, equipamento.getUsuarioId());
            stmt.executeUpdate();
        }
    }

    // Método para listar equipamentos de um usuário
    public List<Equipamento> listarEquipamentosPorUsuario(int usuarioId) throws SQLException {
        List<Equipamento> equipamentos = new ArrayList<>();
        String sql = "SELECT * FROM Equipamentos WHERE usuario_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, usuarioId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Equipamento equipamento = new Equipamento(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("modelo"),
                    rs.getInt("idade_mes"),
                    rs.getInt("usuario_id")
                );
                equipamentos.add(equipamento);
            }
        }
        return equipamentos;
    }
}
