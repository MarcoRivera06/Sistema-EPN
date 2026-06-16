package epn.sistema;

public class SAEW extends SistemaEpn implements IAccion {

    @Override
    public boolean on() {
        System.out.println("on SAEW");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("off SAEW");
        return true;
    }
}