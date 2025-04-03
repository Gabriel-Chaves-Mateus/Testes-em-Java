public class Atleta extends Pessoa{
    private double imc;

    Atleta(String nome, double peso, double altura){
        super(nome, peso, altura);
    }
    
    public void calculoIMC(){
        double calculo = getPeso() / (getAltura() * getAltura());
        this.imc = calculo;
    }

    public double getIMC(){
        return this.imc;
    }
}