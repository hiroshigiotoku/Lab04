package dam.pucp.edu.pe.taskmanager.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import dam.pucp.edu.pe.taskmanager.R;
import dam.pucp.edu.pe.taskmanager.beans.Contacto;
import dam.pucp.edu.pe.taskmanager.util.Agenda;

/**
 * Created by Hiroshi on 8/11/2016.
 */
public class ContactListAdapter extends ArrayAdapter<Contacto> {

    public ContactListAdapter(Context context, int resource, List<Contacto> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View itemView = null;
        if(itemView == null){
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.contacto_view, null);
        }else{
            itemView = convertView;
        }
        Contacto currentContact = Agenda.agendas().get(position);

        TextView nombre = (TextView) itemView.findViewById(R.id.textView9);
        nombre.setText(currentContact.getNombre());

        TextView numero = (TextView) itemView.findViewById(R.id.textView11);
        numero.setText(currentContact.getNumero());

        TextView correo = (TextView) itemView.findViewById(R.id.textView13);
        correo.setText(currentContact.getCorreo());

        return itemView;
    }
}
