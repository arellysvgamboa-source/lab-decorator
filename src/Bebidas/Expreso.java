package Bebidas;

public class Expreso extends Cafe {

    public Expreso(String tamano) {
        super(tamano);
    }

    @Override
    public String getDescripcion() {
        return "Expreso " + tamano;
    }

    @Override
    public double getCosto() {

        switch (tamano) {
            case "N":
                return 1.99;
            case "M":
                return 2.09;
            default:
                return 2.15;
        }
    }
}
