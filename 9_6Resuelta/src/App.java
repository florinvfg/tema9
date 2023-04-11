import java.util.Scanner;

/*Actividividad resuelta 9.6

Implementar,en interfaz Cola,el metodo encolarMultiple(),que encole un mismo elemento varias veces seguidas. */


public class App {
    public static void main(String[] args) throws Exception {
       interfaceCola cola = new interfaceCola() {
        Lista l = new Lista(); // aqui guardamos los numeros
        @Override
        public void encolar(Integer nuevo) {
            l.insertarFinal(nuevo);
        }
        @Override
        public Integer desencolar() {
            return l.eliminar(0);
        }

       };
       System.out.println( "Introducir numero (negativo para salir):");
       Integer n = new Scanner(System.in).nextInt();
       while (n >= 0) {
        cola.encolar(n);
        System.out.println("iNTRODUCIR NUMERO: ");
        n = new Scanner(System.in).nextInt();
       }
       n = cola.desencolar();
       while (n != null) {
        System.out.println(n + " ");
        n = cola.desencolar();
       }
    }
}

