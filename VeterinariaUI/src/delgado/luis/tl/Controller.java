package delgado.luis.tl;

import delgado.luis.bl.entities.Cita;
import delgado.luis.bl.entities.Mascota;
import delgado.luis.bl.entities.Reservacion;
import delgado.luis.bl.entities.Usuario;
import delgado.luis.bl.logic.Logica;
import delgado.luis.ui.UI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class Controller {
    /**
     *
     */
    private Logica tranfDatos = new Logica();
    /**
     *
     */
    public static Controller controlador;
    /**
     *
     */
    private UI interfaz = new UI();

    /**
     *
     */
    public Controller(){};

    /**
     *
     * @throws IOException
     */
    public void start() throws IOException {
        int opcion;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 13);

    }

    /**
     *
     * @param pOpcion
     * @throws java.io.IOException
     */
    public void procesarOpcion(int pOpcion) throws java.io.IOException {
        switch (pOpcion)
        {
            case 1:
                registrarMascotas();
                break;
            case 2:
                registrarCitas();
                break;
            case 3:
                registrarReservaciones();
                break;
            case 4:
                registrarUsuarios();
                break;
            case 5:
                listarUsuarios();
                break;
            case 6:
                listarMascotas();
                break;
            case 7:
                listarReservaciones();
                break;
            case 8:
                listarCitas();
                break;
            case 9:
                interfaz.imprimirMensaje  ("Gracias por usar el sistema.");
                break;
            default:
                interfaz.imprimirMensaje("Opcion Invalida");
        }
    }

    /**
     *
     * @throws IOException
     */
    public void registrarMascotas() throws IOException  {

        //Revisarlo porque esta muy basico

        String nombreMascota = "";
        String duenoMascota = " ";
        int cedDueno = 0;
        int telefonoDueno = 0;
        String DireccionDueno = " ";
        int ranking = 0;

            interfaz.imprimirMensaje("Digite el nombre de la mascota");
            nombreMascota = interfaz.leerTexto();
            interfaz.imprimirMensaje("Digite el nombre del dueno");
            duenoMascota = interfaz.leerTexto();
            interfaz.imprimirMensaje("Digite la cedula del dueno de la mascota");
            cedDueno = Integer.parseInt(interfaz.leerTexto());
            interfaz.imprimirMensaje("Digite el telefono del dueno de la mascota");
            telefonoDueno = Integer.parseInt(interfaz.leerTexto());
            interfaz.imprimirMensaje("Digite la direccion del dueno");
            DireccionDueno = interfaz.leerTexto();
            interfaz.imprimirMensaje("Digite el ranking de la mascota");
            ranking = Integer.parseInt(interfaz.leerTexto());

        tranfDatos.registrarMascota(nombreMascota, duenoMascota, cedDueno, telefonoDueno, DireccionDueno, ranking);

    }

    /**
     *
     * @throws IOException
     */
    public void registrarUsuarios() throws IOException {

        String nombre ="";
        int cedula= 0;
        int telefono = 0;
        String genero = "";
        String puesto = "";
        int compararCed = 0;

        interfaz.imprimirMensaje("Digite el nombre del usuario");
        nombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la cedula del usuario");
        cedula = Integer.parseInt(interfaz.leerTexto());
        interfaz.imprimirMensaje("Digite el telefono del usuario");
        telefono = Integer.parseInt(interfaz.leerTexto());
        interfaz.imprimirMensaje("Digite el genero del usuario");
        genero = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el rol del usuario (Doctor/Secretaria)");
        puesto = interfaz.leerTexto();

        tranfDatos.registrarUsuario(nombre, cedula, telefono, genero, puesto);

        }

    /**
     *
     * @throws IOException
     */
    public void registrarCitas() throws IOException{

        String NombreMascota;
        String observaciones;
        int  diaEntrada;
        String mesEntrada;

        Date fecha = new Date();



        interfaz.imprimirMensaje("Ingresar el Nombre de la delgado.luis.bl.entities.Mascota");
        NombreMascota = interfaz.leerTexto();
        interfaz.imprimirMensaje("Escribir el numero del dia de entrada");
        diaEntrada = Integer.parseInt(interfaz.leerTexto());
        interfaz.imprimirMensaje("Escribir el numero del mes de entrada");
        mesEntrada = interfaz.leerTexto();
        interfaz.imprimirMensaje("Escribir las observaciones necesarioas para su mascota");
        observaciones = interfaz.leerTexto();

        tranfDatos.registrarCita(NombreMascota, observaciones, diaEntrada, mesEntrada);
    }

    /**
     *
     * @throws IOException
     */
    public void registrarReservaciones() throws IOException {

        String NombreMascota;
        int  diaEntrada;
        int mesEntrada;
        int diaSalida;
        int mesSalida;
        String fechaSalida;


        interfaz.imprimirMensaje("Ingresar el Nombre de la delgado.luis.bl.entities.Mascota");
        NombreMascota = interfaz.leerTexto();
        interfaz.imprimirMensaje("Escribir el numero del dia de entrada");
        diaEntrada = Integer.parseInt(interfaz.leerTexto());
        interfaz.imprimirMensaje("Escribir el numero del mes de entrada");
        mesEntrada = Integer.parseInt(interfaz.leerTexto());
        interfaz.imprimirMensaje("Escribir el numero del dia de salida");
        diaSalida = Integer.parseInt(interfaz.leerTexto());
        interfaz.imprimirMensaje("Escribir el numero del mes de salida");
        mesSalida = Integer.parseInt(interfaz.leerTexto());
        interfaz.imprimirMensaje("Escribir la fecha de salida");
        fechaSalida = interfaz.leerTexto();

    tranfDatos.registrarReservacion(NombreMascota, diaEntrada, mesEntrada, diaSalida, mesSalida, fechaSalida);
    }

    /**
     *
     */
    public void listarUsuarios(){

        ArrayList<Usuario> usuarios = tranfDatos.listarUsuarios();

        interfaz.imprimirMensaje("----LISTA DE USUARIOS---");
        for (Usuario dato : usuarios){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }

    }

    /**
     *
     */
    public void listarReservaciones(){

        ArrayList<Reservacion> reservacions = tranfDatos.listarReservaciones();

        interfaz.imprimirMensaje("----LISTA DE RESERVACIONES---");
        for (Reservacion dato : reservacions){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }

    }

    /**
     *
     */
    public void listarMascotas(){

        ArrayList<Mascota> mascotas = tranfDatos.listarMascotas();

        interfaz.imprimirMensaje("----LISTA DE MASCOTAS---");
        for (Mascota dato : mascotas){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }


    }

    /**
     *
     */
    public void listarCitas(){

        ArrayList<Cita> citas = tranfDatos.listarCitas();

        interfaz.imprimirMensaje("----LISTA DE CITAS---");
        for (Cita dato : citas){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }


    }


}
