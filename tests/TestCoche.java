import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void testAlCrearCocheSuVelocidadEsCero_AntonioDavid(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }

    @Test
    public void testAlAcelerarUnCocheSuVelocidadAumenta_AntonioDavid(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_AntonioDavid(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void testAlDecelerarUnCocheSuVelocidadDisminuye_AntonioDavid(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_AntonioDavid(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }

    @Test
    public void testAlDecelerarUnCocheSuVelocidadNoPuedeSerMenorQueCero_AntonioDavid(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_AntonioDavid(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
