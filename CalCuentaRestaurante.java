import java.util.Scanner;

public class CalCuentaRestaurante {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String Nombre_Cliente;
        String Plato_Principal;
        String Bebida;
        int  Precio_Plato;  
        int Precio_Bebida;

        double SubTotal;
        double IVA;
        double TotalPago;

        System.out.print("Ingrese nombre del cliente: ");
        Nombre_Cliente = teclado.nextLine();

        System.out.print("Ingrese plato principal: ");
        Plato_Principal = teclado.nextLine();

        System.out.print("Ingrese bebida: ");
        Bebida = teclado.nextLine();

        System.out.print("Ingrese precio del plato: ");
        Precio_Plato = teclado.nextInt();

        System.out.print("Ingrese precio de la bebida: ");
        Precio_Bebida = teclado.nextInt();


        SubTotal = Precio_Bebida + Precio_Plato;

        IVA = SubTotal*0.19;

        TotalPago = SubTotal+IVA;

        System.out.println("\nClient@ "+Nombre_Cliente+"\n");

        System.out.println(Plato_Principal+" "+"$"+Precio_Plato+"\n");

        System.out.println(Bebida+" "+"$"+Precio_Bebida+"\n");

        System.out.println("Subtotal: "+"$"+SubTotal+"\n");

        System.out.println("IVA: "+"$"+IVA+"\n");

        System.out.println("Total a pagar: "+"$"+TotalPago+"\n");

        System.out.println("Gracias por su visita. ¡Vuelva pronto!");
        
        teclado.close();
        
    }

}
