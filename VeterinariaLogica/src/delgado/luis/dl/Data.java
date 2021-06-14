package delgado.luis.dl;

import delgado.luis.bl.entities.Cita;
import delgado.luis.bl.entities.Mascota;
import delgado.luis.bl.entities.Reservacion;
import delgado.luis.bl.entities.Usuario;

import java.util.ArrayList;

/**
 *
 */
public class Data {
    /**
     *
     */
    private ArrayList<Cita> citas;
    /**
     *
     */
    private ArrayList<Mascota> mascotas;
    /**
     *
     */
    private ArrayList<Reservacion>reservaciones;
    /**
     *
     */
    private ArrayList<Usuario>usuarios;

    /**
     *
     */
    public Data() {
    }

    /**
     *
     * @param cita
     */
    public void agregarCita(Cita cita){
        if (citas == null){
            citas =  new ArrayList<>();
            citas.add(cita);
        }else{
            citas.add(cita);
        }
    }

    /**
     *
     * @return
     */
    public String[] listarCitas(){
        String[] listarCitas = new String[citas.size()];
        int i = 0;
        for (Cita dato : citas){
            listarCitas[i] = dato.toString();
            i++;
        }
        return listarCitas;
    }

    /**
     *
     * @param mascota
     */
    public void agregarMascota(Mascota mascota){
        if (mascotas == null){
            mascotas =  new ArrayList<>();
            mascotas.add(mascota);
        }else{
            mascotas.add(mascota);
        }
    }

    /**
     *
     * @return
     */
    public String[] listarMascotas(){
        String[] listarMascotas = new String[mascotas.size()];
        int i = 0;
        for (Mascota dato : mascotas){
            listarMascotas[i] = dato.toString();
            i++;
        }
        return listarMascotas;
    }

    /**
     *
     * @param reservacion
     */
    public void agregarReservacion(Reservacion reservacion){
        if (reservaciones == null){
            reservaciones =  new ArrayList<>();
            reservaciones.add(reservacion);
        }else{
            reservaciones.add(reservacion);
        }
    }

    /**
     *
     * @return
     */
    public String[] listarReservaciones(){
        String[] listarReservaciones = new String[reservaciones.size()];
        int i = 0;
        for (Reservacion dato : reservaciones){
            listarReservaciones[i] = dato.toString();
            i++;
        }
        return listarReservaciones;
    }

    /**
     *
     * @param usuario
     */
    public void agregarUsuario(Usuario usuario){
        if (usuarios == null){
            usuarios =  new ArrayList<>();
            usuarios.add(usuario);
        }else{
            usuarios.add(usuario);
        }
    }

    /**
     *
     * @return
     */
    public String[] listarUsuarios(){
        String[] listarUsuarios = new String[usuarios.size()];
        int i = 0;
        for (Usuario dato : usuarios){
            listarUsuarios[i] = dato.toString();
            i++;
        }
        return listarUsuarios;
    }

    /**
     *
     * @return
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    /**
     *
     * @param citas
     */
    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     *
     * @param mascotas
     */
    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Reservacion> getReservaciones() {
        return reservaciones;
    }

    /**
     *
     * @param reservaciones
     */
    public void setReservaciones(ArrayList<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }

    /**
     *
     * @return
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     *
     * @param usuarios
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
