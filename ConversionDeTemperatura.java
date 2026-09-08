import java.util.Scanner;

public class ConversionDeTemperatura {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int C;
        int F;

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        C = teclado.nextInt();

        F = (C*9/5)+32;

        System.out.print("\nLa temperatura en grados Celsius es de: "+C+"°C");

        System.out.print("Y la temperatura en grados Farenheit es de: "+F+"°F");

        teclado.close();
        
    }

}
