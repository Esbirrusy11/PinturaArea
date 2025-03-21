public class Pintura {
    double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double CantidadPintura(Forma formacion){
        double cantidadpint;
        cantidadpint= formacion.area()/cobertura;
        return cantidadpint;
    }
}
