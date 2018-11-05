/*
 * ECTICSOFT - EC-ERP
 */
package abstracion;

import implementacion.AccionesInterface;

/**
 * Class Animal
 *
 * @since Nov 4, 2018 11:13:54 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public abstract class Animal implements AccionesInterface{

    private String nombre;
    private int edad;

    public Animal() {
        System.out.println("Este Animal");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public void comer() {
        System.out.println("El " + this.nombre + " esta comiendo");
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void calcularEdadHumana();

}
