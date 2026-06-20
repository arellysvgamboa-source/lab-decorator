package Bebidas;

public abstract class Cafe {

    protected String tamano;

    public Cafe(String tamano) {
        this.tamano = tamano;
    }

    public abstract String getDescripcion();

    public abstract double getCosto();
}
