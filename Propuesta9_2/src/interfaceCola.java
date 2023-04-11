interface ColaDoble{
  // código de la clase Lista
  
  Integer[] Lista = null;

  public default void insertarInicio(Integer elemento) {
      insertarInicio(elemento);
  }
  
  public default void insertarFinal(Integer elemento) {
      insertarFinal(elemento);
  }
  
  public default Integer eliminarInicio() {
      return desencolar();
  }
  
  public Integer desencolar();

  public default Integer eliminarFinal() {
      return eliminar(Lista.length - 1);
  }
  
  public Integer eliminar(int i);

  public default Integer primero(Integer[] Lista) {
      if (Lista.length > 0) {
          return Lista[0];
      } else {
          return null;
      }
  }
  
  public default Integer ultimo(Integer[] Lista) {
      if (Lista.length > 0) {
          return Lista[Lista.length - 1];
      } else {
          return null;
      }
  }
}

