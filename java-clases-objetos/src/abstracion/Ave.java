/*
 * ECTICSOFT - EC-ERP
 */
package abstracion;

/**
 * Class Ave
 *
 * @since Nov 4, 2018 11:25:19 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public class Ave extends Animal {

    public Ave() {
        super();
        super.setNombre("AVE");
    }

    @Override
    public void moverse() {
        System.out.println("El ave vuela");
    }

    @Override
    public void calcularEdadHumana() {
        System.out.println("Edad " + getNombre() + " en años humanos " + (getEdad() * 2));
    }

    @Override
    public void comer() {
        System.out.println("La " + getNombre() + " está comiendo");
    }

}
