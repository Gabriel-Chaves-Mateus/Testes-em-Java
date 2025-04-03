public class Empregado extends Pessoa{

    protected int codigoSetor;
    protected float salarioBase;
    protected float imposto;
    protected float salarioTotal;
 
    public int getCodigoSetor(){
        return this.codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }

    public float getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public float getImposto(){
        return this.imposto;
    }

    public void setImposto(float imposto){
        this.imposto = imposto/100 ; // A pessoa colocará um numero inteiro de 0 a 100;
    }

    //Método 

    public void status(){
        System.out.println("================ Arquivo EMPREGADO ==========================");
        System.out.println("                                                ");
        System.out.println("O codigo do setor e: "+this.getCodigoSetor()+".");
        System.out.println("O salario base e : "+this.getSalarioBase()+".");
        System.out.println("O imposto e: "+this.getImposto()+".");
        System.out.println("O Calculo do salario ficou: "+this.salarioTotal+".");
        this.Horas_de_Almoco(); // polimorfismo
        System.out.println("                                                ");
    }

    public void calcularSalario(){
        this.salarioTotal = this.getSalarioBase() - (this.getImposto()*this.getSalarioBase());
    }

    public String Horas_de_Almoco(){
        return ("Trinta minutos de almoço");   //Polimorfismo de qtde de horas para lanchar;
    }

    public void Pegar_Cafe(){

    } //Polimorfismo

    public void Pegar_Marmita(){
 
    } //Polimorfismo
 

}