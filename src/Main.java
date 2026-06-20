import  Bebidas.*;
import Complementos.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cafe cafe = null;
        int op;

        do {
            System.out.println("\n------ Cafeteria Negrito ------");
            System.out.println("1. Crear pedido");
            System.out.println("2. Pedido A ");
            System.out.println("3. Pedido B ");
            System.out.println("4. Pedido C ");
            System.out.println("5. Pedido D ");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción :D ");

            op = sc.nextInt();

            switch (op) {

                case 1:

                    System.out.println("\n--- Seleccione tipo de Café ---");
                    System.out.println("1. Tostado Negro");
                    System.out.println("2. Batido");
                    System.out.println("3. Descafeinado");
                    System.out.println("4. Expreso");

                    int tipoC = sc.nextInt();

                    switch (tipoC) {
                        case 1:
                            cafe = new TostadoNegro();
                            break;
                        case 2:
                            cafe = new Batido();
                            break;
                        case 3:
                            cafe = new Descafeinado();
                            break;
                        case 4:
                            cafe = new Expreso();
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }

                    int comp;

                    do {
                        System.out.println("\n--- Complementos ---");
                        System.out.println("1. Leche ");
                        System.out.println("2. Moca ");
                        System.out.println("3. Soya ");
                        System.out.println("4. Crema ");
                        System.out.println("5. Finalizar Pedido");
                        System.out.print("Seleccione: ");

                        comp = sc.nextInt();

                        switch (comp) {
                            case 1:
                                cafe = new Leche(cafe);
                                break;
                            case 2:
                                cafe = new Mocca(cafe);
                                break;
                            case 3:
                                cafe = new Soya(cafe);
                                break;
                            case 4:
                                cafe = new Crema(cafe);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opción invalida");
                        }

                    } while (comp != 5);

                    MostrarPedido(cafe);
                    break;

                case 2:
                    cafe = new Expreso();
                    cafe = new Leche(cafe);
                    cafe = new Soya(cafe);
                    cafe = new Crema(cafe);
                    cafe = new Mocca(cafe);
                    MostrarPedido(cafe);
                    break;

                case 3:
                    cafe = new Descafeinado();
                    cafe = new Mocca(cafe);
                    cafe = new Mocca(cafe);
                    cafe = new Soya(cafe);
                    cafe = new Leche(cafe);
                    MostrarPedido(cafe);
                    break;

                case 4:
                    cafe = new Batido();
                    cafe = new Crema(cafe);
                    cafe = new Crema(cafe);
                    cafe = new Leche(cafe);
                    cafe = new Leche(cafe);
                    cafe = new Soya(cafe);
                    cafe = new Soya(cafe);
                    cafe = new Mocca(cafe);
                    cafe = new Mocca(cafe);
                    MostrarPedido(cafe);
                    break;

                case 5:
                    cafe = new TostadoNegro();
                    cafe = new Crema(cafe);
                    cafe = new Crema(cafe);
                    cafe = new Soya(cafe);
                    cafe = new Soya(cafe);
                    cafe = new Soya(cafe);
                    MostrarPedido(cafe);
                    break;

                case 6:
                    System.out.println("Gracias por preferir Cafeteria negrito.");
                    break;

                default:
                    System.out.println("Opción invalida.");
            }

        } while (op != 6);

        sc.close();
    }

    public static void MostrarPedido(Cafe cafe) {
        System.out.println("\n------ RESUMEN DE SU PEDIDO ----");
        System.out.println("Descripción: " + cafe.getDescripcion());
        System.out.println("Costo Total: $" + cafe.getCosto());
    }
}