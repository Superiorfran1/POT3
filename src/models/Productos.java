package models;

public class Productos {

    int id;
    String nombre;
    String descripcion;
    float precio;

    public Productos(int id, String nombre, String descripcion, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId() { return id; }
    public float getPrecio() { return precio; }

    @Override
    public String toString() {
        return "🛒 Producto " + id +
                "\nNombre: " + nombre +
                "\nDescripción: " + descripcion +
                "\nPrecio: " + precio;
    }
}
