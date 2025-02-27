import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner teclado = new Scanner(System.in);
        int numero;
        int usuario;
        int contador = 0;
        numero = ale.nextInt((50 - 1 + 1)) + 1;
        System.out.println(numero);
        while (contador < 3) {
            System.out.println("ingrese el numero ");
            usuario = teclado.nextInt();
            if (numero < usuario) {
                System.out.println("tu numero es menor");
            } else if (numero > usuario) {
                System.out.println("tu numero es mayor ");

            } else if (usuario == numero) {
                System.out.println("ganaste");
                break;

            }
            contador++;
            System.out.println("perdiste");
        }

    }
}