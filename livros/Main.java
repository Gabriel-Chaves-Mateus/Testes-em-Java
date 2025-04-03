import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        //Cadastro LivroLivraria
        System.out.println("########################");
        System.out.println("## CADASTRO DE LIVROS ##");
        System.out.println("########################");

        LivroLivraria lv = new LivroLivraria();
        System.out.println("Digite o codigo do livro:");
        lv.setCodigo(entrada.nextInt());

        System.out.println("Digite o título do livro:");
        lv.setTitulo(entrada.nextLine());

        System.out.println("Digite o autor do livro:");
        lv.setAutor(entrada.nextLine());

        System.out.println("Digite o preço do livro:");
        lv.setPreco(entrada.nextDouble());



        //Instanciar a classe livro
        /*Livro livro = new Livro();
        livro.codigo = 1;
        livro.titulo = "Branca de Neve";
        livro.autor = "Mickey";
        livro.nrpaginas = 666;
        livro.edicao = 1;

        System.out.println("Livro: "+livro.codigo);
        System.out.println("Título: "+livro.titulo);
        System.out.println("Mensagem: "+livro.Ler());

        //Instanciar a classe livro de livraria
        LivroLivraria livrolivraria = new LivroLivraria();
        livrolivraria.codigo = 2;
        livrolivraria.titulo = "Harry Potter";
        livrolivraria.autor = "J. K. Rowling";
        livrolivraria.nrpaginas = 667;
        livrolivraria.edicao = 59;

        System.out.println("Livro: "+livrolivraria.codigo);
        System.out.println("Título: "+livrolivraria.titulo);
        System.out.println("Mensagem: "+livrolivraria.Ler());
        */
    }
}