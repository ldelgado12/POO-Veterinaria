package delgado.luis.bl.entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 */
public class Usuario {
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
        private String nombre;

    /**
     *
      */
    private int cedula;
    /**
     *
      */
    private int telefono;
    /**
     *
     */
    private String genero;
    /**
     *
     */
    private String puesto;

    /**
     *
     */
        public Usuario()
        {
            nombre = "";
            cedula = 0;
            telefono = 0;
            genero = " ";
            puesto = "";
        }

    /**
     *
     * @param nom
     * @param ced
     * @param tel
     * @param gen
     * @param pues
     */
        public Usuario(String nom, int ced, int tel, String gen, String pues)
        {
            nombre = nom;
            cedula = ced;
            telefono = tel;
            genero = gen;
            puesto = pues;
        }

//        public static boolean elementoRepetido(){
//
//        }

    /**
     *
     * @return
     */
        public String getNombre(){
            return nombre;
        }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre){
            this.nombre = nombre;
        }

    /**
     *
     * @return
     */
    public String getPuesto(){
        return puesto;
        }
        public void setPuesto(String puesto){
        this.puesto = puesto;
        }

    /**
     *
     * @return
     */
    public int getCedula(){
            return cedula;
        }

    /**
     *
     * @param cedula
     */
    public void setCedula(int cedula){
            this.cedula = cedula;
        }

    /**
     *
     * @return
     */
    public int getTelefono(){
            return telefono;
        }

    /**
     *
     * @param telefono
     */
    public void setTelefono(int telefono){
            this.telefono = telefono;
        }

    /**
     *
     * @return
     */
    public String getGenero(){
            return genero;
        }

    /**
     *
     * @param genero
     */
    public void setGenero(String genero){
            this.genero = genero;
        }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                ", telefono=" + telefono +
                ", genero='" + genero + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}

