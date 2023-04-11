import java.util.Scanner;

/*Actividividad resuelta 9.3
Definir la interfaz Pila para numeros enteros. */

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
