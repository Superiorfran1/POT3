package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venta {
    private final float PRECIO_FINAL;
    private final String EMAIL_COMPRADOR;
    private final String EMAIL_VENDEDOR;
    private int puntuacion;
    private String comentario;
    private final LocalDate FECHA;

    public Venta(float precioFinal, String emailComprador, String emailVendedor,
                 int puntuacion, String comentario) {
        this.PRECIO_FINAL = precioFinal;
        this.EMAIL_COMPRADOR = emailComprador;
        this.EMAIL_VENDEDOR = emailVendedor;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.FECHA = LocalDate.now();
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String pintaProductoSinValorarComprador() {
        return "🧾 Operación\n" +
                "   💲 Precio final: " + PRECIO_FINAL + "\n" +
                "   👤 Vendedor: " + EMAIL_VENDEDOR + "\n" +
                "   📅 Fecha: " + FECHA.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
    }

    public String pintaProductoValoradoComprador() {
        return "🧾 Operación\n" +
                "   💲 Precio final: " + PRECIO_FINAL + "\n" +
                "   👤 Vendedor: " + EMAIL_VENDEDOR + "\n" +
                "   ⭐ Puntuación: " + "⭐".repeat(Math.max(0, puntuacion + 1)) + "\n" +
                "   💬 Comentario: " + comentario + "\n" +
                "   📅 Fecha: " + FECHA.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
    }
    public String pintaProductoSinValorarVendedor() {
        return "🧾 Operación\n" +
                "   💲 Precio final: " + PRECIO_FINAL + "\n" +
                "   👤 Comprador: " + EMAIL_COMPRADOR + "\n" +
                "   📅 Fecha: " + FECHA.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
    }

    public String pintaProductoValoradoVendedor() {
        return "🧾 Operación\n" +
                "   💲 Precio final: " + PRECIO_FINAL + "\n" +
                "   👤 Comprador: " + EMAIL_COMPRADOR + "\n" +
                "   ⭐ Puntuación: " + "⭐".repeat(Math.max(0, puntuacion + 1)) + "\n" +
                "   💬 Comentario: " + comentario + "\n" +
                "   📅 Fecha: " + FECHA.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n";
    }
}
