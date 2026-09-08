import java.util.Scanner;

public class ComercializadoraAguacates {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===================================");
            System.out.println("  COMERCIALIZADORA DE AGUACATES");
            System.out.println("=====================================");

            System.out.println("Nombre del cliente: ");
            String cliente = teclado.nextLine();

            double cantidad;

            System.out.print("Cantidad de aguacates (kg): ");
            cantidad = teclado.nextDouble();

            while (cantidad <=0){
                System.out.println("La cantidad debe de ser mayor que cero.");
                System.out.println("Ingrese nuevamente la cantidad: ");
                cantidad = teclado.nextDouble();
            }

            System.out.println("Precio por kilogramo: ");
            double precio = teclado.nextDouble();

            double subtotal = cantidad * precio;
            double descuento = 0;

            if (cantidad > 100) {
                descuento = subtotal * 0.10;

            }

            double total = subtotal - descuento;

            System.out.println("\n==============FACTURA============");
            System.out.println("Cliente: "+cliente);
            System.out.println("Cantidad: "+cantidad+" kg");
            System.out.println("Precio por kg: $"+precio);
            System.out.println("Subtotal: $"+subtotal);

            if (descuento > 0){
                System.out.println("Descuento aplicado: $"+descuento);

            }
            else{
                System.out.println("No obtuvo descuento.");
            }

            System.out.println("Total a pagar: $"+total);

            teclado.nextLine();

            System.out.print("\nDesea registrar otro cliente? (1=Sí / 0=No): ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
        }
        while (opcion == 1);

        System.out.println("\n=========================================");
        System.out.println("Gracias por utilizar el sistema");
        System.out.println("===========================================");

        System.out.println("\nContador de cierre:");

        for (int i = 5; i >= 1; i--){
            System.out.println("El sistema cerrará en "+i+"...");
        }

        System.out.println("Sistema finalizado.");

        teclado.close();
    }
    
}
