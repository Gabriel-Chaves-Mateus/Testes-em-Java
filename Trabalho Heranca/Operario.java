public class Operario extends Empregado{

    private float valorProducao;
    private float comissaoOperario;


    public float getValorProducao(){
        return this.valorProducao;
    }

    public void setValorProducao(float valorProducao){
        this.valorProducao = valorProducao; // A pessoa colocará um numero inteiro de 0 a 100;
    }

    public float getComissaoOperario(){
        return this.comissaoOperario;
    }

    public void setComissaoOperario(float comissaoOperario){
        this.comissaoOperario = comissaoOperario;
    }
 
    public void status(){
        System.out.println("================ Arquivo OPERARIO ==========================");
        System.out.println("                                                ");
        System.out.println("O valor de producao e: "+this.getValorProducao()+".");
        System.out.println("A comissao do operario e: "+this.getComissaoOperario()+".");
        System.out.println("                                                ");
    }

}