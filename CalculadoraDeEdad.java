import java.util.Scanner;

public class CalculadoraDeEdad {
    public static void main(String ars[]){

        try(Scanner teclado = new Scanner(System.in)){

            String Nombre;
            int AñoDeNacimiento;
            int Edad;
            
            System.out.print("Ingrese su nombre: ");
            Nombre = teclado.nextLine();

            System.out.print("Ingrese año de nacimiento: ");
            AñoDeNacimiento = teclado.nextInt();

            Edad = 2026-AñoDeNacimiento;

            System.out.println("\nHola "+Nombre+"\n");

            System.out.println("Su edad es: "+ Edad+" años");

            teclado.close();

        
        }

        

    }
    
}
