import delgado.luis.tl.Controller;

import static delgado.luis.tl.Controller.controlador;

public class Main {

    public static void main(String[] args) throws java.io.IOException{

        controlador = new Controller();
        controlador.start();

    }

}
