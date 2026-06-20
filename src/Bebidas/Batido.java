package Bebidas;

public class Batido extends Cafe {

    public Batido(String tamano) {
        super(tamano);
    }

    @Override
    public String getDescripcion() {
        return "Cafe Batido " + tamano;
    }

    @Override
    public double getCosto() {

        switch (tamano) {
            case "N":
                return 0.89;
            case "M":
                return 0.99;
            case "G":
                return 1.09;
            default:
                return 0.89;
        }
    }
}