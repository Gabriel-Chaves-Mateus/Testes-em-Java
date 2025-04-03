public class Main {
    public static void main(String[]args){

        //Pessoa
        Pessoa pes = new Pessoa(); 
        pes.setNome("Marcelo Petri");
        pes.setEndereco("Rua Albano Schimicth");
        pes.setTelefone("(47) 92174-3756");
        pes.status();

        //Fornecedor
        Fornecedor forne = new Fornecedor();
        forne.setValorCredito(1000);
        forne.setValorDivida(400);
        forne.obterSaldo();
        forne.status();
        
        //Empregado
        Empregado empre = new Empregado();
        empre.setCodigoSetor(1);
        empre.setSalarioBase(6000);
        empre.setImposto(15);
        empre.calcularSalario();
        empre.status();

        //Administrador
        Administrador admin = new Administrador();
        admin.setAjudaDeCusto("Passagens aereas");
        admin.Horas_de_Almoco(); // polimorfismo
        admin.status();

        //Operário
        Operario operant = new Operario();
        operant.setValorProducao(20);
        operant.setComissaoOperario(2);
        operant.status();

        //Vendedor
        Vendedor vend = new Vendedor();
        vend.setValorVendas(80);
        vend.setComissaoVendedor(32);
        vend.status();

        System.out.println("================ FIM DOS ARQUIVOS ==========================");

        //Falta arrumar as comissoes, o calculo do salario e o saldo final


    }
}