package Aula3;

public class Gato extends Animal{

    public Gato (String nome, double idade, String tipo){
        super(nome,idade,tipo);
    }
    public void fazerSom (){
        System.out.println("Miau Miau!");
    }
}
