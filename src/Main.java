import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        double dinero;
        int aleaotrio;
        int jugador;

        aleaotrio = ale.nextInt((3 - 1 + 1)) + 1;
        System.out.println("digite el dinero que quiere apostar");
        dinero = teclado.nextDouble();

        do {

            if (aleaotrio == 1) {
                System.out.println("se ha multiplicado su dinero");
                dinero = dinero * 2;
                System.out.println("su dinero es de:" + dinero);
                System.out.println("quieres seguir? para aceptar ingrese 1 si no ingrese 2");
                jugador = teclado.nextInt();
                if (jugador == 1) {
                    aleaotrio = ale.nextInt((3 - 1 + 1)) + 1;
                    continue;
                } else if (jugador == 0) {
                    System.out.println("su dinero es de:" + dinero);
                    break;
                }
                System.out.println("su dinero es de:" + dinero + "quiere seguir con el juego? para aceptar ingrese 1 si no ingrese 2");
            } else if (aleaotrio == 2) {
                System.out.println("se ha divido su dinero a la mitad");
                dinero = dinero / 2;
                System.out.println("su dinero es de:" + dinero);
                System.out.println("quieres seguir? para aceptar ingrese 1 si no ingrese 2");
                jugador = teclado.nextInt();
                if (jugador == 1) {
                    aleaotrio = ale.nextInt((3 - 1 + 1)) + 1;1

                    continue;
                } else if (jugador == 0) {
                    System.out.println("su dinero es de:" + dinero);
                    break;
                }
                System.out.println("su dinero es de:" + dinero + "quiere seguir con el juego?para aceptar ingrese 1 si no ingrese 2");
            } else if (aleaotrio == 3) {
                System.out.println("ha  perdido todo");
                dinero = dinero - dinero;
                System.out.println("su dinero es de:" + dinero);
            }
        } while (dinero > 0);

    }

}





