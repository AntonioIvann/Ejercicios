import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MainUsuario{
    public static void main(String[] args){
        List<Usuario> list=new ArrayList<>();
        Scanner op=new Scanner(System.in);
        int i =0;
        do{
            Usuario u1=new Usuario();
 System.out.println("Escribe tu nombre ");
 u1.setNombre(op.next());
 System.out.println("Escribe tu edad");
 u1.setEdad(op.nextInt());
 System.out.println("Escribe tu fecha de nacimiento");
 u1.setFechadenacimiento(op.next());
 
System.out.println("Escribe una Breve Descripcion de tu personalidad");
u1.setDescripcionBre(op.next());
list.add(u1);
for(Usuario p:list){
    System.out.println(p);
}
i++;
        }while(i!=5);
    }



}