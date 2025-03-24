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
        assertEquals(20, re.area(),0.001);
        assertEquals(37.699,ci.area(),0.001);
        assertEquals(50.265,es.area(),0.001);
    }
}
