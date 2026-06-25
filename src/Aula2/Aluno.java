package Aula2;

public class Aluno extends Pessoa{
    private int matricula;
    private int numeroDiciplinas;

    public Aluno (String nome, int matricula, int numeroDiciplinas, int idade, double altura) {
        super(nome, idade, altura);
        this.matricula = matricula;
        this.numeroDiciplinas = numeroDiciplinas;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNumeroDiciplinas() {
        return numeroDiciplinas;
    }

    public void setNumeroDiciplinas(int numeroDiciplinas) {
        this.numeroDiciplinas = numeroDiciplinas;
    }

    public void novaMatricula(int matricula){
        this.matricula = this.matricula + matricula;
        System.out.println("A nova matricula é :" + matricula);
    }
}

