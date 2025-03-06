import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int signo;


        while (true) {
            System.out.println("digite el primer numero a operar");
            num1 = teclado.nextInt();
            System.out.println("digite el operador a utilizar escribiendo el numero al que es igual : + = 1, - = 2, * = 3, / = 4, ^ = 5, % = 6 , 7 = salir");
            signo = teclado.nextInt();
            if (signo == 7){
                System.out.println("Esta terminando el proceso...");
                break;
            }
            double resultado = switch (signo) {
                case 1 -> {
                    System.out.println("digite el segundo numero a operar");
                    num2 = teclado.nextInt();
                    yield num1 + num2;
                }

                case 2 -> {

                    System.out.println("digite el segundo numero a operar");
                    num2 = teclado.nextInt();
                    yield num1 - num2;
                }
                case 3 -> {
                    System.out.println("digite el segundo numero a operar");
                    num2 = teclado.nextInt();
                    yield num1 * num2;
                }
                case 4 -> {
                    System.out.println("digite el segundo numero a operar");
                    num2 = teclado.nextInt();
                    yield num1 / num2;
                }
                case 5 -> Math.pow(num1, 2);
                case 6 -> {
                    System.out.println("digite el segundo numero a operar");
                    num2 = teclado.nextInt();
                    yield num1 % num2;
                }
                default -> 0.0;
            };
            System.out.println("resultado" + resultado);


        }

    }

}





