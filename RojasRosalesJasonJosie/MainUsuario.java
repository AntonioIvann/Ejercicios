// Importación de las clases necesarias
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Definición de la clase principal MainUsuario
class MainUsuario {
    public static void main(String[] args) {
        // Creación de una lista para almacenar objetos de tipo Usuario
        List<Usuario> list = new ArrayList<>();

        // Creación de un objeto Scanner para leer datos ingresados por el usuario
        Scanner op = new Scanner(System.in);

        // Variable de control para el bucle
        int i = 0;

        // Bucle do-while que se ejecuta 5 veces (i va de 0 a 4)
        do {
            // Creación de un nuevo objeto Usuario
            Usuario u1 = new Usuario();

            // Solicitud y almacenamiento del nombre del usuario
            System.out.println("Escribe tu nombre ");
            u1.setNombre(op.next());

            // Solicitud y almacenamiento de la edad del usuario
            System.out.println("Escribe tu edad");
            u1.setEdad(op.nextInt());

            // Solicitud y almacenamiento de la fecha de nacimiento del usuario
            System.out.println("Escribe tu fecha de nacimiento");
            u1.setFechadenacimiento(op.next());

            // Solicitud y almacenamiento de una breve descripción del usuario
            System.out.println("Escribe una Breve Descripcion de tu personalidad");
            u1.setDescripcionBre(op.next());

            // Agregar el objeto usuario a la lista
            list.add(u1);

            // Mostrar todos los usuarios almacenados en la lista
            for (Usuario p : list) {
                System.out.println(p);
            }

            // Incremento de la variable de control
            i++;
        } while (i != 5); // Se repite hasta que i sea igual a 5

        // Cierre del objeto Scanner para evitar fugas de recursos
        op.close();
    }
}
