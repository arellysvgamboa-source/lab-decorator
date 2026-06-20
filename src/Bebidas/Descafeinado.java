package Bebidas;

public class Descafeinado extends Cafe {

    @Override
    public String getDescripcion() {
        return "Café Descafeinado";
    }

    @Override
    public double getCosto() {
        return 1.35;
    }
}