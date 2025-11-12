package model;

public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private int sus;

    public Pessoa(String nome,int idade,int sus, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sus = sus;
        this.cpf = cpf;
    }
    public String getNome(){ return nome ;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return  idade; }
    public void setIdade( int idade ) { this.idade = idade; }

    public int getSus() {return sus;}
    public void setSus( int sus ){ this.sus = sus;}

    public int getCpf() {return cpf;}
    public void setCpf() {this.cpf = cpf;}
}