package clases;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {

    private String nombre;
    private int edad;

    public Empleado() {}

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Empleado o) {
        if (this.edad == o.edad) {
           return this.nombre.compareTo(o.nombre);
        } else {
            return Integer.compare(this.edad, o.edad);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return getEdad() == empleado.getEdad() && Objects.equals(getNombre(), empleado.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
