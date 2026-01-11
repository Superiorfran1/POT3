package utils;

public class Menu {

    public static String Bienvenida() {
        return """
        Bienvenido al programa FernanPop
        Compra y vende tus artículos en nuestro Centro
        ==================================================
        """;
    }

    public static String menuPrincipal() {
        return """
        ****************************************
                    Menú de usuario
        1. Mostrar mi perfil de usuario
        2. Cambiar mis datos personales
        3. Ver mis productos en venta
        4. Poner a la venta un nuevo producto
        5. Ver todos los productos en venta de la aplicación
        6. Ver mi histórico de ventas
        7. Ver mi histórico de compras
        8. Cerrar la venta de un producto o quitarlo de la venta
        9. Salir
        Introduzca la opción deseada:
        """;
    }

    public static String menuCambiarDatos() {
        return """
        *************************************
               Cambio de datos
        1. Cambiar el nombre de usuario
        2. Cambiar el correo del usuario
        3. Cambiar la clave del usuario
        Introduce la opción deseada:
        """;
    }
}
