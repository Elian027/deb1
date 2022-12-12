import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        int op = -1, op1 = 0;
        do {
            mostrarMenu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    do {
                        mostrarArea();
                        op1 = sc.nextInt();
                        switch (op1) {
                            case 1:
                                m.calcularAreaCuadrado();
                                System.out.println();
                                break;
                            case 2:
                                m.calcularAreaTriangulo();
                                System.out.println();
                                break;
                            case 3:
                                m.calcularAreaCirculo();
                                System.out.println();
                                break;
                            }
                    } while(op1!=0);
                    break;
                case 2:
                    do {
                        op = -1;
                        mostrarPerimetro();
                        op =sc.nextInt();
                        switch (op) {
                            case 1:
                                m.calcularPerimetroCuadrado();
                                System.out.println();
                                break;
                            case 2:
                                m.calcularPerimetroTriangulo();
                                System.out.println();
                                break;
                            case 3:
                                m.calcularPerimetroCirculo();
                                System.out.println();
                                break;
                        }
                    }while(op!=0);
                    break;
                case 3:
                    op1=-1;
                    mostrarVolumen();
                    op1=sc.nextInt();
                    switch (op1) {
                        case 1:
                            m.calcularVolumenCubo();
                            System.out.println();
                            break;
                        case 2:
                            m.calcularVolumenCilindro();
                            System.out.println();
                            break;
                        case 3:
                            m.calcularVolumenEsfera();
                            System.out.println();
                            break;
                    }
                    break;
            }
        } while(op!=0);

    }
    static void mostrarMenu() {
        System.out.println("MENU DE FIGURAS GEOMETRICAS");
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular perimetro");
        System.out.println("3. Calcular volumen");
        System.out.println("0. Salir");
        System.out.print("Ingrese la opcion a realizar: ");
    }

    static void mostrarArea() {
        System.out.println("MENU AREA DE FIGURAS");
        System.out.println("1. Area de cuadrado");
        System.out.println("2. Area de triangulo");
        System.out.println("3. Area de circulo");
        System.out.println("0. Regresar al menu principal");
        System.out.print("Ingrese el numero de la opcion: ");
    }

    static void mostrarPerimetro() {
        System.out.println("MENU PERIMETRO DE FIGURAS");
        System.out.println("1. Perimetro de cuadrado");
        System.out.println("2. Perimetro de triangulo");
        System.out.println("3. Perimetro de circulo");
        System.out.println("0. Regresar al menu principal");
        System.out.print("Ingrese el numero de la opcion: ");
    }

    static void mostrarVolumen() {
        System.out.println("MENU VOLUMEN DE FIGURAS");
        System.out.println("1. Volumen de cubo");
        System.out.println("2. Volumen de cilindro");
        System.out.println("3. Volumen de esfera");
        System.out.println("0. Regresar al menu principal");
        System.out.print("Ingrese el numero de la opcion: ");
    }

}