package models;

import java.time.LocalDate;

public class Venta {
    float precioFinal;
    String emailComprador;
    String emailVendedor;
    int puntuacion;
    String comentario;
    LocalDate fecha;

    public Venta(float precioFinal, String emailComprador, String emailVendedor,
                 int puntuacion, String comentario) {
        this.precioFinal = precioFinal;
        this.emailComprador = emailComprador;
        this.emailVendedor = emailVendedor;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fecha = LocalDate.now();
    }

    public float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(float precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getEmailComprador() {
        return emailComprador;
    }

    public void setEmailComprador(String emailComprador) {
        this.emailComprador = emailComprador;
    }

    public String getEmailVendedor() {
        return emailVendedor;
    }

    public void setEmailVendedor(String emailVendedor) {
        this.emailVendedor = emailVendedor;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "🧾 Operación\n" +
                "   💲 Precio final: " + precioFinal + "\n" +
                "   👤 Vendedor: " + emailVendedor + "\n" +
                "   👤 Comprador: " + emailComprador + "\n" +
                "   ⭐ Puntuación: " + puntuacion + "\n" +
                "   💬 Comentario: " + comentario + "\n" +
                "   📅 Fecha: " + fecha + "\n";
    }
}