package Salud;
import java.util.Scanner;

public class Persona 
{
    private String tipoDoc,nombre,apellido,sexo;
    private int documento,edad;
    private double peso,estatura,pesoActual;

    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getPesoActual() {
        return pesoActual;
    }
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    Scanner Sc = new Scanner(System.in);
    
    public void pedirDatos()
    {
        System.out.println("BIENVENIDO\nIngrese su tipo de documento:");
        setTipoDoc(Sc.nextLine());
        System.out.println("Ingrese su numero de documento:");
        setDocumento(Sc.nextInt());
        System.out.println("Ingrese su primer nombre:");
        setNombre(Sc.next());
        System.out.println("Ingrese su primer apellido");
        setApellido(Sc.next());
        System.out.println("Ingrese su edad");
        setEdad(Sc.nextInt()); 
        System.out.println("Ingrese su sexo");
        setSexo(Sc.next());
        System.out.println("Ingrese su peso actual en kilogramos");
        setPeso(Sc.nextDouble());
        System.out.println("Ingrese su estatura actual en metros");
        setEstatura(Sc.nextDouble());
    }
    public void mostrarPersona()
    {
        System.out.println("Hola " + getNombre() + " " + getApellido());
        System.out.println("Tu tipo de documento de identificación es: "+getTipoDoc()+" tu numero es: "+ getDocumento());
        System.out.println("Tu edad es: "+ getEdad());
        System.out.println("Tu sexo es: " +getSexo());
        System.out.println("Tu peso actual es: " + getPeso() + " Kg");
        System.out.println("Tu estatura actual es: " + getEstatura() + " m");
    }
    public void calcularlmc()
    {
        setPesoActual(getPeso()/(getEstatura()*getEstatura())); 
        if(getPesoActual() < 20)
        {
            System.out.println("El peso está por debajo de lo ideal");
        }
        else if(20<=getPesoActual() || getPesoActual()<=25)
        {
            System.out.println("El peso es ideal");
        }
        else if(getPesoActual()>25)
        {
            System.out.println("Tiene sobrepeso");
        }
    }
    public void mayorEdad()
    {
        if(getEdad()<18)
        {
            System.out.println("Usted es menor de edad");
        }
        else if(getEdad()>=18)
        {
            System.out.println("Usted es mayor de edad");
        }
        else
        {
            System.out.println("dato ingresado no es valido");
        }
    }
}
