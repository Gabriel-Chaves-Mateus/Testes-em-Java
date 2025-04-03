public class exemplo01{

    public static void main(String[] args){
        //Este é um comentário
        /*
        Este é um comentário
        porém que pode ser usado
        em mais linhas
        */

        String argumento1 = args[0];
        String argumento2 = args[1];

        System.out.println("Argumento[0] = "+argumento1);
        System.out.println("Argumento[1] = "+argumento2);

        String nome = "Gabriel Chaves Mateus";
        char letra = 'B';
        int idade = 16;
        float salario = (float)100.60;
        double gasolina = 500.50;
        boolean aluno = true; //false

        System.out.println("Nome: "+ nome);
        System.out.println("Letra: "+ letra);
        System.out.println("Idade: "+ idade);
        System.out.println("Salafrio: "+ salario);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Aluno: "+ aluno);
    }
}