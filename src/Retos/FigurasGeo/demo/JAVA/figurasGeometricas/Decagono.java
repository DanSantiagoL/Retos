package figurasGeometricas;
import java.util.Scanner;

public class Decagono 
{
    double lado, apotema, perimetro,area;
    Scanner Sc = new Scanner(System.in);

    public Decagono()
    {

    }

    public Decagono(double lado, double apotema,double area,double perimetro)
    {
        this.lado=lado;
        this.apotema=apotema;
        this.area=area;
        this.perimetro=perimetro;
    }

    
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public void CalcularArea()
    {
    
        System.out.println("Porfavor ingrese el tamaño de un lado");
        lado = Sc.nextDouble();
        System.out.println("Porfavor ingrese el apotema del Decagono");
        apotema = Sc.nextDouble();
        area = 5 * apotema * lado;
        System.out.println("El Area es: "+ area);

    }
   
    public void CalcularArea(double lad, double apo)
    {
        area = 4 * apotema * lado;
        System.out.println("El Area es: "+ area);

    }
    
    public void CalcularPerimetro(double lad)
    {
        perimetro = lad * 8;
        System.out.println("El Perimetro es: "+ perimetro);
    }
}
