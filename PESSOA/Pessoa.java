public class Pessoa{
    //Atributos
    private String nome;
    private String cpf;
    private String email;
    private double altura;
    private double peso;

    Pessoa(){
        this.peso = 80;
    }

    Pessoa(double altura){
        this.altura = altura;
    }

    Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    Pessoa(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    //Metodos
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCPF(){
        return this.cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

}