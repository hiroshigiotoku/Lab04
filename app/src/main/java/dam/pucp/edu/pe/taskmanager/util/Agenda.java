package dam.pucp.edu.pe.taskmanager.util;

import java.util.ArrayList;

import dam.pucp.edu.pe.taskmanager.beans.Contacto;

/**
 * Created by Hiroshi on 7/11/2016.
 */
public class Agenda {
    private static ArrayList<Contacto> agenda = new ArrayList<>();

    public static ArrayList<Contacto> agendas(){
        return agenda;
    }

    public static boolean noExiste(String numero){
        boolean retornar = true;
        for (Contacto temp:agenda) {
            if(temp.getNumero().equals(numero)){
                retornar = false;
            }
        }
        return retornar;
    }

    public static Contacto hallarContacto(String nombre){
        Contacto retornar = new Contacto();

        //TODO

        return retornar;
    }
}
