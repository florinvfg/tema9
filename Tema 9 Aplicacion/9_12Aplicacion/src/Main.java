/* 
9.12
Definir las interfaces Cola y Pila para objetos String e implementarlos en la clase Lista definida en la Actividad de aplicacion 9.11
*/









public class Main {
    // prueba de los metodos de la clase LISTA
    public static void main(String[] args) throws Exception {
      Lista l1 = new Lista();
      Lista l2 = new Lista();
      l1.encolar("Hola Mundo");
      l1.encolar("Hola");
      l1.encolar("asdasdasdasd");
      l1.mostrar();
      System.out.println(l1.desencolar());
      l1.desencolar();
      l1.desencolar();
      l1.mostrar();
      System.out.println(l1);
      l2.apilar("0");
      l2.apilar("20");
      l2.apilar("30");
      l2.mostrar();
      System.out.println(l2.desapilar());
      l2.desapilar();
      l1.desapilar();
      //System.out.println( l2);
  
    }
}
