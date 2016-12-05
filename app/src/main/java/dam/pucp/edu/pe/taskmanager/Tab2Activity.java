package dam.pucp.edu.pe.taskmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import dam.pucp.edu.pe.taskmanager.adapters.ContactListAdapter;
import dam.pucp.edu.pe.taskmanager.adapters.JobListAdapter;
import dam.pucp.edu.pe.taskmanager.beans.Contacto;
import dam.pucp.edu.pe.taskmanager.beans.Tarea;
import dam.pucp.edu.pe.taskmanager.forms.NewContactActivity;
import dam.pucp.edu.pe.taskmanager.forms.NewJobActivity;
import dam.pucp.edu.pe.taskmanager.util.Agenda;
import dam.pucp.edu.pe.taskmanager.util.Proyecto;

public class Tab2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        final Button newJob = (Button) findViewById(R.id.button1);

        newJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewJobActivity.class);
                startActivity(intent);
            }
        });

        this.populateListViewJobs();
    }

    private void populateListViewJobs() {
        ArrayAdapter<Tarea> adapter = new JobListAdapter(getBaseContext(), android.R.layout.two_line_list_item, Proyecto.getTareas());
        ListView listJob = (ListView) findViewById(R.id.listView);

        listJob.setAdapter(adapter);
        listJob.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ContactoView.class);
                startActivity(intent);
            }
        });
    }
}
