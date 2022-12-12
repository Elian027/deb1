import java.text.DecimalFormat;
import java.util.Scanner;

public class metodos {
    Geometria_Elian g = new Geometria_Elian();
    Scanner sc = new Scanner(System.in);
    DecimalFormat dfr =  new DecimalFormat ("#.00");
    double l1 = 0, res = 0, l2 = 0, l3 = 0;
        public void calcularAreaCuadrado() {
            System.out.print("Ingrese el lado del cuadrado: ");
            l1 = sc.nextDouble();
            g.setL1(l1);
            res = Math.pow(g.getL1(),2);
            g.setFormula(res);
            System.out.println("El area del cuadrado es -> "+g.getFormula());
        }
        public void calcularAreaTriangulo() {
            System.out.print("Ingrese la altura: ");
            l1 = sc.nextDouble();
            g.setL1(l1);
            System.out.print("Ingrese la base: ");
            l2 = sc.nextDouble();
            g.setL2(l2);
            res = ((g.getL1()*g.getL2())/2);
            g.setFormula(res);
            System.out.println("El area del triangulo es -> "+g.getFormula());
        }
        public void calcularAreaCirculo() {
            System.out.print("Ingresar radio: ");
            l1=sc.nextDouble();
            g.setL1(l1);
            res = g.PI * Math.pow(g.getL1(),2);
            g.setFormula(res);
            System.out.println("El area del circulo es -> "+g.getFormula());
        }
        public void calcularPerimetroCuadrado() {
            System.out.print("Ingrese el lado: ");
            l1 = sc.nextDouble();
            g.setL1(l1);
            res = g.getL1()*4;
            g.setFormula(res);
            System.out.println("El perimetro del cuadrado es -> "+g.getFormula());
        }
        public void calcularPerimetroTriangulo() {
            System.out.print("Ingrese el lado: ");
            l1 = sc.nextDouble();
            g.setL1(l1);
            res = g.getL1()*3;
            g.setFormula(res);
            System.out.println("El perimetro del triangulo es -> "+g.getFormula());
        }
        public void calcularPerimetroCirculo() {
            System.out.println("Ingrese el radio: ");
            l1 = sc.nextDouble();
            g.setL1(l1);
            res = g.getL1()*2*g.PI;
            g.setFormula(res);
            System.out.println("El perimetro del circulo es -> "+g.getFormula());
        }
        public void calcularVolumenCubo() {
            System.out.print("Ingrese el lado del cubo: ");
            l1=sc.nextDouble();
            g.setL1(l1);
            res = Math.pow(g.getL1(),3);
            g.setFormula(res);
            System.out.println("El volumen del cubo es -> "+g.getFormula());
        }
        public void calcularVolumenCilindro() {
            System.out.print("Ingrese el radio: ");
            l1 = sc.nextDouble();
            g.setL1(l1);
            System.out.print("Ingrese la altura: ");
            l2= sc.nextDouble();
            g.setL2(l2);
            res = g.PI * Math.pow(g.getL1(),2) * g.getL2();
            g.setFormula(res);
            System.out.println("El volumen del cilindro es -> "+g.getFormula());
        }
        public void calcularVolumenEsfera() {
            double s = 1.333333;
            System.out.print("Ingrese el radio: ");
            l1=sc.nextDouble();
            g.setL1(l1);
            res = s * Math.PI * Math.pow(g.getL1(),3);
            g.setFormula(res);
            System.out.println("El volumen de la esfera es -> "+dfr.format(g.getFormula()));
        }
}
