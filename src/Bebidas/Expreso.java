package Bebidas;

public class Expreso extends Cafe {

    @Override
    public String getDescripcion() {
        return "Café Expreso";
    }

    @Override
    public double getCosto() {
        return 2.65;
    }
}

