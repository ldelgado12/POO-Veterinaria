package delgado.luis.bl.entities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 */
public class Cita {
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
     */
    private String NombreMascota;
    /**
     *
     */
    private String observaciones;
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
    public Cita(){
        NombreMascota = "";
        mesEntrada = 0;
        diaEntrada = 0;
        observaciones = "";

    }

    /**
     *
     * @param NomMas
     * @param me
     * @param de
     * @param Obser
     */
    public Cita(String NomMas, int me, int de, String Obser) {
        NombreMascota = NomMas;
        mesEntrada = me;
        diaEntrada = de;
        observaciones = Obser;

    }

    /**
     *
     * @param nombreMascota
     * @param observaciones
     * @param mesEntrada
     * @param diaEntrada
     */
    public Cita(String nombreMascota, String observaciones, int mesEntrada, String diaEntrada) {
    }

    /**
     *
     * @return
     */
    public static BufferedReader getIn() {
        return in;
    }

    /**
     * +
     * @param in
     */
    public static void setIn(BufferedReader in) {
        Cita.in = in;
    }

    /**
     *
     * @return
     */
    public static PrintStream getOut() {
        return out;
    }

    /**
     *
     * @param out
     */
    public static void setOut(PrintStream out) {
        Cita.out = out;
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
    public String getObservaciones() {
        return observaciones;
    }

    /**
     *
     * @param observaciones
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
    @Override
    public String toString() {
        return "Cita{" +
                "NombreMascota='" + NombreMascota + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", mesEntrada=" + mesEntrada +
                ", diaEntrada=" + diaEntrada +
                '}';
    }
}
