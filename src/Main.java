import Bebidas.*;
import Complementos.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalPedido = 0;
        String descripcionPedido = "";
        int seguir = 0;

        do {

            Cafe cafe = null;

            System.out.println("------ CAFETERIA EL NEGRITO ------");
            System.out.println("Menu de bebidas:");
            System.out.println("\t1. Expreso");
            System.out.println("\t2. Descafeinado");
            System.out.println("\t3. Batido");
            System.out.println("\t4. Tostado Negro");
            System.out.println("Seleccione el tipo de bebida: ");
            int opBebida = sc.nextInt();

            System.out.println("\nOpciones de tamaño:");
            System.out.println("\t1. Normal (N)");
            System.out.println("\t2. Mediano (M)");
            System.out.println("\t3. Grande (G)");
            System.out.println("Seleccione el tamaño de bebida: ");

            int opTam = sc.nextInt();

            String tamano = "";

            switch (opTam) {
                case 1:
                    tamano = "N";
                    break;
                case 2:
                    tamano = "M";
                    break;
                case 3:
                    tamano = "G";
                    break;
            }

            switch (opBebida) {
                case 1:
                    cafe = new Expreso(tamano);
                    break;
                case 2:
                    cafe = new Descafeinado(tamano);
                    break;
                case 3:
                    cafe = new Batido(tamano);
                    break;
                case 4:
                    cafe = new TostadoNegro(tamano);
                    break;
                default:
                    System.out.println("Opción inválida");
                    continue;
            }

            int op;

            do {

                System.out.println("\n----- COMPLEMENTOS -----");
                System.out.println("\t1. Leche");
                System.out.println("\t2. Mocca");
                System.out.println("\t3. Soya");
                System.out.println("\t4. Crema");
                System.out.println("\t5. Finalizar pedido");
                System.out.println("Seleccione complementos: ");

                op = sc.nextInt();

                if (op >= 1 && op <= 4) {

                    System.out.println("\nOpciones de tamaño:");
                    System.out.println("\t1. Normal (N)");
                    System.out.println("\t2. Mediano (M)");
                    System.out.println("\t3. Grande (G)");
                    System.out.println("Seleccione el tamaño de los complemnetos: ");

                    int opTamComp = sc.nextInt();

                    String tamComp = "";

                    switch (opTamComp) {
                        case 1:
                            tamComp = "N";
                            break;
                        case 2:
                            tamComp = "M";
                            break;
                        case 3:
                            tamComp = "G";
                            break;
                    }

                    switch (op) {

                        case 1:
                            cafe = new Leche(cafe, tamComp);
                            break;

                        case 2:
                            cafe = new Mocca(cafe, tamComp);
                            break;

                        case 3:
                            cafe = new Soya(cafe, tamComp);
                            break;

                        case 4:
                            cafe = new Crema(cafe, tamComp);
                            break;
                    }
                }

            } while (op != 5);

            descripcionPedido += "\n- " + cafe.getDescripcion();
            totalPedido += cafe.getCosto();

            System.out.println("\n¿Desea agregar otra bebida?");
            System.out.println("1. Si");
            System.out.println("2. No");

            seguir = sc.nextInt();

        } while (seguir == 1);

        System.out.println("\n===== RESUMEN DEL PEDIDO =====");
        System.out.println("Descripción: " + descripcionPedido);
        System.out.println("Costo Total: $ " + totalPedido);

        sc.close();
    }
}