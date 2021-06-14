package delgado.luis.bl.logic;

import delgado.luis.bl.entities.Cita;
import delgado.luis.bl.entities.Mascota;
import delgado.luis.bl.entities.Reservacion;
import delgado.luis.bl.entities.Usuario;
import delgado.luis.dl.Data;

import java.util.ArrayList;

/**
 *
 */
public class Logica {
    /**
     *
     */
    public Data datos =  new Data();

    /**
     *
     */
    public void inicializarDatos(){
        if (datos == null){
            datos = new Data();
        }
    }

    /**
     *
     * @param nombreMascota
     * @param observaciones
     * @param mesEntrada
     * @param diaEntrada
     */
    public void registrarCita (String nombreMascota, String observaciones, int mesEntrada, String diaEntrada){
        inicializarDatos();

        Cita nuevaCita = new Cita(nombreMascota, observaciones, mesEntrada, diaEntrada);

        datos.agregarCita(nuevaCita);

    }

    /**
     *
     * @return
     */

    public ArrayList<Cita> listarCitas(){
        return datos.getCitas();
    }

    /**
     *
     * @param nombreMascota
     * @param duenoMascota
     * @param cedDueno
     * @param telefonoDueno
     * @param DireccionDueno
     * @param ranking
     */
    public void registrarMascota (String nombreMascota, String duenoMascota, int cedDueno, int telefonoDueno, String DireccionDueno, int ranking){
        inicializarDatos();

        Mascota nuevaMascota = new Mascota( nombreMascota, duenoMascota, cedDueno, telefonoDueno, DireccionDueno, ranking);

        datos.agregarMascota(nuevaMascota);

    }

    /**
     *
     * @return
     */
    public ArrayList<Mascota> listarMascotas(){
        return datos.getMascotas();
    }

    /**
     *
     * @param NombreMascota
     * @param fechaEntrada
     * @param fechaSalida
     * @param mesEntrada
     * @param diaEntrada
     * @param diaSalida
     * @param mesSalida
     */
    public void registrarReservacion (String NombreMascota, String fechaEntrada, String fechaSalida, int mesEntrada, int diaEntrada, int diaSalida, int mesSalida){
        inicializarDatos();

        Reservacion nuevaReservacion = new Reservacion(NombreMascota, fechaEntrada, fechaSalida, mesEntrada, diaEntrada, diaSalida, mesSalida);

        datos.agregarReservacion(nuevaReservacion);

    }

    /**
     *
     * @return
     */
    public ArrayList<Reservacion> listarReservaciones(){
        return datos.getReservaciones();
    }

    /**
     *
     * @param nombre
     * @param cedula
     * @param telefono
     * @param genero
     * @param puesto
     */
    public void registrarUsuario (String nombre, int cedula, int telefono, String genero, String puesto){
        inicializarDatos();

        Usuario nuevoUsuario = new Usuario( nombre,  cedula,  telefono,  genero,  puesto);

        datos.agregarUsuario(nuevoUsuario);

    }

    /**
     *
     * @return
     */
    public ArrayList<Usuario> listarUsuarios(){
        return datos.getUsuarios();
    }

    /**
     *
     * @param nombreMascota
     * @param diaEntrada
     * @param mesEntrada
     * @param diaSalida
     * @param mesSalida
     * @param fechaSalida
     */
    public void registrarReservacion(String nombreMascota, int diaEntrada, int mesEntrada, int diaSalida, int mesSalida, String fechaSalida) {
    }
}
