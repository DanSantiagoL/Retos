package Retos;
import java.util.Scanner;

public class Reto7 
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        int cantidadNotas;
        int numeroNota = 1;
        float totalNotas = 0;
        float promedioNotas;


        System.out.println("¿Cuantas notas hay que evaluar?");
        cantidadNotas = Sc.nextInt();

        Float[]notas = new Float[cantidadNotas];

        for(int p=0; p<cantidadNotas; p++)
        {
            System.out.println("Digitalice la " + numeroNota + " nota");
            notas[p] = Sc.nextFloat();

            totalNotas += notas[p];

            numeroNota ++;
        } 
        promedioNotas = totalNotas/cantidadNotas;
           
            
            if(promedioNotas < 3)
            {
                System.out.println("Tu promedio de notas fue: "+ promedioNotas +"\nReprobaste");
            }
            else if(3 >= promedioNotas || promedioNotas<4)
            {
                System.out.println("Tu promedio de notas fue: "+ promedioNotas +"\nPasaste raspando");
            }
            else if(promedioNotas >= 4)
            {
                System.out.println("Tu promedio de notas fue: "+ promedioNotas +"\nAprobaste con buenos resultados");
            }
            Sc.close();
    }
    
}
