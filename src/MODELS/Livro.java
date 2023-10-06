
package MODELS;

public class Livro {
    private int id_livro;
    private String titulo;
    private String autor;
    private String genero;
    private String data_cadastro;
    private int ano_publicacao;
    
    public Livro (){}


    public Livro(int id_livro, String titulo, String autor, String genero, String data_cadastro, int ano_publicacao) {
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.data_cadastro = data_cadastro;
        this.ano_publicacao = ano_publicacao;
    }
    
    

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
