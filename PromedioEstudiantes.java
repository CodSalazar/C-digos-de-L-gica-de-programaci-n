import java.util.Scanner;

public class PromedioEstudiantes {

    public static void main(String[] args) {
        try(Scanner teclado = new Scanner(System.in)){
            double nota1, nota2, nota3, promedio;

            System.out.println("====================================");
            System.out.println("    PROMEDIO DE UN ESTUDIANTE");
            System.out.println("====================================");

            System.out.print("Ingresa la nota 1: ");
            nota1 = teclado.nextDouble();

            System.out.print("Ingresa la nota 2: ");
            nota2 = teclado.nextDouble();

            System.out.print("Ingresa la nota 3: ");
            nota3 = teclado.nextDouble();

            promedio = (nota1 + nota2 + nota3) / 3;

            System.out.printf("El promedio del estudiante es: %.2f%n", promedio);


        }
    }
    
}
