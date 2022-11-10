package Retos;
import java.util.Scanner;

public class Reto6 
{
    public static void main(String[]args)
    {
        int eleccion,apuesta, continuar;
        int total = 0;
        int resultado = 0;
        int contador = 1;
        double moneda = (int)(Math.random() * 2) + 1;
        
        Scanner Sc = new Scanner(System.in);

        do
        {
        System.out.println(" \nBienvenido al juego de la moneda este es su intento numero " + contador + "\n¿Cuanto desea apostar?");
        apuesta = Sc.nextInt();
        System.out.println("\nElija: \n1 = cara \n2 = cruz");
        eleccion = Sc.nextInt();

        if(moneda == 1)
        {
            System.out.println("Salio Cara!\n");
            if(eleccion == 1)
            {
                System.out.println("Ganaste");
                total = apuesta+apuesta;
            }
            else if(eleccion == 2)
                {
                    System.out.println("Perdiste");
                    total = 0-apuesta;
                }
        } 
            else if(moneda == 2)
            {
                System.out.println("Salio Cruz!\n");
                if(eleccion== 2)
                {
                    System.out.println("Ganaste");
                    total = apuesta+apuesta;
                }
                else if(eleccion == 1)
                {
                    System.out.println("perdiste");
                    total = 0-apuesta;    
                }
            }   
            
            resultado += total;
            contador ++;

            System.out.println("Tienes: "+ resultado);
            System.out.println("\n¿Desea continuar? \n1 = si\n2 = no");
            continuar = Sc.nextInt();

        }while(continuar == 1);
        System.out.println("Usted jugó un total de: "+ contador +" veces\nY el dinero conseguido fue: " + resultado + " Pesos");    
       
        Sc.close();
    }
}
