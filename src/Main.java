import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso;
        double altura;
        double indice;
        System.out.println("digite su peso ");
        peso = teclado.nextInt();
        System.out.println("digite su altura ");
        altura = teclado.nextDouble();
        indice = peso / (altura * altura);
        System.out.println("su indice de masa corporal es de:"+indice);
        if (indice <= 18.5) {
            System.out.println("su peso es bajo");
        } else if (indice <= 24.9) {
            System.out.println("su peso es normal");
        } else if (indice <= 26.9) {
            System.out.println("tiene sobrepeso grado 1");
        } else if (indice <= 29.9) {
            System.out.println("tiene sobrepeso grado 2");
        } else if (indice <= 34.9) {
            System.out.println("tiene obesidad tipo 1");
        } else if (indice <= 39.9) {
            System.out.println("tiene obesidad tipo 2");
        } else if (indice <= 49.9) {
            System.out.println("tiene obseidad de tipo 3");
        } else if (indice >= 50) {
            System.out.println("usted tiene obseidad extrema, se puede morir por gordo");
        } else {
            System.out.println("error");
        }
    }
}



