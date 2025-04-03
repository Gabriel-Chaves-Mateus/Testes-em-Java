public class Vendedor extends Empregado{

    private float valorVendas;
    private float comissaoVendedor;

    public float getValorVendas(){
        return this.valorVendas;
    }

    public void setValorVendas(float valorVendas){
        this.valorVendas = valorVendas; // A pessoa colocará um numero inteiro de 0 a 100;
    }

    public float getComissaoVendedor(){
        return this.comissaoVendedor;
    }

    public void setComissaoVendedor(float comissaoVendedor){
        this.comissaoVendedor = comissaoVendedor;
    }

    public void status(){
        System.out.println("================ Arquivo VENDEDOR ==========================");
        System.out.println("                                                ");
        System.out.println(" O valor da venda foi de: "+this.getValorVendas()+".");
        System.out.println("A comissao do vendedor e: "+this.getComissaoVendedor()+".");
        System.out.println("                                                ");
    }

}