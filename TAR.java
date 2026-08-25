import java.util.Scanner;
public class TAR {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double monto;
        int intentos;

        System.out.print("Ingrese el monto de la transacción: ");
        monto = teclado.nextDouble();

        System.out.print("Ingrese la cantidad de intentos realizados: ");
        intentos = teclado.nextInt();

        if (monto >= 10000000 || intentos >= 5) {
            System.out.println("Transacción de alto riesgo");
        } else {
            System.out.println("Transacción segura");
        }

        teclado.close();
    }
    
}
