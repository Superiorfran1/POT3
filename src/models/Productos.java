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
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "🛒 Producto: " + id + "\n" +
                " 🏷️ Nombre: " + nombre + "\n" +
                " 📄 Descripción: " + descripcion + "\n" +
                " 💲 Precio: " + precio + "\n";
    }
}
