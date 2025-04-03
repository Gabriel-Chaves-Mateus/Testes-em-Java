public class calculadora{

    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        char operacao = args[2].charAt(0); //+ - / *

        if (operacao == '+'){
            System.out.println("Adição: "+(num1+num2));
        } else if(operacao == '-'){
            System.out.println("Subtração: "+(num1-num2));
        } else if(operacao == 'c'){
            System.out.println("Multiplicação: "+(num1*num2));
        } else if(operacao == '/'){
            System.out.println("Divisão: "+(num1/num2));
        } else {
            System.out.println("Operação Inválida!!");
        }

    }
}