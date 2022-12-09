package Principal;
import Salud.Persona;

public class Inicio 
{
    public static void main(String[] args) 
    {
        Persona persona = new Persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc(persona.getPeso(),persona.getEstatura());
        if(persona.getValorPeso() == "PESOBAJO")
        {
            System.out.println("\nSu peso es muy bajo");
        }
        else if(persona.getValorPeso() == "PESOIDEAL")
        {
            System.out.println("\nSu peso es el ideal");
        }
        else if(persona.getValorPeso() == "SOBREPESO")
        {
            System.out.println("\nTienes sobrepeso");
        }
        persona.mayorEdad();
    }
}
