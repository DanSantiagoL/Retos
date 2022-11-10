package Retos;
import java.util.Scanner;

public class Reto4 
{
    public static void main(String[]args)
    {
       int eleccion;
       double eleccionMaquina = (int)(Math.random() * 3) + 1;
       
       Scanner Sc = new Scanner(System.in);

       System.out.println("Elija una de las siguientes opciones");
       System.out.println("1 = piedra");
       System.out.println("2 = papel");
       System.out.println("3 = Tijera");
       eleccion = Sc.nextInt();

       if(eleccion == 1)
       {
        System.out.println("Elegiste piedra!");
        if(eleccionMaquina == 1)
        {
            System.out.println("La maquina eligio piedra \nEs un empate");
        }
        else if(eleccionMaquina == 2)
        {
            System.out.println("la maquina eligio papel \nPerdiste");
        }
        else if(eleccionMaquina == 3)
        {
            System.out.println("La maquina eligio tijera \nGANASTE!");
        }
       }
       else if(eleccion == 2)
       {
        System.out.println("Elegiste papel");
        if(eleccionMaquina == 1)
        {
            System.out.println("La maquina eligio piedra \nGANASTE!");
        }
        else if(eleccionMaquina == 2)
        {
            System.out.println("La maquina eligio papel \nEs un empate");
        }
        else if(eleccionMaquina == 3)
        {
            System.out.println("La maquina eligio tijera \nPerdiste");
        }
       }
       else if(eleccion == 3)
     {
        System.out.println("Elegiste tijera");
        if(eleccionMaquina == 1)
        {
            System.out.println("La maquina eligio piedra \nPerdiste");
        }
        else if(eleccionMaquina == 2)
        {
            System.out.println("La maquina eligio papel \nGANASTE!");
        }
        else if(eleccionMaquina == 3)
        {
            System.out.println("La maquina eligio tijera \nEs un empate");
        }
     }
        else 
        {
        System.out.println("opcion no valida");
        }
    Sc.close();
    }       
}
