package models;

import models.Venta;


public class Usuario {
    String email;
    String nombre;
    int clave;
    Productos p1;
    Productos p2;
    Venta vVendido;
    Venta vComprado;
    Productos pPedido1;
    Productos pPedido2;

    public Usuario(String email, int clave, String nombre) {
        this.email = email;
        this.clave = clave;
        this.nombre = nombre;
        this.p1 = null;
        this.p2 = null;
        this.vVendido = null;
        this.vComprado = null;
        this.pPedido1 = null;
        this.pPedido2 = null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Productos getP1() {
        return p1;
    }

    public void setP1(Productos p1) {
        this.p1 = p1;
    }

    public Productos getP2() {
        return p2;
    }

    public void setP2(Productos p2) {
        this.p2 = p2;
    }

    public Venta getvVendido() {
        return vVendido;
    }

    public void setvVendido(Venta vVendido) {
        this.vVendido = vVendido;
    }

    public Venta getvComprado() {
        return vComprado;
    }

    public void setvComprado(Venta vComprado) {
        this.vComprado = vComprado;
    }

    public Productos getpPedido1() {
        return pPedido1;
    }

    public void setpPedido1(Productos pPedido1) {
        this.pPedido1 = pPedido1;
    }

    public Productos getpPedido2() {
        return pPedido2;
    }

    public void setpPedido2(Productos pPedido2) {
        this.pPedido2 = pPedido2;
    }

    public void cambiaDatoPersonal(int op, String teclado) {
        switch (op) {
            case 1 -> this.setNombre(teclado);
            case 2 -> this.setEmail(teclado);
            case 3 -> this.setClave(Integer.parseInt(teclado));
        }

    }

    public void nuevoProducto(int id, String nombreProducto, String descripcionProducto, float precioProducto) {
        if (this.getP1() == null) {
            this.setP1(new Productos(id + 1, nombreProducto, descripcionProducto, precioProducto));
        } else if (this.getP2() == null) {
            this.setP2(new Productos(id + 2, nombreProducto, descripcionProducto, precioProducto));
        }

    }

    @Override
    public String toString() {
        return "👤 Usuario: " + nombre + "\n" +
                "   📧 Email: " + email + "\n" +
                "   🔑 Clave: " + clave + "\n";
    }

}
