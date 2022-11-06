package Retos;
import java.util.Scanner;

public class Reto1 
{
    public static void main(String[] args)
    {
        double celsius = 32;
        double fahrenheit;
        double conversion;

        Scanner Sc = new Scanner (System.in);

        System.out.println("Ingrese los grados Fahrenheit que desea convertir a Celsius: ");
        fahrenheit = Sc.nextFloat();
        conversion = (fahrenheit - celsius) * 0.5556;
        System.out.println("Su valor en Celsius es: " + conversion);
        Sc.close();
    }
}
