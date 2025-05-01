import java.util.Scanner;

public class EjercicoHotel {
    static final int pisos = 2;
    static final int habitacionesPorPiso = 6;

    static String[][] cliente = new String[pisos][habitacionesPorPiso];
    static int[][] noches = new int[pisos][habitacionesPorPiso];
    static double[][] precio = new double[pisos][habitacionesPorPiso];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarEstado();

            System.out.println("\n1) Reservar");
            System.out.println("2) Cancelar");
            System.out.println("3) Reporte");
            System.out.println("4) Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 4) break;

            if (opcion == 1) {
                System.out.print("Número de habitación (101 al 106, 201 al 206): ");
                int numHab = scanner.nextInt();
                int piso = numHab / 100 - 1;
                int col = numHab % 100 - 1;

                if (!esValida(piso, col)) {
                    System.out.println("Habitación inválida.");
                } else if (cliente[piso][col] != null) {
                    System.out.println("Habitación ocupada.");
                } else {
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Nombre del cliente: ");
                    cliente[piso][col] = scanner.nextLine();
                    System.out.print("Noches a reservar: ");
                    noches[piso][col] = scanner.nextInt();
                    System.out.print("Precio por noche: ");
                    precio[piso][col] = scanner.nextDouble();
                    System.out.println("Reserva confirmada para habitación " + numHab);
                    double total = noches[piso][col] * precio[piso][col];
                    System.out.printf("Total a pagar: $%.2f%n", total);
                }

            } else if (opcion == 2) {
                System.out.print("Número de habitación a cancelar: ");
                int numHab = scanner.nextInt();
                int piso = numHab / 100 - 1;
                int col = numHab % 100 - 1;

                if (!esValida(piso, col) || cliente[piso][col] == null) {
                    System.out.println("No existe reserva en esa habitación.");
                } else {
                    cliente[piso][col] = null;
                    noches[piso][col] = 0;
                    precio[piso][col] = 0.0;
                    System.out.println("Reserva cancelada para habitación " + numHab);
                }

            } else if (opcion == 3) {
                generarReporteFinal();
            } else {
                System.out.println("Opción inválida.");
            }
        }

        scanner.close();
        System.out.println("hotel cerrado.");
    }

    static boolean esValida(int piso, int col) {
        return piso >= 0 && piso < pisos && col >= 0 && col < habitacionesPorPiso;
    }

    static void mostrarEstado() {
        System.out.println("\nEstado actual de las habitaciones:");
        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < habitacionesPorPiso; j++) {
                int numHab = (i + 1) * 100 + (j + 1);
                if (cliente[i][j] != null) {
                    System.out.printf("Hab %d: OCUPADA (%s)%n", numHab, cliente[i][j]);
                } else {
                    System.out.printf("Hab %d: LIBRE%n", numHab);
                }
            }
        }
    }

    static void generarReporteFinal() {
        System.out.println("\n--- Reporte Final ---");
        StringBuilder disponibles = new StringBuilder();
        StringBuilder ocupadas = new StringBuilder();

        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < habitacionesPorPiso; j++) {
                int numHab = (i + 1) * 100 + (j + 1);
                if (cliente[i][j] != null) {
                    double total = noches[i][j] * precio[i][j];
                    System.out.printf("Cliente: %s - Habitación: %d - Total a pagar: %.1f%n",
                            cliente[i][j], numHab, total);
                    ocupadas.append(numHab).append(", ");
                } else {
                    disponibles.append(numHab).append(", ");
                }
            }
        }

        if (disponibles.length() > 0) disponibles.setLength(disponibles.length() - 2);
        if (ocupadas.length() > 0) ocupadas.setLength(ocupadas.length() - 2);

        System.out.println("Habitaciones disponibles: " + disponibles);
        System.out.println("Habitaciones ocupadas: " + ocupadas);
    }
}
