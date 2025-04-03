public class Fornecedor extends Pessoa{

    private float valorCredito;
    private float valorDivida;
    private float saldo;

    public float getValorCredito(){
        return this.valorCredito;
    }

    public void setValorCredito(float valorCredito){
        this.valorCredito = valorCredito;
    }
    
    public float getValorDivida(){
        return this.valorDivida;
    }
    
    public void setValorDivida(float valorDivida){
        this.valorDivida = valorDivida;
    }

    //Método

    public void status(){
        System.out.println("================ Arquivo FORNECEDOR =======================");
        System.out.println("                                                ");
        System.out.println("O valor do credito e: "+this.getValorCredito()+".");
        System.out.println("O valor da divida  e: "+this.getValorDivida()+".");
        System.out.println("Seu saldo e "+this.saldo);      
        System.out.println("                                                ");
    } 

    public void obterSaldo(){
        this.saldo = this.getValorCredito() - this.getValorDivida();
    }
}
