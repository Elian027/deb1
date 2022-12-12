public class Geometria_Elian {
    double radio;
    double formula;
    double l1;
    double l2;
    double l3;
    final double PI = 3.14;
    public Geometria_Elian() {
        radio = 0;
        formula=0;
        l1=0;
        l2=0;
        l3=0;
    }

    public Geometria_Elian(double radio, double formula, double l1, double l2, double l3) {
        this.radio = radio;
        this.formula = formula;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getFormula() {
        return formula;
    }

    public void setFormula(double formula) {
        this.formula = formula;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }
}
