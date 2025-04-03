public class Main{

    public static void main(String[] args){
        System.out.println("Classe Pessoa");
        
        Atleta atleta = new Atleta("Marcelo", 78, 1.74);
        atleta.calculoIMC();
        System.out.println("Nome: "+atleta.getNome());
        System.out.println("IMC: "+atleta.getIMC());

        /*Pessoa pessoa = new Pessoa();
        pessoa.setCPF("004.000.000-00");
        pessoa.setNome("Gabriel Chaves Mateus");
        pessoa.setPeso(50);

        System.out.println("Olá, eu sou uma pessoa!");
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("CPF: "+pessoa.getCPF());
        System.out.println("Peso: "+pessoa.getPeso());

        Pessoa pessoa2 = new Pessoa(100);
        System.out.println("Altura: "+pessoa2.getAltura());

        Pessoa pessoa3 = new Pessoa("João da Silva", "001.000.000-00");
        System.out.println("Nome: "+pessoa3.getNome());
        System.out.println("CPF: "+pessoa3.getCPF());*/

    }
}