import java.util.Scanner;

public class EjemploAcumuladorContador{
    public static void main(String[] args) {
        int aprobados = 0;
        double suma = 0;
        int cont = 1;

        double[] notas = new double[5];

        Scanner teclado = new Scanner (System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota "+cont+": ");
            notas[i] = teclado.nextDouble();
            cont++;
}

        for (int i = 0; i < notas.length; i++){
            suma = suma + notas[i];

            if(notas[i] >=3){
                aprobados++;
            }
        }

        double promedio = suma / notas.length;

        System.out.println("Aprobados "+ aprobados);
        System.out.println("Promedio "+ promedio);
        System.out.println("=========================================");
        System.out.println("          RESULTADO DEL CURSO");
        System.out.println("==========================================");
        System.out.println("Total de notas: "+notas.length);
        System.out.println("Suma de las notas: "+suma);
        System.out.println("Estudiantes aprobados "+ aprobados);
        System.out.println("Estudiantes reprobados: "+(notas.length-aprobados));
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("==========================================");

        if(promedio >= 4.5){
            System.out.println("Nivel del grupo: EXCELENTE");
        }
        else if(promedio >= 3){
            System.out.println("Nivel del grupo: APROBADO");
        }
        else{
            System.out.println("Nivel del grupo: DEBE MEJORAR");
        }

        teclado.close();

    }
}