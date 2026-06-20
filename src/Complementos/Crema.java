package Complementos;

import Bebidas.Cafe;

public class Crema extends Complemento {

    public Crema(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + crema ";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.25;
    }
}