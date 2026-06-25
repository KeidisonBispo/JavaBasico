package Aula2;

public class Calculadora {

    public  Calculadora (){

    }
    public double somar (double num1, double num2){
        return num1 + num2;
    }
    public double subtracao (double num1, double num2){
        return num1 - num2;
    }
    public double mutiplicar (double num1, double num2){
        return num1 * num2;
    }

    public double dividir (double num1, double num2){
        return num1 / num2;
    }
    public double potencia (double num1, double num2){
        return Math.pow(num1,num2);
    }
}
