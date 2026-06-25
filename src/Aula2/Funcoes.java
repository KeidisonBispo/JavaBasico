package Aula2;

public class Funcoes {
    public static void main (String [] args){
        int a = 10;
        int b = 12;
        int c= 12;
        int d = 67;
        int e= 45;
        int f = 23;

        int resultado = a +b;
        System.out.println("O resultado é:"+ resultado);
        System.out.println("O resultado é: " + somar(e, f));
        dizerOi();
    }
        public static int somar (int num1, int num2){
            return num1 + num2;
        }
        public static void dizerOi() {
        System.out.println("Oi");
        }
}
