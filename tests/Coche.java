public class Coche {
    public int velocidad;

    public void acelerar_AntonioDavid(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_AntonioDavid(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0)
            velocidad = 0;
    }
}
