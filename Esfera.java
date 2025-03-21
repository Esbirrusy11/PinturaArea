class Esfera extends Forma {
    double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4*Math.PI*(radio*radio);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
