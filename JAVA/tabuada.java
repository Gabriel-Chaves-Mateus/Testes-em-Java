public class tabuada{

    public static void main(String[] args){
        System.out.println("Tabuada");
        int num = Integer.parseInt(args[0]);

        int i=0;
        for(i=0;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }

    }
}