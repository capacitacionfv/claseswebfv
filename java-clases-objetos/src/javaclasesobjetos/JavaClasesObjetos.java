/*
 * ECTICSOFT - EC-ERP
 */
package javaclasesobjetos;

import abstracion.Animal;
import abstracion.Ave;
import abstracion.Perro;

/**
 * Main JavaClasesObjetos
 *
 * @since Nov 4, 2018 9:30:00 PM
 * @author Luis Guzman <lguzman@ecticsoft.com>
 */
public class JavaClasesObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("main principal de java");
        System.err.println("ERROR MENSAJE");
        Persona persona = new Persona();
        persona.apellido = "Guzman";
        persona.nombre = "Luis";
        persona.edad = 40;
        System.out.println("Hola " + persona.nombre + " " + persona.apellido + " " + persona.edad);
        System.out.printf("Hola %s %s %d%n", persona.nombre, persona.apellido, persona.edad);
        System.out.printf("PI= %f%n", Math.PI);
        //https://dzone.com/articles/java-string-format-examples

        Persona persona2 = new Persona();
        System.out.println("Hola " + persona2.nombre + " " + persona2.apellido + " " + persona2.edad);
        persona2.apellido = "Pedernal";
        persona2.nombre = "Ariana";
        persona2.edad = 43;
        System.out.println("Hola " + persona2.nombre + " " + persona2.apellido + " " + persona2.edad + " " + persona.EMPRESA);
        persona2.sexo = "MASCULINO";
        System.out.println(persona2.sexo);
        System.out.println(persona.sexo);
        Persona.sexo = "FEMENINO";
        System.out.println(Persona.sexo);
        //persona2.EMPRESA = "hos";
        persona.imprimirPersona();
        persona2.activo = "INACTIVO";
        persona2.imprimirPersona();

        Persona persona3 = new Persona();
        persona3.imprimirPersona();

        Persona persona4 = new Persona(50);
        persona4.imprimirPersona();
        Persona persona5 = new Persona("Cesar", "Alvarez", 55, "ACTIVO");
        persona5.imprimirPersona();

        persona.setSalarioDeseado(100);
        System.out.println(persona.getSalarioDeseado());

        //herencia y abstraccion
        Empleado empleado = new Empleado();
        empleado.nombre = "Cris";
        empleado.apellido = "Paez";
        empleado.edad = 44;
        empleado.activo = "ACTIVO";
        empleado.imprimirPersona();

        //abstraccion especifica
        Perro perro = new Perro();
        perro.comer();
        perro.moverse();

        Ave ave = new Ave();
        ave.comer();
        ave.moverse();

        Animal animal = new Perro();
        animal.comer();
        animal.moverse();

        Animal animal2 = new Ave();
        animal2.comer();
        animal2.moverse();

    }

}
