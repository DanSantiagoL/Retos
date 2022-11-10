package Retos;
import java.util.Scanner;

public class Reto5 
{
    public static void main(String[]args)
    {
        int cantidad,repeticiones;
        double total = 0;
        double precio;
        
        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos que va a comprar");
        repeticiones = Sc.nextInt();
        for(cantidad = 1; cantidad <= repeticiones; cantidad ++)
        {
            System.out.println("Ingrese el precio del producto numero "+cantidad);
            precio = Sc.nextDouble();
            total += precio;
        }
        System.out.println("El total a pagar es: $" + total);

        Sc.close();  
    }
}
