/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

import java.sql.Array;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javaclasesobjetos.Persona;

/**
 *
 * @author lguzman
 */
public class TiposDatos {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int edad = 40;
        String cadena = "cadenas";
        double sueldo = 100.25;
        Date date = new Date();
        boolean bRegistro = false;
        System.out.println(edad + " " + cadena + " " + sueldo + " " + date + " " + bRegistro);
        int[] secuencia = {1, 2, 3, 4};
        Integer[] secuenciaClass = {1, 2, 3, 4};
        char[] palabra = {'h', 'o', 'l', 'a'};
        Character[] palabraClass = {'h', 'o', 'l', 'a'};
        for (int num : secuencia) {
            System.out.print(num);
        }
        System.out.println("\nComo clase");
        for (int num : secuenciaClass) {
            System.out.print(num);
        }
        System.out.println();
        for (char c : palabra) {
            System.out.print(c);
        }
        System.out.println();

        String[] myArrCadena = new String[3];
        myArrCadena[0] = "UNO";
        myArrCadena[1] = "DOS";
        myArrCadena[2] = "TRES";
        for (String micadena : myArrCadena) {
            System.out.println(micadena);
        }
        Object[] myObjects = new Object[]{
            "Cadena",
            1,
            10.20,
            myArrCadena
        };
        for (Object miobj : myObjects) {
            System.out.println(miobj);
        }
        List<String> listaCadena = new ArrayList<>();
        listaCadena.add("Item1");
        listaCadena.add("Item2");

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("NOMBRE1", "APELLIDO1", 10, "ACTIVO"));
        personas.add(new Persona("NOMBRE2", "APELLIDO2", 20, "INACTIVO"));
        personas.add(new Persona("NOMBRE2", "APELLIDO3", 30, "ACTIVO"));

        for (Persona person : personas) {
            System.out.println(person.toString());
        }

        //funciones
        decirHola("Luis");

        imprime(secuenciaClass);
        imprime(palabraClass);
    }

    public static void decirHola(String name) {
        System.out.println("HOla " + name);
    }

    public static <T> void imprime(T[] miArreglo) {
        for (T valor : miArreglo) {
            System.out.printf("%s ", valor);
        }
        System.out.println();
    }
}
