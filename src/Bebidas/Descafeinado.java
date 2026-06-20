package Bebidas;

public class Descafeinado extends Cafe {

    public Descafeinado(String tamano) {
        super(tamano);
    }

    @Override
    public String getDescripcion() {
        return "Cafe Descafeinado " + tamano;
    }

    @Override
    public double getCosto() {

        switch (tamano) {
            case "N":
                return 1.05;
            case "M":
                return 1.15;
            case "G":
                return 1.25;
            default:
                return 1.05;
        }
    }
}