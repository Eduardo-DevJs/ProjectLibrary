
package MODELS;

public class Usuario {
    private int id_usuario;
    private String nome;
    private String senha_usuario;
    
    public Usuario (){}

    public Usuario(int id_usuario, String nome, String senha_usuario) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.senha_usuario = senha_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    
    
}
