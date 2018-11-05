/*
 * ECTICSOFT - EC-ERP
 */
package javaclasesobjetos;

/**
 * Class Empleado
 *
 * @since Nov 4, 2018 10:27:48 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public class Empleado extends Persona {

    private double salarioPagado;

    /**
     * @return the salarioPagado
     */
    public double getSalarioPagado() {
        return salarioPagado;
    }

    /**
     * @param salarioPagado the salarioPagado to set
     */
    public void setSalarioPagado(double salarioPagado) {
        this.salarioPagado = salarioPagado;
    }

}
