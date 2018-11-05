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

    private String empresa;
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
    
    @Override
    public void comer() {
        System.out.println("El empleado " + nombre + " come");
    }

    @Override
    public void moverse() {
        System.out.println("El empleado " + nombre + " camina");
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
