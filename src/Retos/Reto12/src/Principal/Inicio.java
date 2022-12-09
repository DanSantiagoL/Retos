package Principal;
import Salud.*;

public class Inicio 
{
    public static void main(String[] args) 
    {
        Empleado emp = new Empleado("CC", 1030525061, "Santiago", "Lopez", "Supervisor", "Recursos humanos", 12, 6, 0);
        emp.pedirDatos();
        emp.mostrarEmpleado();
        emp.calcularHonorarios();
    }
}
