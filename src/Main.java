import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Ingresa una cadena");
        String lectTeclado = s.nextLine();


        try {

            char resultado = caracterEn(lectTeclado, 7);
            System.out.println("El carácter en la posición 7 es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        s.close();

    }

    private static char caracterEn(String cadena, int entero) throws Exception {
        int longitud = cadena.length();

        if (entero >= 0 && entero < longitud){
            return cadena.charAt(entero);
        } else {
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");

        }

    }
}