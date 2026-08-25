import java.util.Scanner;

public class CompraSupermercado {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nombreProducto;
        int precio;
        int cantidad;
        int total;

        System.out.print("Ingrese nombre del producto: ");
        nombreProducto = teclado.nextLine();

        System.out.print("Ingrese precio del producto: ");
        precio = teclado.nextInt();

        System.out.print("Ingrese cantidad del producto: ");
        cantidad = teclado.nextInt();

        total = precio * cantidad;

        System.out.println();

        System.out.println("Producto:\n"+nombreProducto);

        System.out.println();

        System.out.println("Cantidad:\n"+cantidad);

        System.out.println();

        System.out.println("Total:\n$"+total);

        teclado.close();
    }

}
