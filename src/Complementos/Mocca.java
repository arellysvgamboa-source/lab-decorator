package Complementos;
import Bebidas.*;

public class Mocca extends Complemento {

    private String tamano;

    public Mocca(Cafe cafe, String tamano) {
        super(cafe);
        this.tamano = tamano;
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", Mocca " + tamano;
    }

    @Override
    public double getCosto() {

        double precio = 0;

        switch (tamano) {
            case "N":
                precio = 0.20;
                break;
            case "M":
                precio = 0.25;
                break;
            case "G":
                precio = 0.30;
                break;
        }

        return cafe.getCosto() + precio;
    }
}