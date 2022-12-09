package Principal;
import Salud.Persona;

public class Inicio 
{
    public static void main(String[] args) 
    {
        Persona persona = new Persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularlmc();
        persona.mayorEdad();
    }
}
