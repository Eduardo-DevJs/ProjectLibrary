package DAO;

import MODELS.Livro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class LivroBiblioteca {

    public void CadastroLivro(Livro livro) {
        String sql = "INSERT INTO livros (titulo, autor, genero ,data_cadastro, ano_publicacao) VALUES (?,?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {

            con = CONEXAO.Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getGenero());
            ps.setString(4, livro.getData_cadastro());
            ps.setInt(5, livro.getAno_publicacao());

            ps.execute();

        } catch (Exception e) {
            System.out.println("Erro cadastro de livro: " + e);
        }
    }

    public List<Livro> mostrarLivros() {
        String sql = "SELECT * FROM livros";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<Livro> livros = new ArrayList<Livro>();

        try {
            con = CONEXAO.Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Livro livro = new Livro();

                livro.setId_livro(rs.getInt("id_livro"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setGenero(rs.getString("genero"));
                livro.setData_cadastro(rs.getString("data_cadastro"));
                livro.setAno_publicacao(rs.getInt("ano_publicacao"));

                livros.add(livro);
            }

        } catch (Exception e) {
            System.out.println("Erro ao mostrar livros: " + e);
        }

        return livros;
    }

    public void AtualizarLivros(Livro livros) {
        String sql = "UPDATE livros SET titulo = ?, autor = ?, genero = ? ,data_cadastro=?, ano_publicacao=? WHERE id_livro=?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, livros.getTitulo());
            preparedStatement.setString(2, livros.getAutor());
            preparedStatement.setString(3, livros.getGenero());

            preparedStatement.setString(4, livros.getData_cadastro());
            preparedStatement.setInt(5, livros.getAno_publicacao());

            preparedStatement.setInt(6, livros.getId_livro());

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro atualizacao de livro:  " + e);
        }
    }

    public void DeletarLivro(int id) {
        String sql = "DELETE FROM livros WHERE id_livro =?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = CONEXAO.Conexao.createConnectionMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro delete livro " + e);
        }
    }

}
