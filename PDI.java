import java.util.Scanner;
public class PDI{
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        double precio;
        double descuento;
        double iva = 19;
        String producto;

        System.out.println("Ingrese el nombre del producto: ");
        producto = teclado.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();
        
        if (precio >= 500000) {
            descuento = 20;
        } 
        else if (precio >= 300000) {
            descuento = 15;
        } 
        else if (precio >= 100000) {
            descuento = 10;
        } 
        else {
            descuento = 0;
        }
        
        double valorDescuento = precio * descuento / 100;
        double subtotal = precio - valorDescuento;
        double valorIva = subtotal * iva / 100;
        double total = subtotal + valorIva;
        
        System.out.println("===================RESUMEN DE COMPRA====================");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: $" + Math.round(precio));
        System.out.println("Descuento aplicado: " + Math.round(descuento) + "%");
        System.out.println("Valor descuento: " + Math.round(valorDescuento));
        System.out.println("Subtotal: $" + Math.round(subtotal));
        System.out.println("IVA: $" + Math.round(valorIva));
        System.out.println("TOTAL: $" + Math.round(total));

        teclado.close();
    }
}