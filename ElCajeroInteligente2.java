import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Factura {

    double valorCompra;

    Factura(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}

public class ElCajeroInteligente2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int numCompra;
        double valorCompra;
        String rUsuario;
        int acumulador;
        double dineroRecaudado;
        double promedioCompra;
        int comprasMenores;

        List<Factura> listaVentas = new ArrayList<>();

        dineroRecaudado = 0;
        numCompra = 0;
        acumulador = 0;
        comprasMenores = 0;
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
            
            
            if(listaVentas.get(i).valorCompra > 30000){
                acumulador = acumulador + 1;
                

            }
            else if(listaVentas.get(i).valorCompra<=20000){
                comprasMenores = comprasMenores + 1;
            }

        }   

        System.out.println("========================Resumen de venta===========================");
        System.out.println("Cantidad de compras: "+ numCompra);
        System.out.println("Dinero recaudado: $"+dineroRecaudado);
        System.out.println("Promedio por compra: $"+promedioCompra);
        System.out.println("Compras superiores a $30.000: "+acumulador);
        System.out.println("Compras inferiores o iguales a $20.000: "+comprasMenores);

        if(promedioCompra>25000){
            System.out.println("Día excelente.");
        }
        else{
            System.out.println("Día normal.");
        }


        teclado.close();
        
    }
    
}
    

