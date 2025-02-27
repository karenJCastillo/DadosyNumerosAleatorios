import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int rondas;
        int dado1;
        int dado2;
        int contadordado1 =0;
        int contadordado2 =0;

        Random ale = new Random();
        rondas = ale.nextInt((max - min + 1)) + min;
        for (int i = 1; i <= rondas; i++) {
            dado1 = ale.nextInt((6 - 1 + 1)) + 1;
            contadordado1+=dado1; //significa que tomara la variable de contador y lo sumara con los resultados del dado1
            System.out.println("el dado uno es de : " + dado1);
            dado2 = ale.nextInt((6 - 1 + 1)) + 1;
            contadordado2 +=dado2;
            System.out.println("el dado dos es de :" + dado2);
            System.out.println("el numero de ronas generadas es de "+i);


        }
        if (contadordado2<contadordado1){
            System.out.println("el dado uno es el ganador con : "+contadordado1+"puntos de sumatoria");
        }else {
            System.out.println("el dado dos es el ganador con : "+contadordado2+"puntos de sumatoria ");
        }



    }
}