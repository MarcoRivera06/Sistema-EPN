package epn.sistema;
import java.util.ArrayList;
public class ControllerSystem {
public boolean on (){
    Atenea atenea = new Atenea();
    SAEW saew = new SAEW(); 
    AppMobile appMobile = new AppMobile();

    ArrayList lista = new ArrayList();
    lista.add(atenea);
    lista.add(saew);
    lista.add(appMobile);
   
    System.out.println("Sistema encendido");
    atenea.on();
    saew.on();
    appMobile.on();
    return true;
}
public boolean off (){
    System.out.println("Sistema apagado");
    return true;
}

}