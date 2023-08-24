import java.util.Scanner;

public class raizCuadrada {
    public static void main(String[] args) {



        Scanner s = new Scanner (System.in);

        try {
            System.out.println("Ingrese un numero: ");
            double numero = s.nextDouble();

            if (numero < 0){
                throw new NumeroNegativoExcepcion();
            }

            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de" + numero + " es: " + raizCuadrada);

        }catch (NumeroNegativoExcepcion e) {
            System.out.println("Ingrese un valor válido");

        }



    }



}