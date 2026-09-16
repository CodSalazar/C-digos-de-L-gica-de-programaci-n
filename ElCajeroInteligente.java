import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Factura {

    double valorCompra;

    Factura(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}

public class ElCajeroInteligente {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int numCompra;
        double valorCompra;
        String rUsuario;
        int acumulador;
        double dineroRecaudado;
        double promedioCompra;

        List<Factura> listaVentas = new ArrayList<>();

        dineroRecaudado = 0;
        numCompra = 0;
        acumulador = 0;
        do {
            
            numCompra = numCompra + 1;
            System.out.println("Ingrese el valor de la compra número "+numCompra+": ");
            valorCompra = teclado.nextDouble();

            dineroRecaudado = dineroRecaudado + valorCompra;

            listaVentas.add(new Factura(valorCompra));
            
            teclado.nextLine();

            System.out.println("Desea registrar una nueva compra? SI o NO: ");
            rUsuario = teclado.nextLine();
            
        } while (rUsuario.equals("SI"));

        promedioCompra = dineroRecaudado/numCompra;

        for(int i=0; i < listaVentas.size(); i++){
            
            
            if(listaVentas.get(i).valorCompra > 20000){
                acumulador = acumulador + 1;
                

            }

        }   

        System.out.println("========================Resumen de venta===========================");
        System.out.println("Cantidad de compras: "+ numCompra);
        System.out.println("Dinero recaudado: $"+dineroRecaudado);
        System.out.println("Promedio por compra: $"+promedioCompra);
        System.out.println("Compras superiores a $20.000: "+acumulador);

        if(dineroRecaudado<150000){
            System.out.println("Mensaje: Debemos mejorar las ventas.");
        }
        else{
            System.out.println("Mensaje: Vamos muy bien en ventas.");
        }


        teclado.close();
        
    }
    
}
