package javaclasesobjetos;

import implementacion.AccionesInterface;

/*
 * ECTICSOFT - EC-ERP
 */
/**
 * Class Persona
 *
 * @since Nov 4, 2018 9:34:15 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public class Persona implements AccionesInterface{

    public String nombre;
    public String apellido;
    public int edad;    
    public static String sexo;
    public String activo;
    

    public void imprimirPersona() {
        System.out.println("Hola " + this.nombre + " " + this.apellido + " " + this.edad +  " " + Persona.sexo + " " + this.activo);
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

    @Override
    public void comer() {
        System.out.println("La persona " + nombre + " come");
    }

    @Override
    public void moverse() {
        System.out.println("La persona " + nombre + " camina");
    }

    @Override
    public String toString(){
        return (nombre + " " + apellido + " " + edad + " " + activo);
    }
    
}
