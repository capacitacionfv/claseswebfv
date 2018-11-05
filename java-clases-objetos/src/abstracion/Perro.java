/*
 * ECTICSOFT - EC-ERP
 */

package abstracion;

/**
 * Class  Perro
 * @since  Nov 4, 2018 11:17:21 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public class Perro extends Animal{

    public Perro(){     
        super();
        super.setNombre("PERRO");
    }
    @Override
    public void moverse() {
        System.out.println("El perro camina en cuatro patas");
    }

}
