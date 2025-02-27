// Clase Mascota
class Mascota { // Define la clase Mascota
    //Definicion de atributos
    String  nombre; 
    String raza;
    int edad; 

    Mascota() {}     // Constructor vacío

    // Getters y setters
    
    public String getNombre() {     // Getter para nombre
        return nombre;
    }

    public void setNombre(String nombre) {     // Setter para nombre
        this.nombre = nombre;
    }

    public String getRaza() {     // Getter para raza
        return raza;
    }

    public void setRaza(String raza) {     // Setter para raza
        this.raza = raza;
    }

    public int getEdad() {     // Getter para edad
        return edad;
    }

    public void setEdad(int edad) {     // Setter para edad
        this.edad = edad;
    }
    
    // Método toString para mostrar la información de la mascota
    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
    }
    

}