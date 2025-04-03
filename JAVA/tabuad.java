import java.util.Scanner;//importação da classe scanner

public class tabuad{

    public static void main(String[] args){
        System.out.println("Tabuada");
        //int num = Integer.parseInt(args[0]);

        //Instanciar a classe Scanner
        Scanner meuObj = new Scanner(System.in);
        int num=0;
        int i = 0;
        int opcao=0;

        do{
            System.out.println("Digite um número: ");
            num = meuObj.nextInt();//Leitura do input

            for(i=0;i<=10;i++){
                System.out.println(num+" x "+i+" = "+(num*i));
            }

            System.out.println("Deseja continuar[0=Sair / 1=Continuar]: ");
            opcao = meuObj.nextInt();

        }while(opcao != 0);
    }
}