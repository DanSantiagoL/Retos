package Salud;
import java.util.Scanner;

public class Empleado extends Persona
{
    private String cargo,departamento;
    private double valorHora,horasTrabajadas,totalPagar,honorario;

    Scanner Sc = new Scanner(System.in);
    

    public Empleado (String tipoDoc,int documento, String nombre, String apellido, String cargo, String departamento, double horasTrabajadas, double valorHora, double totalPagar)
    {
        super(nombre,apellido);
        this.cargo=cargo;
        this.departamento=departamento;
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
        this.totalPagar=totalPagar;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    public double getHonorario() {
        return honorario;
    }

    public void setHonorario(double honorario) {
        this.honorario = honorario;
    }

    public void mostrarEmpleado()
    {
        setTotalPagar(getHorasTrabajadas() * getValorHora());
        System.out.println("El tipo de docmento del empleado es: "+ getTipoDoc() + " \nel numero de documento es: "+ getDocumento() + " \nsu nombre es: "+ getNombre() + 
        " \nsu apellido es: " + getApellido() + " \nsu cargo es: " + getCargo() + " \nsu departamento es: " + getDepartamento() + " \nsus horas trabajadas son: " 
        + getHorasTrabajadas() + " \nel valor por hora es: " + getValorHora() + " \nsu total a pagar es: " + getTotalPagar());
    }

    public void calcularHonorarios()
    {
        setHonorario((getValorHora() * getHorasTrabajadas())-0.966); 
        System.out.println("\n-------------------------------------\nSu honorario es de: "+getHonorario());
        
    }


}
