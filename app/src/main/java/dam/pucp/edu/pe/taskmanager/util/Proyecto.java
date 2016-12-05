package dam.pucp.edu.pe.taskmanager.util;

import java.util.ArrayList;

import dam.pucp.edu.pe.taskmanager.beans.Tarea;

/**
 * Created by Hiroshi on 7/11/2016.
 */
public class Proyecto {
    private static ArrayList<Tarea> tareas = new ArrayList<>();

    public static ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public static void setTareas(ArrayList<Tarea> tareas) {
        Proyecto.tareas = tareas;
    }
}
