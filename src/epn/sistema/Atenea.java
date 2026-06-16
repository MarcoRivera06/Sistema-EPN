package epn.sistema;

public class Atenea extends SistemaEpn implements IAccion {
    private String tipoCertificado;
    private 
    @Override
    public boolean on() {
        System.out.println("on Atenea");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("off Atenea");
        return true;
    }


}
