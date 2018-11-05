/*
 * ECTICSOFT - EC-ERP
 */
package abstracion;

/**
 * Class Animal
 *
 * @since Nov 4, 2018 11:13:54 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public abstract class Animal {

    private String nombre;

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

    public void comer() {
        System.out.println("El " + this.nombre + " esta comiendo");
    }

    public abstract void moverse();
}
