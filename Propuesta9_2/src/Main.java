import java.util.Scanner;

/*Actividad propuesta 9.2

Implementa la interfaz ColaDoble en la clase Lista de enteros. */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista pila = new Lista(); // creamos una nueva lista para apilar

        // pedimos al usuario que introduzca números enteros hasta que se introduzca un número negativo
        System.out.println("Introduce números enteros para apilar (introduce un número negativo para salir):");
        int n = sc.nextInt();
        while (n >= 0) {
            pila.insertarPrincipio(n); // apilamos el número en la lista
            n = sc.nextInt();
        }

        // desapilamos todos los elementos de la lista y los mostramos en pantalla
        System.out.println("Elementos desapilados:");
        while (pila.numeroElementos() > 0) {
            System.out.println(pila.desencolar());
        }
    }
}