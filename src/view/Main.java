package view;

import java.util.Scanner;
import models.Usuario;
import utils.Menu;
import utils.Utils;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Usuario u1 = new Usuario("carlos.barroso@fernando3martos.com", 1234, "Carlos", null, null);
        Usuario u2 = new Usuario("fcanmae0512@g.educaaand.es", 4321, "Francisco", null, null);
        Usuario user = null;
        String email;
        int op;


        do {
            System.out.println(Menu.Bienvenida());
            System.out.print("Introduzca email (-1 para cerrar el programa): ");
            email = s.nextLine();
            if (!email.equals("-1")) {
                System.out.print("Introduzca clave: ");
                int clave = Integer.parseInt(s.nextLine());
                if (email.equals(u1.getEmail()) && clave == u1.getClave()) {
                    user = u1;
                } else if (email.equals(u2.getEmail()) && clave == u2.getClave()) {
                    user = u2;
                } else {
                    System.out.println("El usuario o la contraseña introducidos no son válidos, pulsa ENTER para continuar...");
                    Utils.pulsaEnter();
                    Utils.limpiaPantalla();
                }
                if (user != null) {
                    System.out.println("Bienvenido " + user.getNombre());
                    do{
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
                                    String teclado = s.nextLine();
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
                                System.out.print(u1.getP1() == null ? "" : u1.getP1() + "\n");
                                System.out.print(u1.getP2() == null ? "" : u1.getP2() + "\n");
                                System.out.print(u2.getP1() == null ? "" : u2.getP1() + "\n");
                                System.out.print(u2.getP2() == null ? "" : u2.getP2() + "\n");
                                Utils.pulsaEnter();
                                break;
                            case 6:
                                Utils.pulsaEnter();
                                break;
                            case 7:
                                Utils.pulsaEnter();
                                break;
                            case 8:
                                Utils.pulsaEnter();
                                break;
                            case 9:
                                System.out.print("Cerrando sesión");
                                for (int i = 0; i < 3; ++i) {
                                    try {
                                        Thread.sleep(600L);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }

                                    System.out.print(".");
                                }
                                try {
                                    Thread.sleep(600L);
                                    break;
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            default:
                                System.out.println("El valor introducido no es válido, pulsa ENTER para continuar...");
                                Utils.pulsaEnter();
                                Utils.limpiaPantalla();
                        }
                        Utils.limpiaPantalla();
                    }while (op != 9);
                }
            }
        }while(!email.equals("-1"));
    }
}
