
package DAO;
import MODELS.Genero;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class GeneroDAO {
    public List<Genero> mostrarGeneros(){
        String sql = "SELECT * FROM generos";
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<Genero> generos = new ArrayList<Genero>();
        
        try {
            con = CONEXAO.Conexao.createConnectionMySQL();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Genero genero = new Genero();
                
                genero.setId_genero(rs.getInt("id_genero"));
                genero.setGenero(rs.getString("genero"));
                
                generos.add(genero);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao mostrar generos: " + e);
        }
        
        return generos;
    }
}
