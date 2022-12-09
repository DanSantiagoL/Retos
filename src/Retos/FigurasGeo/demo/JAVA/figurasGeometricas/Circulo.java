package figurasGeometricas;
import java.util.Scanner;

public class Circulo 
{
    private double radio,perimetro,area;
    Scanner Sc = new Scanner(System.in);
    
    public Circulo()
    {

    }

    public Circulo(double radio,double area, double perimetro)
    {
        this.radio=radio;
        this.area=area;
        this.perimetro=perimetro;

    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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


    public void CalcularArea(double radio)
    {

        area = 3.14159265 * radio * radio;
        System.out.println("El Area es: "+ area);

    }
    public void CalcularPerimetro(double radio)
    {
        perimetro = 2 * 3.1415 * radio;
        System.out.println("El Perimetro es: "+ perimetro);
    }  
}
