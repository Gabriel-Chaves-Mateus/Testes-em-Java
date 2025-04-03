public class Administrador extends Empregado{

private String ajudaDeCusto;

    public String getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }

    public void setAjudaDeCusto(String ajudaDeCusto){
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //Método

    public void status(){
        System.out.println("================ Arquivo ADMINISTRADOR ==========================");
        System.out.println("                                                ");
        System.out.println("A ajuda de custo auxilia com: "+this.getAjudaDeCusto()+".");
        System.out.println("Compre com a gente suas "+this.getAjudaDeCusto()+".");
        System.out.println("                                                ");
    }

    public String Horas_de_Almoco(){
        return ("Uma hora e meia de almoço"); //Polimorfismo de qtde de horas para lanchar;
    }

    public void Pegar_Cafe(){ 

    } //Polimorfismo

    public void Pegar_Marmita(){
        
    } //Polimorfismo

}
