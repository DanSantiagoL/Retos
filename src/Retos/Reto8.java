package Retos;
import java.util.Scanner;

public class Reto8 
{
    public static void main(String[] args) 
    {
        int cantidadCompetidores;
        int numeroCompetidor = 1;

        Scanner Sc = new Scanner(System.in);
        

        System.out.println("¿Cuantos competidores participaran?");
        cantidadCompetidores = Sc.nextInt();

        Double[]tiempoCompetidor = new Double[cantidadCompetidores];
        String[]nombreCompetidor = new String[cantidadCompetidores];

        for(int p=0; p<cantidadCompetidores; p++)
        {
            System.out.println("\nIngrese el nombre del " + numeroCompetidor + " competidor");
            nombreCompetidor[p] = Sc.next();

            System.out.println("Ingrese el tiempo en minutos que hizo el competidor " + nombreCompetidor[p]);
            tiempoCompetidor[p] = Sc.nextDouble();

            numeroCompetidor ++;
        } 

        for(int p=0; p<nombreCompetidor.length; p++ )
        {
            System.out.println("--------------------------------------------\nEl competidor "+nombreCompetidor[p] + " hizo: " + tiempoCompetidor[p] + " minutos");
        }

        Double menorTiempo = tiempoCompetidor[0];
        String nombreGanador = null;
       
        for (int p = 0; p<tiempoCompetidor.length; p++) 
        {

            if(tiempoCompetidor[p]<menorTiempo) 
            {
                menorTiempo = tiempoCompetidor[p];
                nombreGanador = nombreCompetidor[p];

            }
        }

        
        System.out.println("\n~~~~~~~~~~~~~~~ EL GANADOR FUE " + nombreGanador + " PUES HIZO " + menorTiempo + " MINUTOS ~~~~~~~~~~~~~~~");
        Sc.close();
    }
}
