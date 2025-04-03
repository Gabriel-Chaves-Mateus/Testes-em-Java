public class Livro{
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected String editora;
    protected int nrpaginas;
    protected int edicao;
    protected String categoria;

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditora(){
        return this.editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public int getNrpaginas(){
        return this.nrpaginas;
    }

    public void setNrpaginas(int nrpaginas){
        this.nrpaginas = nrpaginas;
    }

    public int getEdicao(){
        return this.edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    //Métodos
    public String Ler(){
        return "Ler livro";
    }

    public void cadastrarLivro(){

    }

    public void localizarLivro(){

    }
}