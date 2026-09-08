import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Inventario {
    String nombre;
    int cantidad;

    Inventario(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}

public class inventarioSuficiente {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre;
        int cantidad;
        String respuestaInv;
        String respuestaP;
        
        List<Inventario> listaInventario = new ArrayList<>();
        List<Inventario> listaPedido = new ArrayList<>();
        
        System.out.println("Ingrese los productos existentes en el inventario con su respectiva cantidad.");

        do{
        System.out.println("Ingrese nombre del producto: ");
        nombre = teclado.nextLine();

        System.out.println("Ingrese cantidad del producto: ");
        cantidad = teclado.nextInt();
        
        teclado.nextLine();

        listaInventario.add(new Inventario(nombre, cantidad));

        System.out.println("Desea registrar otro producto en el inventario? SI o NO");
        respuestaInv = teclado.nextLine();

        }while(respuestaInv.equals("SI"));

        for (Inventario lista1 : listaInventario) {
            System.out.println("Producto: " + lista1.nombre);
            System.out.println("Cantidad: " + lista1.cantidad);
        }

        System.out.println("Ingrese los productos solicitados por el cliente.");

        do{
        System.out.println("Ingrese nombre del producto: ");
        nombre = teclado.nextLine();

        System.out.println("Ingrese cantidad del producto: ");
        cantidad = teclado.nextInt();
        
        teclado.nextLine();

        listaPedido.add(new Inventario(nombre, cantidad));

        System.out.println("Desea registrar otro producto del pedido? SI o NO");
        respuestaP = teclado.nextLine();

        }while(respuestaP.equals("SI"));

        for (Inventario lista2 : listaPedido) {
            System.out.println("Producto: " + lista2.nombre);
            System.out.println("Cantidad: " + lista2.cantidad);
        }
        
        teclado.close();

        for (Inventario contador1 : listaPedido) {
            for (Inventario contador2 : listaInventario) {
                if (contador1.nombre.equals(contador2.nombre)) {
                    if (contador1.cantidad <= contador2.cantidad) {
                        System.out.println(contador1.nombre + " tiene cantidad suficiente");
                    }
                    else{
                        System.out.println(contador1.nombre + " tiene cantidad insuficiente");
                    }
                } 
            }
        }
    }
        
}
    
