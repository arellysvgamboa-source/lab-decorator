package Complementos;
import Bebidas.*;

public class Leche extends Complemento {

    private String tamano;

    public Leche(Cafe cafe, String tamano) {
        super(cafe);
        this.tamano = tamano;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Leche " + tamano;
    }

    @Override
    public double getCosto() {

        double precio = 0;

        switch (tamano) {
            case "N":
                precio = 0.10;
                break;
            case "M":
                precio = 0.15;
                break;
            case "G":
                precio = 0.20;
                break;
        }

        return cafe.getCosto() + precio;
    }
}