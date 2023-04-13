class Socio implemnts Comparable{
    int id; //numero identificativo del socio
    String nombre;
    LacalDate fechaNacimiento;
    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
     //establecemos el formato español para las fechas:
     DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
     this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);

    }
    int edad() {
        return (int)fechaNacimiento.util(LocalDate.now(),ChronoUnit.YEARS);
    }
    /*el cast (int) es porque util()devuelve un valor long.Al ser de estrechamiento,en teoria
     * podria suponer una perdida de informacion para numeros muy grandes (de ahi un warning del copilador)
     * pero,por desgracia,las edades de las personas son enteros muy pequeños
     */
     @Override
     //la implementacion debe declararse public
     public int compareTo(Object ob) {
        int resultado;
        Socio otroSocio = (Socio) ob;
        if (id < otroSocio.id) { //this va antes que ob
            resultado = -1; // o cualquier numero negativo

     } else if (id > otroSocio.id) { // this va despues que ob
        resultado = 1; // o cualquier numero positivo

    } else { //this igual que ob
        resultado = 0;
    }
    return resultado;
}
public String toString() {
    return "Id: " + id + "Nombre: " + nombre + " Edad: " + edad() + "/n";
} // el "/n" del final es para que cada socio vaya en una linea distinta*       

