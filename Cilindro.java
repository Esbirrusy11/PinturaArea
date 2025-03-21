class Cilindro extends Forma {
    double radio;
    double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + radio +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
