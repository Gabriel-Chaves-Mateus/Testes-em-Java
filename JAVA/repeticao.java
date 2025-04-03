public class repeticao{

    public static void main(String[] args){
        System.out.println("Estrutura de repetição");
        //Algo que se repete
        //while / for / do-while
        int flag=0;
        while(flag <= 10){
            System.out.println("Entrou while. Flag: "+flag);
            flag ++;
        }

        //do - while
        flag=0;
        do{
            System.out.println("Entrou do while. Flag: "+flag);
            flag++;
        }while(flag <= 10);
        
        //for
        for(flag=0;flag <= 5; flag++){
            System.out.println("Entrou for. Flag: "+flag);
        }
    }
}