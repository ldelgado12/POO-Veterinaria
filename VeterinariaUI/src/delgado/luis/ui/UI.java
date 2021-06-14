package delgado.luis.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    /**
     *
     */
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    /**
     *
      */
    static PrintStream out = System.out;

    /**
     *
     * @throws java.io.IOException
     */
    public void mostrarMenu() throws java.io.IOException
    {
        out.println("1. Registrar una mascota");
        out.println("2. Registrar una cita para su mascota");
        out.println("3. Registrar una reservacion en el hotel para su mascota");
        out.println("4. Registrar un usuario");
        out.println("5. Listar todas los usuarios");
        out.println("6. Listar todas las mascotas");
        out.println("7. Listar todas las reservaciones");
        out.println("8. Listar todas las citas");
        out.println("9. Salir");
        out.println("Digite la opcion");

    }

    /**
     * lee la opcion del usuario
     * @return retorna el numero seleccionado
     * @throws java.io.IOException
     */

    public int leerOpcion() throws java.io.IOException{
        int opcion =0;
        out.println("Digite la opcion");
        opcion = Integer.parseInt(in.readLine());
        return opcion;
    }

    /**
     *
     * @param msj el mensaje que se va a retornar al usuario
     */

    public void imprimirMensaje(String msj){
        out.println(msj);
    }

    /**
     * lee la informacion agregada por el usurio
     * @return la informacion
     * @throws IOException
     */

    public String leerTexto() throws IOException {
        return in.readLine();
    }




}
