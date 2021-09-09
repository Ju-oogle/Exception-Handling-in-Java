package Ejercicio1.servicio;

import Ejercicio1.entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    //creo variables locales que me van a servir para el metodo estadistica
    private int pesoIdeal = 0, bajoPeso = 0, sobrepeso = 0, contMayor = 0, contMenor = 0;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo crearPersona(): el método crear persona, le pide los valores de
     * los atributos al usuario y después se le asignan a sus respectivos
     * atributos para llenar el objeto Persona.Además, comprueba que el sexo
     * introducido sea correcto, es decir, H, M ú O. Si no es correcto se deberá
     * mostrar un mensaje
     *
     * @return Persona
     */
    public Persona crearPersona() {
        boolean bandera = true;
        String sexo;
        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese edad:");
        int edad = leer.nextInt();

        do {
            System.out.println("Ingrese el sexo indicando: (H)si es hombre, (M) mujer ú (O) otros");
            sexo = leer.next().toUpperCase();
            if (sexo.length() > 1) {
                System.out.println("ERROR solo puede ingresar una letra");
                bandera = false;
            }

            if (sexo.startsWith("H") || sexo.startsWith("M") || sexo.startsWith("O")) {
                bandera = true;
            } else {
                System.out.println("ERROR ha ingresado un sexo inválido");
                bandera = false;
            }

        } while (!bandera);

        System.out.println("Ingrese el peso: ");
        float peso = leer.nextFloat();
        System.out.println("Ingrese la altura: ");
        double altura = leer.nextDouble();
        leer.close();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    /*
    * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
    * la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 
    * 25 (incluidos), significa que el peso está por debajo de su peso ideal y la 
    * función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor 
    * mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve 
    * un 1. Se recomienda hacer uso de constantes para devolver estos valores.
    * @param p Persona
    * @return IMC
    */
    public int calcularIMC(Persona p) {
        int imc = 0;
        if ((p.getPeso()) / (p.getAltura() * p.getAltura()) > 25) {
            imc = 1;
            sobrepeso++;
            System.out.println("Sobrepeso");
        } else if ((p.getPeso()) / (p.getAltura() * p.getAltura()) >= 20) {
            imc = 0;
            pesoIdeal++;
            System.out.println("Peso Ideal");
        } else {
            imc = -1;
            bajoPeso++;
            System.out.println("Bajo Peso");
        }
        return imc;
    }

    /**
     * Método esMayorDeEdad(): indica si la persona es mayor de edad.La función
     * devuelve un booleano.
     *
     * @param p Persona
     * @return boolean
     */
    Persona p;

    public boolean esMayorDeEdad(Persona p) {
        boolean mayor = false;
        try {
            if (p.getEdad() > 18) {
                mayor = true;
                contMayor++;
            } else {
                contMenor++;
            }
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
        return mayor;
    }

    /*
    * calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso,
    * cuantas en su peso ideal y cuantos, por encima, y también calcularemos un 
    * porcentaje de cuantos son mayores de edad y cuantos menores. 
    * Metodo estadistica recibe la cantidad de personas para poder calcular los
    * porcentajes utilizando las varibles contadores locales
    * @param int cantPersonas
    */
    
    public void estadistica(int cantPersonas) {
        System.out.println("------------- RESULTADOS -------------");
        System.out.println("");
        System.out.println(contMayor + " personas son mayores de edad, representando el " + (contMayor * 100) / cantPersonas + "%");
        System.out.println(contMenor + " personas son menores de edad, es decir, el " + (contMenor * 100) / cantPersonas + "%");
        System.out.println("");
        System.out.println(bajoPeso + " Personas tienen un peso inferior al recomendado (" + (bajoPeso * 100) / cantPersonas + ")");
        System.out.println(pesoIdeal + " Personas están en su peso ideal (" + (pesoIdeal * 100) / cantPersonas + ")");
        System.out.println(sobrepeso + " Personas tienen un peso superior al recomendado (" + (sobrepeso * 100) / cantPersonas + ")");
        System.out.println("------------- ---------- -------------");

    }

}
