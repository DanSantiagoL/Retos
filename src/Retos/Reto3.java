package Retos;
import java.util.Scanner;

public class Reto3 
{
    public static void main (String [] args)
    {
        int eleccion;
        double moneda = (int)(Math.random() * 2) + 1;
        
        Scanner Sc = new Scanner(System.in);

        System.out.println("Elija:");
        System.out.println("1 = cara");
        System.out.println("2 = cruz");
        eleccion = Sc.nextInt();
        if(moneda == 1)
        {
            System.out.println("Salio Cara!");
            if(eleccion == 1)
            {
                System.out.println("Ganaste");
            }
            else if(eleccion == 2)
                {
                    System.out.println("Perdiste");
                }
        }
            
            else if(moneda == 2)
            {
                System.out.println("Salio Cruz!");
                if(eleccion== 2)
                {
                    System.out.println("Ganaste");
                }
                else if(eleccion == 1)
                {
                    System.out.println("perdiste");
                }
            }
            Sc.close();
    }   
}
