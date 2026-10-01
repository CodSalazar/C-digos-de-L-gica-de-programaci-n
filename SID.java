import java.util.Scanner;
public class SID {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        int valorCompra;
        double descuento;
        double valorDescontado;
        double total;

        System.out.println("Ingrese el valor de la compra: ");
        valorCompra = teclado.nextInt();

        if(valorCompra >= 300000){
            descuento = 20;
        }
        else if(valorCompra >= 200000 && valorCompra <= 299999){
            descuento = 15;

        }
        else if(valorCompra >= 100000 && valorCompra <= 199999){
            descuento = 10;

        }
        else{
            descuento = 0;
        }

        valorDescontado = valorCompra*descuento/100;
        total = valorCompra - valorDescontado;
        

        System.out.println("=================RESUMEN DE COMPRA================");
        System.out.println("Valor de la compra: " + valorCompra);
        
        if(descuento == 0){
            System.out.println("Descuento: Sin descuento");
        }
        else{
            System.out.println("Descuento: " + descuento + "%");
        }

        System.out.println("Valor descontado: " + valorDescontado);
        System.out.println("Total a pagar: " + total);
    }
    
}
