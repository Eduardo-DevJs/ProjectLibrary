package DAO;
import MODELS.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioBiblioteca {
    Connection connection;

    public ResultSet autenticacaoUsuario(Usuario users) throws Exception {
        connection = CONEXAO.Conexao.createConnectionMySQL();

        try {
            String sql = "SELECT * FROM usuarios WHERE nome_usuario =? and senha_usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, users.getNome());
            preparedStatement.setString(2, users.getSenha_usuario());
            
            ResultSet resultSet = preparedStatement.executeQuery();
  
            return resultSet;

        } catch (SQLException exception) {
            System.out.println("Erro " + exception);
            return null;
        }
    }
    
}
