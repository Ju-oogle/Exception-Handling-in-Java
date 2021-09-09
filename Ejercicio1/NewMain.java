package Ejercicio1;

import Ejercicio1.entidades.Persona;
import Ejercicio1.servicio.ServicioPersona;

public class NewMain {

    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();
        //String nombre, int edad, String sexo, float peso, float altura
        Persona p1 = new Persona();
        p1.setNombre("Ju Lieta");
        p1.setEdad(25);
        p1.setSexo("F");
        p1.setPeso(49);
        p1.setAltura((1.66));
        //Persona p1 = sp.crearPersona();

        Persona p2 = new Persona("Ale Jandro", 27, "H", 75, (1.80));
        //Persona p2 = sp.crearPersona();

        Persona p3 = new Persona("Mamba", 5, "F", 35, (1.30));
        //Persona p3 = sp.crearPersona();

        System.out.println(p1);
        sp.calcularIMC(p1);
        sp.esMayorDeEdad(p1);

        System.out.println(p2);
        sp.calcularIMC(p2);
        sp.esMayorDeEdad(p2);

        System.out.println(p3);
        sp.calcularIMC(p3);

        sp.esMayorDeEdad(null);

        //DESCOMENTAR 
//        Persona p4 = sp.crearPersona();
//        System.out.println(p4);
//        sp.calcularIMC(p4);
//        sp.esMayorDeEdad(null);
        
        sp.estadistica(3); //cambiar si se descomenta p4
    }

}
