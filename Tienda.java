import java.util.Scanner;

public class Tienda{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        String nombreProducto;
        double precioProducto;
        int cantidad;
        double valorTotalDeCompra;

        System.out.println("======SISTEMA DE VENTAS======");

        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = teclado.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = teclado.nextDouble();

        System.out.print("Ingrese la cantidad del producto: ");
        cantidad = teclado.nextInt();

        valorTotalDeCompra = precioProducto*cantidad;

        System.out.println("\n=======FACTURA=======");

        System.out.println("Producto: "+nombreProducto);
        System.out.println("Precio: $"+precioProducto);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Total: $"+valorTotalDeCompra);

        System.out.println("============================");

        teclado.close();







}

}