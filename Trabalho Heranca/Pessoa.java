public class Pessoa{

protected String nome;
protected String endereco;
protected String telefone;

public String getNome(){
    return this.nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getEndereco(){
    return this.endereco;
}

public void setEndereco(String endereco){
    this.endereco = endereco;
}

public String getTelefone(){
    return this.telefone;
}

public void setTelefone(String telefone){
    this.telefone = telefone;
}

public void status(){
    System.out.println("================ Arquivo PESSOA ==========================");
    System.out.println("                                                ");
    System.out.println("O nome da pessoa e: "+this.getNome()+".");
    System.out.println("O endereco da pessoa e: "+this.getEndereco()+".");
    System.out.println("O telefone da pessoa e:"+this.getTelefone()+".");
    System.out.println("                                                ");
}

}
