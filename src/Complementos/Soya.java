package Complementos;

import Bebidas.*;

public class Soya extends Complemento {

    public Soya(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + " + soya ";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 1.15;
    }
}