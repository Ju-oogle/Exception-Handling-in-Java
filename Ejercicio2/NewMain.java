/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango)
 */
package Ejercicio2;

public class NewMain {

    public static void main(String[] args) {
        
        System.out.println("Inicia el programa: ");

        int[] vector = new int[10];

        try {
            for (int i = 0; i < 11; i++) {
                vector[i] = (int) Math.random() * 100 + 1;
                System.out.println("[" + i + "] ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido un error -> " +e.toString());
        }

        System.out.println("Finaliza el programa.-");
    }

}
