package Complementos;

import Bebidas.Cafe;

public class Mocca extends Complemento {

    public Mocca(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + mocca ";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 1.53;
    }
}