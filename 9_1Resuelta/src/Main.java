/*Actividad resuelta 9.1
Definir la interfaz Cola para numeros enteros,e implementarla en la clase Lista,
definida en la actividad resuelta 7.11. 

Nosotros,en esta implementacion,decidimos que la cabaza de la cola coincida con el
principio de la lista y el final de la cola con el final de la lista,pero se puede
hacer al contrario*/




public class Main {
    // prueba de los metodos de la clase LISTA
    public static void main(String[] args) throws Exception {
      Lista l1 = new Lista();
      Lista l2 = new Lista();
      l1.encolar(4);
      l1.encolar(5);
      l1.insertarFinal(6);
      l1.mostrar();
      l1.insertarPrincipio(3);
      l1.insertarPrincipio(2);
      l1.insertarPrincipio(1);
      l1.mostrar();
      l1.insertar(2, 99);
      l1.mostrar();
      l1.eliminar(2);
      l1.mostrar();
      System.out.println(l1.buscar (4));
      l2.insertarFinal(10);
      l2.insertarFinal(20);
      l2.insertarFinal(30);
      l2.insertarFinal(40);
      l2.insertarFinal(50);
      l2.mostrar();
      System.out.println(l1.desencolar());
      l1.mostrar();
  
    }
}