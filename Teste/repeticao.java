public class repeticao{

    public static void main(String[] args){
        System.out.println("Estrutura de Repetição");
        // Algo que se repete
        // while
        int flag=10;
        while(flag <= 5){
            System.out.println("Entrou while. Flag: "+flag);
            flag++;
        }

        //do - while
        flag=10;
        do{
            System.out.println("Entrou do-while. Flag: "+flag);
            flag++;
        }while(flag <= 5);

        //for
        for(flag=0;flag <= 5; flag++){
            System.out.println("Entrou for. Flag: "+flag);
        }




    }
}