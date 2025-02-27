
class Libros {// Declaración de la clase Libros

    String nombre, editorial, autor;// Declaramos tres variables llamadas nombre, editorial y autor
    int paginas;// Declaramos uns variable llamada pagina

    Libros() {// Creamos un metodo constructor llamado Libros
    }

    public String getNombre() {// Método público para obtener el valor del nombre
        return nombre;// Retorna el valor almacenado del nombre
    }

    public void setNombre(String nombre) {// Método público para establecer el valor del nombre
        this.nombre = nombre;// Asigna el valor pasado como parámetro a la variable nombre
    }

    public String getEditorial() {// Método público para obtener el valor del editorial
        return editorial;// Retorna el valor almacenado del editorial
    }

    public void setEditorial(String editorial) {// Método público para establecer el valor del editoril
        this.editorial = editorial;// Asigna el valor pasado como parámetro a la variable editorial
    }

    public String getAutor() {// Método público para obtener el valor del autor
        return autor;// Retorna el valor almacenado del autor
    }

    public void setAutor(String autor) {// Método público para establecer el valor del autor
        this.autor = autor;// Asigna el valor pasado como parámetro a la variable autor
    }

    public int getPaginas() {// Método público para obtener el valor de las paginas
        return paginas;// Retorna el valor almacenado de las paginas
    }

    public void setPaginas(int paginas) {// Método público para establecer el valor de las paginas
        this.paginas = paginas;// Asigna el valor pasado como parámetro a la variable paginas
    }

    @Override
    public String toString() {//Ayuda a dar mejor el formato a la información
        return "Libro es: [nombre=" + nombre + ", editorial=" + editorial + ", autor=" + autor + ", paginas=" + paginas
                + "]";//retorna los valores almacenados
    }

}
