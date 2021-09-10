/*
Defina una clase llamada DivisionNumero, utilice un Scanner 
para leer dos números en forma de cadena. A continuación, utilice el método 
parseInt() de la clase Integer, para convertir las cadenas al tipo int y 
guardarlas en dos variables de tipo int. Por ultimo realizar una división con 
los dos numeros y mostrar el resultado. 
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por 
teclado puede causar una excepción de tipo InputMismatchException, el método 
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una 
NumberFormatException y además, al dividir un número por cero surge una 
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques 
try/catch para las distintas excepciones
 */
package Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números");
        String numero1 = leer.next();
        String numero2 = leer.next();
        
        System.out.println("Inicio");
        convierteCadena(numero1, numero2);
        System.out.println("Fin");
    }

    public static void convierteCadena(String numero1, String numero2) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer n1 = 0, n2 = 0, n3 = 0;
        try {
            n1 = Integer.parseInt(numero1);
            n2 = Integer.parseInt(numero2);
            System.out.println("La división entre los dos números es: " + n1 / n2);
            System.out.println("Ahora ingrese el 3er número");
            n3 = leer.nextInt();
            System.out.println("El producto entre el 3er número y el resultado de la división es: " + n3 * (n1 / n2));

        } catch (NumberFormatException e) {
            System.out.println("Excepción de parseInt");
            System.out.println(e.toString());
        } catch (ArithmeticException e) {
            System.out.println("Excepción división por CERO");
            System.out.println(e.toString());
        } catch (InputMismatchException e) {
            System.out.println("Excepción de Ingreso");
            System.out.println(e.toString());
        } finally {
            System.out.println("--------------");
        }
    }
}
