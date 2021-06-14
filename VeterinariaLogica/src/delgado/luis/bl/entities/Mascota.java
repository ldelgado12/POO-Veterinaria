package delgado.luis.bl.entities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 */
public class Mascota {
    /**
     *
     */
    private String nombreMascota;
    /**
     *
     */
    private String duenoMascota;
    /**
     *
     */
    private int cedDueno;
    /**
     *
     */
    private int telefonoDueno;
    /**
     *
     */
    private String DireccionDueno;
    /**
     *
      */
    private int ranking;

    /**
     *
     */
    public Mascota()
    {
        nombreMascota = "";
        duenoMascota = " ";
        cedDueno = 0;
        telefonoDueno = 0;
        DireccionDueno = " ";
        ranking = 0;
    }

    /**
     *
     * @param nomMas
     * @param duenMas
     * @param cedDue
     * @param telDue
     * @param Direcc
     * @param rank
     */
    public Mascota(String nomMas, String duenMas, int cedDue, int telDue, String Direcc, int rank)
    {
        nombreMascota = nomMas;
        duenoMascota = duenMas;
        cedDueno = cedDue;
        telefonoDueno = telDue;
        DireccionDueno = Direcc;
        ranking = rank;
    }

    /**
     *
     * @return
     */
    public String getnombreMascota(){
        return nombreMascota;
    }

    /**
     *
     * @param nombreMascota
     */
    public void setnombreMascota(String nombreMascota){
        this.nombreMascota = nombreMascota;
    }

    /**
     *
     * @return
     */
    public String getduenoMascota(){ return duenoMascota;}

    /**
     *
     * @param duenoMascota
     */
    public void setduenoMascota(String duenoMascota){
        this.duenoMascota = duenoMascota;
    }

    /**
     *
     * @return
     */
    public int getcedDueno(){
        return cedDueno;
    }

    /**
     *
     * @param cedDueno
     */
    public void setcedDueno(int cedDueno){
        this.cedDueno = cedDueno;
    }

    /**
     *
      * @return
     */
    public int gettelefonoDueno(){
        return telefonoDueno;
    }

    /**
     *
     * @param telefonoDueno
     */
    public void settelefonoDueno(int telefonoDueno){
        this.telefonoDueno = telefonoDueno;
    }

    /**
     *
     * @return
     */
    public String getDireccionDueno(){
        return DireccionDueno;
    }

    /**
     *
     * @param DireccionDueno
     */
    public void setDireccionDueno(String DireccionDueno){
        this.DireccionDueno = DireccionDueno;
    }

    /**
     *
     * @return
     */
    public int getranking(){
        return ranking;
    }

    /**
     *
     * @param ranking
     */
    public void setranking(int ranking){
        this.ranking = ranking;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Mascota{" +
                "nombreMascota='" + nombreMascota + '\'' +
                ", duenoMascota='" + duenoMascota + '\'' +
                ", cedDueno=" + cedDueno +
                ", telefonoDueno=" + telefonoDueno +
                ", DireccionDueno='" + DireccionDueno + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}






//    class formatoFecha{
//        public void main (String args[]){
//        Date fecha = new Date(); // Sistema actual La fecha y la hora se asignan a objDate
//
//        System.out.println(fecha);
//        String strDateFormat = "hh: mm: ss a dd-MMM-aaaa"; // El formato de fecha está especificado
//        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto de formato de fecha
//        System.out.println(objSDF.format(fecha)); // El formato de fecha se aplica a la fecha actual
//    }
//    }
//
//    String nombreMascota;
//    String duenoMascotaUsuario;
//    String observacionesMascota;
//    int rankingMascota;
