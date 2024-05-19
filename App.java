import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        boolean salir = false;
        GestionF gestionf = new GestionF();

        try {
            do {

                System.out.println("______________ B I E N V E N I D O ______________");
                System.out.println("                  1. Hexágono                    ");
                System.out.println("                2. Paralelogramo                 ");
                System.out.println("                  3. Pentagono                   ");
                System.out.println("                   4. Rombo                      ");
                System.out.println("              5. Filtros por área                ");
                System.out.println("           6. Promedio de los perimetros         ");
                System.out.println("  7. Figura con área y perimetro máximo y mínimo ");
                System.out.println("  8. Promedio de perimetros pentagono y hexágono ");
                System.out.println("              9. Salir del programa              ");
                System.out.println("_________________________________________________");
                System.out.println("Seleccione una opción:                           ");
                opc = sc.nextInt();
                System.out.println();

                switch (opc) {
                    case 1:
                        System.out.println("       ==== HEXÁGONO ====        ");
                        boolean entradaHexagono = false;

                        // Validación de lado tipo entero
                        System.out.print("Ingrese el lado del hexágono: ");
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
                        System.out.println();

                        Hexagono hexagono = new Hexagono(0, 0, 0, 0, 0, ladoH);
                        // Llamada de métodos
                        double area = hexagono.calcularArea(ladoH);
                        int perimetro = hexagono.CalcularPerimetro(ladoH);
                        hexagono.setArea(area);
                        hexagono.setPerimetro(perimetro);

                        System.out.println("Área del hexágono: " + area);
                        System.out.println("Perímetro del hexágono: " + perimetro);

                        gestionf.anadirEquipos(hexagono);

                        double areaT = gestionf.calcularAreaTotal();
                        System.out.println();
                        System.out.println("Área total acumulada: " + areaT);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("    ==== PARALELOGRAMO ====   ");
                        System.out.print("Ingrese la base del paralelogramo: ");
                        int baseParaleloG = 0;
                        // Validación de base tipo entero
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

                        System.out.print("Ingrese la altura del paralelogramo: ");
                        int alturaParaleloG = 0;
                        // Validación de lado tipo entero
                        entradaParaleloG = false;
                        while (!entradaParaleloG) {
                            try {
                                alturaParaleloG = sc.nextInt();
                                entradaParaleloG = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Debe ingresar obligatoriamente un número entero.");
                                sc.nextLine();
                            }

                        }
                        System.out.print("Ingrese el valor del lado corto del paralelogramo: ");
                        int ladoC = sc.nextInt();
                        System.out.print("Ingrese el valor del lado largo del paralelogramo: ");
                        int ladoL = sc.nextInt();
                        System.out.println();

                        Paralelogramo paralelogramo = new Paralelogramo(0, 0, 0, baseParaleloG, alturaParaleloG);
                        // Llamada de métodos
                        double areaP = paralelogramo.CalcularArea(baseParaleloG, alturaParaleloG);
                        int perimetroP = paralelogramo.CalcularPerimetro(ladoC, ladoL);
                        paralelogramo.setArea(areaP);
                        paralelogramo.setPerimetro(perimetroP);

                        System.out.println("Área del paralelogramo: " + areaP);
                        System.out.println("Perímetro del paralelogramo: " + perimetroP);

                        gestionf.anadirEquipos(paralelogramo);

                        double areaTP = gestionf.calcularAreaTotal();
                        System.out.println();
                        System.out.println("Área total acumulada: " + areaTP);
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("     ==== PENTAGONO ====    ");
                        boolean entradaPentagono = false;
                        System.out.print("Ingrese el lado del pentagono: ");
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
                        System.out.println();

                        Pentagono pentagono = new Pentagono(0, 0, 0, 0, 0, ladoPentagono);
                        // Llamada de métodos
                        double areaPentagono = pentagono.CalcularArea(ladoPentagono);
                        int perimetroPentagono = pentagono.CalcularPerimetro(ladoPentagono);
                        pentagono.setArea(areaPentagono);
                        pentagono.setPerimetro(perimetroPentagono);

                        System.out.println("Área del pentagono: " + areaPentagono);
                        System.out.println("Perímetro del pentagono: " + perimetroPentagono);

                        gestionf.anadirEquipos(pentagono);

                        double areaTPent = gestionf.calcularAreaTotal();
                        System.out.println();
                        System.out.println("Área total acumulada: " + areaTPent);
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("          ==== ROMBO ====            ");
                        System.out.print("Ingrese el valor de la diagonal mayor: ");
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

                        System.out.print("Ingrese el valor de la diagonal menor: ");
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
                        System.out.print("Ingrese el lado del rombo: ");
                        int ladoR = sc.nextInt();
                        System.out.println();

                        Rombo rombo = new Rombo(0, 0, 0, diagMayor, diagMenor, ladoR);
                        // Llamada de métodos
                        double areaR = rombo.CalcularArea(diagMayor, diagMenor);
                        int perimetroR = rombo.CalcularPerimetro(ladoR);
                        rombo.setArea(areaR);
                        rombo.setPerimetro(perimetroR);

                        System.out.println("Área del rombo: " + areaR);
                        System.out.println("Perímetro del rombo: " + perimetroR);

                        gestionf.anadirEquipos(rombo);

                        double areaTR = gestionf.calcularAreaTotal();
                        System.out.println();
                        System.out.println("Área total acumulada: " + areaTR);
                        System.out.println();
                        break;

                    case 5:
                        System.out.print("Ingrese el valor límite del área: ");
                        int limite = sc.nextInt();
                        System.out.println();
                        System.out.println("       === Filtros por área ===             ");
                        System.out.println("1. Filtro de figuras con área menor a " + limite);
                        System.out.println("2. Filtro de figuras con área mayor a " + limite);
                        System.out.println("Seleccione una opción");
                        int opcionF = sc.nextInt();
                        System.out.println();

                        if (opcionF == 1) {
                            List<Figuras> filtromenores = gestionf.filtradoAreaMenora(limite);
                            System.out.println("Figuras con área menor a " + limite + ":");
                            filtromenores.forEach(m -> System.out.println("area: " + m.getArea()));
                        } else if (opcionF == 2) {
                            List<Figuras> filtromayores = gestionf.filtradoAreaMayora(limite);
                            System.out.println("Figuras con área mayor a " + limite + ":");
                            filtromayores.forEach(M -> System.out.println("area: " + M.getArea()));
                        } else {
                            System.out.println("Opción no válida");
                        }
                        System.out.println();
                        break;

                    case 6:
                        System.out.println("=== Promedio de los perimetros ===");
                        double promedioPerimetros = gestionf.calcularPromedioPerimetros();
                        System.out.println("Promedio de los perímetros de todas las figuras: " + promedioPerimetros);
                        System.out.println();
                        break;

                    case 7:
                        System.out.println("=== Area máxima ===");
                        gestionf.obtenerFiguraMaxArea()
                                .ifPresent(f -> System.out.println("Figura con área máxima: " + f.getArea()));
                        System.out.println("=== Area mínima ===");
                        gestionf.obtenerFiguraMinArea()
                                .ifPresent(f -> System.out.println("Figura con área mínima: " + f.getArea()));
                        System.out.println();
                        System.out.println("=== Perimetro máximo ===");
                        gestionf.obtenerFiguraMaxPerimetro()
                                .ifPresent(f -> System.out.println("Figura con perimetro maximo: "
                                        + f.getPerimetro()));
                        System.out.println("=== Perimetro mínimo ===");
                        gestionf.obtenerFiguraMinPerimetro()
                                .ifPresent(f -> System.out.println("Figura con perimetro minimo: "
                                        + f.getPerimetro()));
                        System.out.println();
                        break;

                    case 8:
                        double promedioPerimetrosPYH = gestionf.calcularPromedioPerimetrosHexagonoYPentagono();
                        System.out.println("El promedio de los perimetros de los hexágonos y pentagonos es: "
                                + promedioPerimetrosPYH);
                        System.out.println();
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } while (!salir);
        } catch (Exception e) {
            System.out.println("Error");
        }
        sc.close();
    }
}
