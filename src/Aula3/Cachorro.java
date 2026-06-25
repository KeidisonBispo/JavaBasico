package Aula3;

public class Cachorro extends Animal{
    public Cachorro (String nome, double idade, String tipo){
        super(nome,idade,tipo);
    }
    public void fazerSom (){
        System.out.println("Uau Uau!!");
    }

}
