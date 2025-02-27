class MainMascota {  // Define la clase MainMascota 
    public static void main(String[] args) {
        // Crear 4 mascotas

        Mascota m1 = new Mascota(); // Crear una mascota 1
        m1.setNombre("Pepe");
        m1.setRaza("Gato");
        m1.setEdad(5);

        Mascota m2 = new Mascota(); // Crear una mascota 2
        m2.setNombre("Luna");
        m2.setRaza("Labrador");
        m2.setEdad(3);

        Mascota m3 = new Mascota(); // Crear una mascota 3
        m3.setNombre("Rocky");
        m3.setRaza("Bulldog");
        m3.setEdad(4);

        Mascota m4 = new Mascota();  // Crear una mascota 4
        m4.setNombre("Milo");
        m4.setRaza("Golden Retriever");
        m4.setEdad(2);
        
        // Mostrar la información de las 4 mascotas con el método toString
        System.out.println("Datos de las mascotas:");
        System.out.println("----------------------");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());


    }



}