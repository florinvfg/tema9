import java.util.Scanner;

/*Actividividad resuelta 9.2

Utilizando la lista anterior,escribir un programa en el que se encolen numereos entereros introducidos por teclado,hasta que se introduzca uno negativo.
a continuacion,desencolarlos todos a medidas que se mostra por pantalla. */


public class App {
    public static void main(String[] args)  {
        Lista c = new Lista();
        System.out.println("Introducir numero: ");
        Integer n = new Scanner(System.in) .nextInt();
        while (n >= 0) {
            c.encolar(n);
            System.out.println("Introducir numero: ");
            n = new Scanner(System.in) .nextInt();
        
    }
    n = c.desencolar();
    while (n != null) {
        System.out.println(n+ ": ");
        n = c.desencolar();
}
}
}