import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double Base;
        double Altura;
        double Area;

        System.out.print("Ingrese la medida de la base del rectángulo en cm: " );
        Base = teclado.nextDouble();

        System.out.print("Ingrese la medida de la altura del rectángulo en cm: " );
        Altura = teclado.nextDouble();

        Area = Base*Altura;

        System.out.print("\nEl área del rectángulo es: "+Area+" cm");

        teclado.close();
    }

}
