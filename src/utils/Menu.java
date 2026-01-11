package utils;

public class Menu {

    public static String Bienvenida() {
        return """
        Bienvenido a FernanPop
        =====================
        """;
    }

    public static String menuPrincipal() {
        return """
        1. Ver perfil
        2. Cambiar datos
        3. Ver productos
        4. Nuevo producto
        5. Comprar
        6. Ventas
        7. Compras
        8. Cerrar venta
        9. Salir
        """;
    }

    public static String menuCambiarDatos() {
        return """
        1. Nombre
        2. Email
        3. Clave
        """;
    }
}
