package view;

import java.util.Scanner;
import models.Usuario;
import utils.Menu;
import utils.Utils;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Usuario u1 = new Usuario("carlos.barroso@fernando3martos.com", 1234, "Carlos");
        Usuario u2 = new Usuario("fcanmae0512@g.educaaand.es", 4321, "Francisco");

        Usuario user = null;
        Usuario user2 = null;

        String email, teclado;
        int op, idProducto, idPedido;

        do {
            System.out.println(Menu.Bienvenida());
            System.out.print("Introduzca email (-1 para cerrar el programa): ");
            email = s.nextLine();

            if (!email.equals("-1")) {

                System.out.print("Introduzca clave: ");
                int clave = Integer.parseInt(s.nextLine());

                if (email.equals(u1.getEmail()) && clave == u1.getClave()) {
                    user = u1;
                    user2 = u2;
                } else if (email.equals(u2.getEmail()) && clave == u2.getClave()) {
                    user = u2;
                    user2 = u1;
                } else {
                    System.out.println("El usuario o la contraseña introducidos no son válidos.");
                    Utils.pulsaEnter();
                    Utils.limpiaPantalla();
                }

                if (user != null) {

                    System.out.println("Bienvenido " + user.getNombre());

                    do {
                        System.out.print(Menu.menuPrincipal());
                        op = Integer.parseInt(s.nextLine());
                        Utils.limpiaPantalla();

                        switch (op) {

                            case 1:
                                System.out.println(user);
                                Utils.pulsaEnter();
                                break;

                            case 2:
                                System.out.print(Menu.menuCambiarDatos());
                                op = Integer.parseInt(s.nextLine());

                                if (op >= 1 && op <= 3) {
                                    System.out.print("Introduce el nuevo valor: ");
                                    teclado = s.nextLine();
                                    user.cambiaDatoPersonal(op, teclado);
                                } else {
                                    System.out.println("Opción no válida");
                                }

                                Utils.pulsaEnter();
                                break;

                            case 3:
                                if (user.getP1() != null) System.out.println(user.getP1());
                                if (user.getP2() != null) System.out.println(user.getP2());
                                Utils.pulsaEnter();
                                break;

                            case 4:
                                if (user.getP1() != null && user.getP2() != null) {
                                    System.out.println("No puedes tener más productos.");
                                } else {
                                    System.out.print("Nombre: ");
                                    String nombre = s.nextLine();
                                    System.out.print("Descripción: ");
                                    String descripcion = s.nextLine();
                                    System.out.print("Precio: ");
                                    float precio = Float.parseFloat(s.nextLine());

                                    user.nuevoProducto(user == u1 ? 10 : 20, nombre, descripcion, precio);
                                }
                                Utils.pulsaEnter();
                                break;

                            case 5:
                                if (user2.getP1() != null) System.out.println(user2.getP1());
                                if (user2.getP2() != null) System.out.println(user2.getP2());

                                System.out.print("¿Quieres comprar? (S/N): ");
                                teclado = s.nextLine();

                                if (teclado.equals("S")) {
                                    System.out.print("ID del producto: ");
                                    idProducto = Integer.parseInt(s.nextLine());

                                    if (user2.getP1() != null && user2.getP1().getId() == idProducto) {
                                        if (user2.getpPedido1() == null)
                                            user2.setpPedido1(user2.getP1());
                                        else
                                            user2.setpPedido2(user2.getP1());
                                    }
                                }

                                Utils.pulsaEnter();
                                break;

                            case 6:
                                System.out.println(user.getpVendido());
                                Utils.pulsaEnter();
                                break;

                            case 7:
                                System.out.println(user.getpComprado());
                                Utils.pulsaEnter();
                                break;

                            case 8:
                                System.out.println("Cerrar pedido");
                                Utils.pulsaEnter();
                                break;

                            case 9:
                                System.out.println("Cerrando sesión...");
                                break;

                            default:
                                System.out.println("Opción no válida");
                                Utils.pulsaEnter();
                        }

                        Utils.limpiaPantalla();

                    } while (op != 9);
                }
            }

        } while (!email.equals("-1"));
    }
}
