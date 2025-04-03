public class LivroBiblioteca extends Livro{

    private String local;
    private int prazo;
    private String locador;

    public String getLocal(){
        return this.local;
    }

    public void setLocal(String Local){
        this.local = local;
    }

    public int getPrazo(){
        return this.prazo;
    }

    public void setPrazo(int prazo){
        this.prazo = prazo;
    }

    public String getLocador(){
        return this.locador;
    }

    public void setLocador(String locador){
        this.locador = locador;
    }

    public String Ler(){
        return "Livro de Biblioteca";
    }

    public void cadastrarLivro(){

    }

    public void localizarLivro(){

    }

    public void alugarLivro(){

    }

    public void devolverLivro(){

    }
}