package Aula3;

public class Animal {
    private String nome;
    private double idade;
    private String tipo;

    public Animal (String nome, double idade, String tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void  setTipo(String tipo) {
        this.tipo = tipo;
    }
}

