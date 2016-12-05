package dam.pucp.edu.pe.taskmanager.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import dam.pucp.edu.pe.taskmanager.R;
import dam.pucp.edu.pe.taskmanager.beans.Tarea;
import dam.pucp.edu.pe.taskmanager.util.Proyecto;

/**
 * Created by Hiroshi on 8/11/2016.
 */
public class JobListAdapter extends ArrayAdapter<Tarea>{
    public JobListAdapter(Context context, int resource, List<Tarea> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View itemView = null;
        if(itemView == null){
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.activity_job_view, null);
        }else{
            itemView = convertView;
        }
        Tarea currentJob = Proyecto.getTareas().get(position);

        TextView nombre = (TextView) itemView.findViewById(R.id.textView10);
        nombre.setText(currentJob.getTitulo());

        TextView init_date = (TextView) itemView.findViewById(R.id.textView15);
        init_date.setText(currentJob.getFecha_inicio());

        TextView end_date = (TextView) itemView.findViewById(R.id.textView16);
        end_date.setText(currentJob.getFecha_fin());

        TextView description = (TextView) itemView.findViewById(R.id.textView17);
        description.setText(currentJob.getDescripcion());

        return itemView;
    }
}
