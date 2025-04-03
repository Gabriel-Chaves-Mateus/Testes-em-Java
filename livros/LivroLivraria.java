public class LivroLivraria extends Livro{
    private double preco;
    private boolean novo;
    private String local;

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public boolean getNovo(){
        return this.novo;
    }

    public void setNovo(boolean novo){
        this.novo = novo;
    }

    public String getLocal(){
        return this.local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String Ler(){
        return "Ler Livro de Livraria";
    }

    public void cadastrarLivro(){

    }

    public void localizarLivro(){

    }

    public void vender(){

    }
}