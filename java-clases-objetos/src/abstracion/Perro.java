/*
 * ECTICSOFT - EC-ERP
 */
package abstracion;

/**
 * Class Perro
 *
 * @since Nov 4, 2018 11:17:21 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public class Perro extends Animal {

    public Perro() {
        super();
        super.setNombre("PERRO");
    }

    @Override
    public void moverse() {
        System.out.println("El perro camina en cuatro patas");
    }

    @Override
    public void calcularEdadHumana() {
        System.out.println("Edad " + getNombre() + " en años humanos " + (getEdad() * 4));
    }

    @Override
    public void comer() {
        System.out.println("El " + getNombre() + " está comiendo");
    }

}
