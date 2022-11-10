package Retos;

public class Reto10 
{
    public static void main(String[] args) 
    {
        String[][]nombreProductos = {{"00 Papas Margaria 1500","01 Galletas Wafer 800","02 Chocolatia Jet 1000"},{"10 Chiclets Adams 600","11 Manimoto 800","12 Chocorramo 1300"},{"20 Agua Cristal 1500","21 CocaCola 1700","22 Jugo Hit 1200"}};

    
        for(int fila=0;fila<3;fila++)
        {
                for(int columna=0;columna<3;columna++)
                {
                    System.out.print("|"+ nombreProductos[fila][columna]+"\t");
                }
                System.out.println("");
        }
    }
}
