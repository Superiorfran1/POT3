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
                        Menú de usuario
                1. Mostrar mi perfil de usuario
                2. Cambiar mis datos personales
                3. Ver mis productos en venta
                4. Poner a la venta un nuevo producto
                5. Ver todos los productos en venta de la aplicación
                6. Ver mi histórico de ventas.
                7. Ver mi histórico de compras.
                8. Cerrar la venta de un producto o quitarlo de la venta.
                9. Salir
                Introduzca la opción deseada:\s""";
    }

    public static String menuCambiarDatos() {
        return """
        1. Nombre
        2. Email
        3. Clave
        Introduzca la opción deseada:\s""";
    }
}
