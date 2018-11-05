package javaclasesobjetos;

/*
 * ECTICSOFT - EC-ERP
 */
/**
 * Class Persona
 *
 * @since Nov 4, 2018 9:34:15 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    public final String EMPRESA = "FV";
    public static String sexo;
    public String activo;
    

    public void imprimirPersona() {
        System.out.println("Hola " + this.nombre + " " + this.apellido + " " + this.edad + " " + this.EMPRESA + " " + Persona.sexo + " " + this.activo);
    }

    //constructor
    public Persona() {
        this.activo = "ACTIVO";
    }
    
    //POLIMORFISMO
    public Persona(int edad) {
        this.activo = "ACTIVO";
    }    

    public Persona(String nombre, String apellido, int edad, String activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.activo = activo;
    }
    
    //ENCAPSULAMIENTO
    private double  salarioDeseado;

    
    
    //HERENCIA Y ABSTRACCION

    /**
     * @return the salarioDeseado
     */
    public double getSalarioDeseado() {
        return salarioDeseado;
    }

    /**
     * @param salarioDeseado the salarioDeseado to set
     */
    public void setSalarioDeseado(double salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
    }
    
    
}
