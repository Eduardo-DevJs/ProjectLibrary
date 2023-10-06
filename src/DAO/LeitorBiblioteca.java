package DAO;

import MODELS.Leitor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LeitorBiblioteca {

    public void CadastrarLeitor(Leitor leitor) {
        String sql = "INSERT INTO leitores (nome,data_cadastro,cpf,telefone,email) VALUES (?,?,?,?,?)";

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = CONEXAO.Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, leitor.getNome());
            ps.setString(2, leitor.getData_cadastro());
            ps.setString(3, leitor.getCpf());
            ps.setString(4, leitor.getTelefone());
            ps.setString(5, leitor.getEmail());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Cadastrado sucesso!");
        } catch (Exception e) {
            System.out.println("Erro cadastro Leitor: " + e);
        }
    }

    public List<Leitor> mostrarLeitores() {
        String sql = "SELECT * FROM leitores";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<Leitor> leitores = new ArrayList<Leitor>();
        
        try {
            con = CONEXAO.Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Leitor leitor = new Leitor();
                
                leitor.setId_leitor(rs.getInt("id_leitor"));
                leitor.setNome(rs.getString("nome"));
                leitor.setData_cadastro(rs.getString("data_cadastro"));
                leitor.setCpf(rs.getString("cpf"));
                leitor.setTelefone(rs.getString("telefone"));
                leitor.setEmail(rs.getString("email"));
                
                leitores.add(leitor);
            }
        } catch (Exception e) {
            System.out.println("Erro Mostrar leitor " + e);
        }
        
        return leitores;
    }
}
