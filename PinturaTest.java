import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinturaTest {
    @Test
    public void Pintura(){
        Rectangulo re=new Rectangulo(4,5);
        Cilindro ci=new Cilindro(2,3);
        Esfera es=new Esfera(2);
        Pintura pin=new Pintura(2);
        assertEquals(18.849,pin.CantidadPintura(ci),0.001);
        assertEquals(25.132,pin.CantidadPintura(es),0.001);
        assertEquals(10,pin.CantidadPintura(re),0.001);
    }
}
