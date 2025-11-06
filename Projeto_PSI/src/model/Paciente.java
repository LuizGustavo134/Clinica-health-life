package model;

public class Paciente {
     private String nome;
    private int idade;
    private int cpf;
    private int sus;

    public Paciente(String nome,int idade,int sus, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sus = sus;
        this.cpf = cpf;

    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getSUS() { return sus; }
    public int getCpf() { return cpf; }
}
