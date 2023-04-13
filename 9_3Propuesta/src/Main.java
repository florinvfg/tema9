/*9.3 Propuesta
 * Verifica que,para comparar numeros enteros,so equivalentes las dos 
 * implementaciones propuestas con los id de los socios 
 */


 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 
 public class Main {
     public static void main(String[] args) {
         // Crear algunos objetos Socio
         Socio socio1 = new Socio(1, "Juan", "01-01-1980");
         Socio socio2 = new Socio(3, "Pedro", "01-01-1970");
         Socio socio3 = new Socio(2, "María", "01-01-1990");
 
         // Crear una lista de objetos Socio y añadir los objetos creados anteriormente
         List<Socio> listaSocios = new ArrayList<>();
         listaSocios.add(socio1);
         listaSocios.add(socio2);
         listaSocios.add(socio3);
 
         
 // Ordenar la lista de objetos Socio por id
 Collections.sort (List<Socio>);
 
 // Imprimir la lista de objetos Socio ordenada
 for (Socio s : listaSocios) {
     System.out.println(s);
 }
     }
 }
 
