class Usuario{
    String nombre,descripcionBre,fechadenacimiento;
    int edad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcionBre() {
        return descripcionBre;
    }
    public void setDescripcionBre(String descripcionBre) {
        this.descripcionBre = descripcionBre;
    }
    public String getFechadenacimiento() {
        return fechadenacimiento;
    }
    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", descripcionBre=" + descripcionBre + ", fechadenacimiento="
                + fechadenacimiento + ", edad=" + edad + "]";
    }

         
}