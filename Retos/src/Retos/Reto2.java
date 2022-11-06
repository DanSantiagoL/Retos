package Retos;
import java.util.Scanner;

public class Reto2 
{
    public static void main(String[] args) 
	{
		float dosisVacuna;
		float pesoBebe;
		float mesesBebe;
		
		Scanner Sc = new Scanner (System.in);

		
		
		System.out.println("Ingrese los meses que tiene el bebe: ");
		mesesBebe = Sc.nextFloat();
		System.out.println("Ingrese el peso del bebe: ");
		pesoBebe = Sc.nextFloat();
		
		dosisVacuna = ((pesoBebe + 10)/(mesesBebe * 10))*8;
		System.out.println("Las dosis que se les debe dar al bebe son: " + dosisVacuna);

        Sc.close();
	}

    
}
