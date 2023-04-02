import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void testAlCrearCocheSuVelocidadEsCero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

    @Test
    public void testAlAcelerarUnCocheSuVelocidadAumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void testAlDecelerarUnCocheSuVelocidadDisminuye(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void testAlDecelerarUnCocheSuVelocidadNoPuedeSerMenorQueCero(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
