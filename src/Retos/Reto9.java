package Retos;
import java.util.Scanner;

public class Reto9 
{
    public static void main(String[] args) 
    {
        
        int numeroProducto = 1;

        double[][]precioProducto = new double[4][4];
        String[][]nombreProductos = new String[4][4];

        Scanner Sc = new Scanner(System.in);
        

        for(int fila=0;fila<4;fila++)
        {
            for(int columna=0;columna<4;columna++)
            {
                System.out.println("\nIngrese el nombre del producto numero " + numeroProducto);
                    nombreProductos[fila][columna]=Sc.next();
                System.out.println("ingrese el precio de " + nombreProductos[fila][columna]);
                    precioProducto[fila][columna]=Sc.nextDouble();

                    numeroProducto ++;
            }
        }
        for(int fila=0;fila<4;fila++)
            {
                for(int columna=0;columna<4;columna++)
                {
                    System.out.print("|"+nombreProductos[fila][columna]+" Precio: "+precioProducto[fila][columna]+"\t");
                }   
                System.out.println("");
            }
            Sc.close();
    }
   
}

