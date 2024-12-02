import java.sql.*;
import java.util.*;

public class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produtos(tipo, descricao, peso, quantidade, unidadeMedida) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getTipo());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPeso());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setString(5, produto.getUnidadeMedida());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Produto produto) {
        String sql = "UPDATE produtos SET tipo = ?, descricao = ?, peso = ?, quantidade = ?, unidadeMedida = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getTipo());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPeso());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setString(5, produto.getUnidadeMedida());
            stmt.setInt(6, produto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM produtos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> listar() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Produto produto = new Produto(
                    rs.getInt("id"),
                    rs.getString("tipo"),
                    rs.getString("descricao"),
                    rs.getDouble("peso"),
                    rs.getInt("quantidade"),
                    rs.getString("unidadeMedida")
                );
                produtos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public Produto obterDetalhes(int id) {
        String sql = "SELECT * FROM produtos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Produto(
                        rs.getInt("id"),
                        rs.getString("tipo"),
                        rs.getString("descricao"),
                        rs.getDouble("peso"),
                        rs.getInt("quantidade"),
                        rs.getString("unidadeMedida")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
