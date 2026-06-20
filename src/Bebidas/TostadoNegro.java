package Bebidas;

public class TostadoNegro extends Cafe {

    public TostadoNegro(String tamano) {
        super(tamano);
    }

    @Override
    public String getDescripcion() {
        return "Tostado Negro " + tamano;
    }

    @Override
    public double getCosto() {

        switch (tamano) {
            case "N":
                return 0.99;
            case "M":
                return 1.09;
            default:
                return 1.19;
        }
    }
}