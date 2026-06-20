package Complementos;
import Bebidas.*;

public abstract class Complemento extends Cafe {

    public Cafe cafe;

    public Complemento(Cafe cafe) {
        this.cafe = cafe;
    }
}
