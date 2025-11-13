package model;

public class Paciente {
    private String nome;
    private int idade;
    private int cpf;
    private int Sus;
// para fazer consultas nunca esqueça o construtor vazio se não trava tudo
    public Paciente(){}

    public Paciente(String nome,int idade,int sus, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.Sus = Sus;
        this.cpf = cpf;

    }
    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sus=" + Sus +
                ", cpf=" + cpf +
                '}';
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public int getSus() { return Sus; }
    public int getCpf() { return cpf; }

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setSus(int sus) { this.Sus = sus; }
    public void setCpf(int cpf) { this.cpf = cpf; }
}
