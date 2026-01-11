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
                    System.out.println("El usuario o la contraseña introducidos no son válidos, pulsa ENTER para continuar...");
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
                                System.out.println("Pulsa ENTER para continuar");
                                Utils.pulsaEnter();
                                break;
                            case 2:
                                System.out.print(Menu.menuCambiarDatos());
                                op = Integer.parseInt(s.nextLine());
                                if (op <= 3 && op >= 1) {
                                    System.out.print("Introduce el nuevo valor: ");
                                    teclado = s.nextLine();
                                    user.cambiaDatoPersonal(op, teclado);
                                    System.out.println("Cambios guardados correctamente, pulsa ENTER para continuar...");
                                } else {
                                    System.out.println("La opción introducida no es válida, pulsa ENTER para continuar...");
                                }
                                Utils.pulsaEnter();
                                break;
                            case 3:
                                if (user.getP1() == null && user.getP2() == null) {
                                    System.out.println("Actualmente no tienes ningún producto a la venta, pulsa ENTER para continuar...");
                                } else {
                                    if (user.getP1() != null) {
                                        System.out.println(user.getP1());
                                    }

                                    if (user.getP2() != null) {
                                        System.out.println(user.getP2());
                                    }

                                    System.out.println("Pulsa ENTER para continuar...");
                                }
                                Utils.pulsaEnter();
                                break;
                            case 4:
                                if (user.getP1() != null && user.getP2() != null) {
                                    System.out.println("No puedes tener más productos a la venta! Pulsa ENTER para continuar...");
                                } else {
                                    System.out.print("Introduce el nombre de tu producto: ");
                                    String nombreProducto = s.nextLine();
                                    System.out.print("Introduce la descripción de tu producto: ");
                                    String descripcionProducto = s.nextLine();
                                    System.out.print("Introduce el precio de tu producto: ");
                                    float precioProducto = Float.parseFloat(s.nextLine());
                                    user.nuevoProducto(user == u1 ? 10 : 20, nombreProducto, descripcionProducto, precioProducto);
                                    System.out.println("Producto registrado correctamente! Pulsa ENTER para continuar...");
                                }
                                Utils.pulsaEnter();
                                break;
                            case 5:
                                if (user2.getP1() != null || user2.getP2() != null) {
                                    System.out.print(user2.getP1() == null ? "" : user2.getP1() + "\n");
                                    System.out.print(user2.getP2() == null ? "" : user2.getP2() + "\n");
                                    System.out.println("¿Quieres comprar algún producto? (S/N): ");
                                    teclado = s.nextLine();
                                    if (teclado.equals("S")) {
                                        System.out.println("Introduce el ID del producto que quieres comprar: ");
                                        idProducto = Integer.parseInt(s.nextLine());
                                        if (user2.getP1() != null && user2.getP1().getId() == idProducto) {
                                            if (user2.getpPedido1() == null) user2.setpPedido1(user2.getP1());
                                            else if (user2.getpPedido2() == null) user2.setpPedido2(user2.getP1());
                                        } else if (user2.getP2() != null && user2.getP2().getId() == idProducto) {
                                            if (user2.getpPedido1() == null) user2.setpPedido1(user2.getP2());
                                            else if (user2.getpPedido2() == null) user2.setpPedido2(user2.getP2());
                                        } else System.out.println("El ID introducido no es válido.");
                                    } else if (teclado.equals("N")) System.out.print("");
                                    else System.out.println("La opción introducida no es válida.");
                                } else System.out.println("No hay productos disponibles a la venta.");
                                System.out.println("Pulsa ENTER para continuar...");
                                Utils.pulsaEnter();
                                break;
                            case 6:
                                System.out.println("===============================");
                                System.out.println("Histórico de ventas");
                                System.out.println(user.getpVendido());
                                System.out.println("===============================");
                                Utils.pulsaEnter();
                                break;
                            case 7:
                                System.out.println("===============================");
                                System.out.println("Histórico de compras");
                                System.out.println(user.getpComprado());
                                System.out.println("===============================");
                                Utils.pulsaEnter();
                                break;
                            case 8:
                                System.out.println();
                                if (user.getpPedido1() != null && user.getpPedido2() != null) {
                                    System.out.println("Tienes 2 pedidos pendientes: ");
                                    System.out.println(user.getpPedido1());
                                    System.out.println(user.getpPedido2());
                                    System.out.println("¿Quieres cerrar algún pedido? (S/N): ");
                                    teclado = s.nextLine();
                                    if (teclado.equals("S")){
                                        System.out.println("Introduce el ID del pedido que quieres cerrar: ");
                                        idPedido = Integer.parseInt(s.nextLine());
                                        if (user.getpPedido1().getId() == idPedido) {
                                            user.setpVendido(user.getpPedido1());
                                            user2.setpComprado(user.getpPedido1());
                                            user.setpPedido1(null);
                                            user.setP1(null);
                                        }
                                        else if (user.getpPedido2().getId() == idPedido) {
                                            user.setpVendido(user.getpPedido2());
                                            user2.setpComprado(user.getpPedido2());
                                            user.setpPedido2(null);
                                            user.setP2(null);
                                        }
                                        else System.out.println("El ID introducido no es válido.");
                                    }
                                } else {
                                    if (user.getpPedido1() != null) {
                                        System.out.println("Tienes 1 pedido pendiente: ");
                                        System.out.println(user.getpPedido1());
                                        System.out.println("¿Quieres cerrar el pedido? (S/N): ");
                                        teclado = s.nextLine();
                                        if (teclado.equals("S")) {
                                            user.setpVendido(user.getpPedido1());
                                            user2.setpComprado(user.getpPedido1());
                                            user.setpPedido1(null);
                                            user.setP1(null);
                                        }
                                    } else if (user.getpPedido2() != null) {
                                        System.out.println("Tienes 1 pedido pendiente: ");
                                        System.out.println(user.getpPedido2());
                                            System.out.println("¿Quieres cerrar el pedido? (S/N): ");
                                            teclado = s.nextLine();
                                            if (teclado.equals("S")){
                                                user.setpVendido(user.getpPedido2());
                                                user2.setpComprado(user.getpPedido2());
                                                user.setpPedido2(null);
                                                user.setP2(null);
                                            }
                                    } else System.out.println("No tienes pedidos pendientes.");

                                }
                                System.out.println("Pulsa ENTER para continuar...");
                                Utils.pulsaEnter();
                                break;
                            case 9:
                                System.out.print("Cerrando sesión");
                                for (int i = 0; i < 3; ++i) {
                                    try {
                                        //noinspection BusyWait
                                        Thread.sleep(600);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    System.out.print(".");
                                }
                                try {
                                    //noinspection BusyWait
                                    Thread.sleep(600);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                break;
                            default:
                                System.out.println("El valor introducido no es válido, pulsa ENTER para continuar...");
                                Utils.pulsaEnter();
                                Utils.limpiaPantalla();
                                break;
                        }
                        Utils.limpiaPantalla();
                    } while (op != 9);
                }
            }
        } while (!email.equals("-1"));
    }
}
