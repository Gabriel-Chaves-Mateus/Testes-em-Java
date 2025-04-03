import java.util.Scanner;

public class ex08{

    public static void main(String[] args){
    
        Scanner meuObj = new Scanner(System.in);
        int num=0;
        int num1=0;
            System.out.println("Quanto você ganha por hora?");
            num = meuObj.nextInt();
            System.out.println("Quantas horas trabalhadas no mês?");  
            num1 = meuObj.nextInt();
            System.out.println("O salário no final do mês é: "+(num*num1));
    } 
}