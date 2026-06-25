package Aula3;

public class TesteAnimal {
    public static void main (String [] args) {
        Animal animal1 = new Animal("Rex", 2.5, "Mamifero");
        System.out.println(animal1.getNome());
        System.out.println(animal1.getIdade());
        System.out.println(animal1.getTipo());

        Cachorro meuCachorro = new Cachorro("Lupita", 2.6, "Mamifero");
        meuCachorro.fazerSom();

        Gato meuGato = new Gato("Pelo",1.6, "Mamifero");
        System.out.println(meuGato.getNome());
        System.out.println(meuGato.getIdade());
        System.out.println(meuGato.getTipo());
        meuGato.fazerSom();
    }
}
