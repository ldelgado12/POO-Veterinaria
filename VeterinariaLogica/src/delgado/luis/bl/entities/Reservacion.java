package delgado.luis.bl.entities;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 */
public class Reservacion {
    /**
     *
     */
    private String NombreMascota;
    /**
     *
      */
    /**
     *
     */
    private String fechaEntrada;
    /**
     *
     */
    private String fechaSalida;
    /**
     *
      */
    private int mesEntrada;
    /**
     *
     */
    private int diaEntrada;
    /**
     *
     */
    private int diaSalida;
    /**
     *
     */
    private int mesSalida;

    /**
     *
     */
    public Reservacion(){}

    /**
     *
     * @param nombreMascota
     * @param fechaEntrada
     * @param fechaSalida
     * @param mesEntrada
     * @param diaEntrada
     * @param diaSalida
     * @param mesSalida
     */
    public Reservacion(String nombreMascota, String fechaEntrada, String fechaSalida, int mesEntrada, int diaEntrada, int diaSalida, int mesSalida) {
        NombreMascota = nombreMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.mesEntrada = mesEntrada;
        this.diaEntrada = diaEntrada;
        this.diaSalida = diaSalida;
        this.mesSalida = mesSalida;
    }

    /**
     *
     */
    public static void AgregarFecha(){

        int MM = Calendar.MONTH ;
        int DD = Calendar.DAY_OF_YEAR;
        int YYYY = Calendar.YEAR;

        Calendar calendario = new GregorianCalendar(Calendar.DAY_OF_YEAR, Calendar.MONTH, Calendar.YEAR);

    }

    /**
     *
     * @return
     */
    public String getNombreMascota() {
        return NombreMascota;
    }

    /**
     *
     * @param nombreMascota
     */
    public void setNombreMascota(String nombreMascota) {
        NombreMascota = nombreMascota;
    }

    /**
     *
     * @return
     */
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     *
     * @param fechaEntrada
     */
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     *
     * @return
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     *
     * @param fechaSalida
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     *
     * @return
     */
    public int getMesEntrada() {
        return mesEntrada;
    }

    /**
     *
     * @param mesEntrada
     */
    public void setMesEntrada(int mesEntrada) {
        this.mesEntrada = mesEntrada;
    }

    /**
     *
     * @return
     */
    public int getDiaEntrada() {
        return diaEntrada;
    }

    /**
     *
     * @param diaEntrada
     */
    public void setDiaEntrada(int diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    /**
     *
     * @return
     */
    public int getDiaSalida() {
        return diaSalida;
    }

    /**
     *
     * @param diaSalida
     */
    public void setDiaSalida(int diaSalida) {
        this.diaSalida = diaSalida;
    }

    /**
     *
     * @return
     */
    public int getMesSalida() {
        return mesSalida;
    }

    /**
     *
     * @param mesSalida
     */
    public void setMesSalida(int mesSalida) {
        this.mesSalida = mesSalida;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Reservacion{" +
                "NombreMascota='" + NombreMascota + '\'' +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", mesEntrada=" + mesEntrada +
                ", diaEntrada=" + diaEntrada +
                ", diaSalida=" + diaSalida +
                ", mesSalida=" + mesSalida +
                '}';
    }
}
