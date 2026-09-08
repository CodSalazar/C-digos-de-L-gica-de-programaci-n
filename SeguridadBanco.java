import java.util.Scanner;

public class SeguridadBanco{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        double monto;
        boolean ubicacionHabitual;
        boolean historialSospechoso;
        String HSRespuesta;
        String UHRespuesta;

        System.out.println("Ingrese monto deseado: ");
        monto = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("El usuario tiene historial sospechoso? SI o NO: ");
        HSRespuesta = teclado.nextLine();

        if (HSRespuesta.equals("SI")){
            historialSospechoso = true;
        }
        else{
            historialSospechoso = false;
        }

        System.out.println("El usuario está en su ubicación habitual? SI o NO: ");
        UHRespuesta = teclado.nextLine();

        if (UHRespuesta.equals("SI")){
            ubicacionHabitual = true;
        }

        else{
            ubicacionHabitual = false;
        }

        if(historialSospechoso == true){
            System.out.print("Bloquear");
        }

        else if(monto > 10000000 || ubicacionHabitual == false){
            System.out.print("Revisar");
        }

        else{
            System.out.print("Aprobar");
        }

        teclado.close();

    }
}