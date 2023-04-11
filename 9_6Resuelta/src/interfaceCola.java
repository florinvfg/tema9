  interface interfaceCola {
    void encolar (Integer nuevo);//metodo abstracto
    Integer desencolar();
    default void encolarMultiple(Integer nuevo, int repeticiones) {
      for (int i = 0; i < repeticiones; i++) {
        encolar(nuevo); // a implementar en la clase
      }
     }
    
}
