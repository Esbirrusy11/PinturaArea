import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForma {

    @Test
    public void ToString(){
        Rectangulo re=new Rectangulo(4,5);
        Cilindro ci=new Cilindro(2,3);
        Esfera es=new Esfera(2);
        re.toString();
        ci.toString();
        es.toString();
    }

    @Test
    public void Area(){
        Rectangulo re=new Rectangulo(4,5);
        Cilindro ci=new Cilindro(2,3);
        Esfera es=new Esfera(2);
        assertEquals(20, re.area());
        assertEquals(37.69911184307752,ci.area());
        assertEquals(50.26548245743669,es.area());
    }

    @Test
    public void Pintura(){
        Rectangulo re=new Rectangulo(4,5);
        Cilindro ci=new Cilindro(2,3);
        Esfera es=new Esfera(2);
        Pintura pin=new Pintura(2);
        assertEquals(18.84955592153876,pin.CantidadPintura(ci));
        assertEquals(25.132741228718345,pin.CantidadPintura(es));
        assertEquals(10,pin.CantidadPintura(re));
    }
}
