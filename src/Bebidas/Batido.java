package Bebidas;

public class Batido extends Cafe {

    @Override
    public String getDescripcion() {
        return "Café Batido";
    }

    @Override
    public double getCosto() {
        return 0.95;
    }
}
