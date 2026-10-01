import java.util.Scanner;
public class ClasificarUnaEdad {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int edad;

        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();

        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad < 18) {
            System.out.println("Adolescente");
        } else if (edad < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

        teclado.close();
    }
}