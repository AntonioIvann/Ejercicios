// Definición de la clase Usuario
class Usuario {
    // Atributos de la clase Usuario
    String nombre, descripcionBre, fechadenacimiento; // Nombre, descripción breve y fecha de nacimiento del usuario
    int edad; // Edad del usuario

    // Método para obtener el nombre del usuario
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la descripción breve del usuario
    public String getDescripcionBre() {
        return descripcionBre;
    }

    // Método para establecer la descripción breve del usuario
    public void setDescripcionBre(String descripcionBre) {
        this.descripcionBre = descripcionBre;
    }

    // Método para obtener la fecha de nacimiento del usuario
    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    // Método para establecer la fecha de nacimiento del usuario
    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    // Método para obtener la edad del usuario
    public int getEdad() {
        return edad;
    }

    // Método para establecer la edad del usuario
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método sobrescrito para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", descripcionBre=" + descripcionBre + ", fechadenacimiento="
                + fechadenacimiento + ", edad=" + edad + "]";
    }
}
