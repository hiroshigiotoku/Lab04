package dam.pucp.edu.pe.taskmanager.beans;

import java.io.Serializable;

/**
 * Created by Hiroshi on 7/11/2016.
 */
public class Contacto implements Serializable{
    private String nombre;
    private String DNI;
    private String correo;
    private String numero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
