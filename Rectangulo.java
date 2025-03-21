class Rectangulo extends Forma{
    double longitud;
    double ancho;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return ancho*longitud;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
