
import java.util.Scanner;//Tipo de libreria
import java.util.Stack;//Tipo de libreria

class MainL {// Nombre de la clase

    public static void main(String[] args) {//Metodo main
        Stack<Libros> pila = new Stack<>();//Manda a llamar la libreria Stack con la clase Libros
        Scanner op = new Scanner(System.in);//Mnda a llamar ele metodo Scanner
        Libros l1 = new Libros();//Creamos un nuevo objeto de los libros llamada l1
        System.out.println("Pon el nombre del Libro: ");//Pide al usuario poner un dato
        l1.setNombre(op.nextLine());//Guarda el dato en el setNombre
        System.out.println("Pon el numero de paginas del Libro: ");//Pide al usuario poner otro dato
        l1.setPaginas(op.nextInt());//Guarda el dato en el setPaginas
        System.out.println("Pon el editorial del Libro: ");//Pide al usuario poner otro dato
        l1.setEditorial(op.next());//Guarda el dato en el setEditorial
        System.out.println("Pon el autor del Libro: ");//Pide al usuario poner otro dato
        l1.setAutor(op.next());//Guarda el dato en el setAutor
        System.out.println("Datos del " + l1.toString());//imprime los datos guardados del usuario junto con metodo toString
        for (Libros libro : pila) {//itera la pila
            System.out.println(libro);//Imprime todos los valores de la pila
        }
    }
}
