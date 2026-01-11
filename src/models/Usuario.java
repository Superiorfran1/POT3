package models;

public class Usuario {

    String email;
    String nombre;
    int clave;

    Productos p1;
    Productos p2;
    Productos pVendido;
    Productos pComprado;
    Productos pPedido1;
    Productos pPedido2;

    public Usuario(String email, int clave, String nombre) {
        this.email = email;
        this.clave = clave;
        this.nombre = nombre;
    }

    public String getEmail() { return email; }
    public String getNombre() { return nombre; }
    public int getClave() { return clave; }

    public Productos getP1() { return p1; }
    public Productos getP2() { return p2; }

    public Productos getpVendido() { return pVendido; }
    public Productos getpComprado() { return pComprado; }

    public Productos getpPedido1() { return pPedido1; }
    public Productos getpPedido2() { return pPedido2; }

    public void setpPedido1(Productos p) { pPedido1 = p; }
    public void setpPedido2(Productos p) { pPedido2 = p; }

    public void setpVendido(Productos p) { pVendido = p; }
    public void setpComprado(Productos p) { pComprado = p; }

    public void cambiaDatoPersonal(int op, String dato) {
        if (op == 1) nombre = dato;
        if (op == 2) email = dato;
        if (op == 3) clave = Integer.parseInt(dato);
    }

    public void nuevoProducto(int id, String n, String d, float p) {
        if (p1 == null) p1 = new Productos(id + 1, n, d, p);
        else if (p2 == null) p2 = new Productos(id + 2, n, d, p);
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + "\nEmail: " + email;
    }
}
