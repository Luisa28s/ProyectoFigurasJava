import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        char continuar = 'S';

        try {
            do {

                System.out.println("_________ B I E N V E N I D O __________");
                System.out.println("             1. Hexágono                ");
                System.out.println("          2. Paralelogramo              ");
                System.out.println("             3. Pentagono               ");
                System.out.println("              4. Rombo                  ");
                System.out.println("________________________________________");
                System.out.println("Seleccione una opción:         ");
                opc = sc.nextInt();
                System.out.println();

                switch (opc) {
                    case 1:
                        System.out.println("HEXÁGONO");
                        System.out.println("Por favor ingrese el apotema del hexágono:");
                        int apotemaH = 0;
                        boolean entradaHexagono = false;
                        while (!entradaHexagono) {
                            try {
                                apotemaH = sc.nextInt();
                                entradaHexagono = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }
                        }
                        System.out.println();

                        System.out.println("Por favor ingrese el lado del hexágono:");
                        int ladoH = 0;
                        entradaHexagono = false;
                        while (!entradaHexagono) {
                            try {
                                ladoH = sc.nextInt();
                                entradaHexagono = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }

                        }

                        // Calcular promedio, área y perimetro del hexágono...
                        break;

                    case 2:
                        System.out.println("PARALELOGRAMO");
                        System.out.println("Por favor ingrese la base del paralelogramo:");
                        int baseParaleloG = 0;
                        boolean entradaParaleloG = false;
                        while (!entradaParaleloG) {
                            try {
                                baseParaleloG = sc.nextInt();
                                entradaParaleloG = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }
                        }
                        System.out.println();

                        System.out.println("Por favor ingrese el valor de el lado del paralelogramo:");
                        int ladoParaleloG = 0;
                        entradaParaleloG = false;
                        while (!entradaParaleloG) {
                            try {
                                ladoParaleloG = sc.nextInt();
                                entradaParaleloG = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }

                        }

                        // Calcular promedio, área y perimetro del paralelogramo...

                        break;

                    case 3:
                        System.out.println("PENTAGONO");
                        System.out.println("Por favor ingrese el apotema del pentagono:");
                        int apotemaPentagono = 0;
                        boolean entradaPentagono = false;
                        while (!entradaPentagono) {
                            try {
                                apotemaH = sc.nextInt();
                                entradaPentagono = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }
                        }
                        System.out.println();

                        System.out.println("Por favor ingrese el valor de el lado del pentagono:");
                        int ladoPentagono = 0;
                        entradaPentagono = false;
                        while (!entradaPentagono) {
                            try {
                                ladoPentagono = sc.nextInt();
                                entradaPentagono = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }

                        }
                        // Calcular promedio, área y perimetro del pentagono...

                        break;

                    case 4:
                        System.out.println("ROMBO");
                        System.out.println("Por favor ingrese el valor de la diagonal mayor: ");
                        int diagMayor = 0;
                        boolean entradaRombo = false;
                        while (!entradaRombo) {
                            try {
                                diagMayor = sc.nextInt();
                                entradaRombo = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }
                        }
                        System.out.println();

                        System.out.println("Por favor ingrese el valor de la diagonal menor: ");
                        int diagMenor = 0;
                        entradaRombo = false;
                        while (!entradaRombo) {
                            try {
                                diagMenor = sc.nextInt();
                                entradaRombo = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }
                        }
                        // Calcular promedio, área y perimetro del rombo...

                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } while (continuar == 'S' || continuar == 's');
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
