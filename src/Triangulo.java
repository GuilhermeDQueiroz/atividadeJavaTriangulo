public class Triangulo {
    private double l1;
    private double l2;
    private double l3;

    public double getLado1() {
        return l1;
    }

    public double getLado2() {
        return l2;
    }

    public double getLado3() {
        return l3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.l1 = lado1;
        this.l2 = lado2;
        this.l3 = lado3;
    }

    public double calculaArea() {
        double soma = (this.l1 + this.l2 + this.l3) / 2.0;
        double area = Math.sqrt(soma * (soma - this.l1) * (soma - this.l2) * (soma - this.l3));
        return area;
    }

    public double calculaPerimetro() {
        return this.l1 + this.l2 + this.l3;
    }

    public String tipoTriangulo() {
        if (this.l1 == this.l2 && this.l1 == this.l3) {
            return "Equilátero";
        } else if (this.l1 != this.l2 && this.l1 != this.l3 && this.l2 != this.l3) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }

    public String verificaEquilatero() {
        return this.l1 == this.l2 && this.l1 == this.l3 ? "Sim" : "Não";
    }
}