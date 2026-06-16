package epn.sistema;

import epn.usuario.Estudiante;

public class AppMobile extends SistemaEpn implements IAccion {

    @Override
    public boolean on() {
        System.out.println("on AppMobile");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("off AppMobile");
        return true;
    }


}
