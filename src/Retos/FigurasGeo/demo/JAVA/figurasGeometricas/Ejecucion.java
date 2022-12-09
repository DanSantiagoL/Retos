package figurasGeometricas;
import java.util.Scanner;

public class Ejecucion 
{
  
    public static void main(String[] args) 
    {
      int regresar, opcion;
      Scanner Sc = new Scanner(System.in);
      
      Circulo cir = new Circulo();
      Octagono oct = new Octagono();
      Decagono dec = new Decagono();

      do
      {
        System.out.println("¿De que figura desea saber el perimetro y el area?\n1.-Circulo\n2.-octagono\n3.-decagono");
        opcion = Sc.nextInt();
        if(opcion == 1)
        {

        

      System.out.println("---------------------------------------\nCIRCULO");

       System.out.println("\nPorfavor ingrese el radio del Circulo");
       cir.setRadio(Sc.nextDouble());
       cir.CalcularArea(cir.getRadio());
       cir.CalcularPerimetro(cir.getRadio());


      System.out.println("---------------------------------------");
        }
        else if(opcion == 2)
        {

       System.out.println("\nPorfavor ingrese el tamaño de uno de los lados del octagono");
       oct.setLado(Sc.nextDouble());
       System.out.println("Porfavor ingrese el apotema del octagono");
       oct.setApotema(Sc.nextDouble());
       oct.CalcularArea(oct.getLado(),oct.getApotema());
       oct.CalcularPerimetro(oct.getLado());


      System.out.println("---------------------------------------");
        }
        else if(opcion == 3)
        {
      
      System.out.println("---------------------------------------\nDECAGONO");

       System.out.println("\nPorfavor ingrese el tamaño de uno de los lados del decagono");
       dec.setLado(Sc.nextDouble());
       System.out.println("Porfavor ingrese el apotema del decagono");
       dec.setApotema(Sc.nextDouble());
       dec.CalcularArea(dec.getLado(),dec.getApotema());
       dec.CalcularPerimetro(dec.getLado());


      System.out.println("---------------------------------------");
        }
        System.out.println("¿Desea realizar otra cosa?\n1.-Si\n2.-No");
        regresar = Sc.nextInt();

    }while(regresar == 1);

      Sc.close();
    }
}
