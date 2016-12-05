package dam.pucp.edu.pe.taskmanager.forms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import dam.pucp.edu.pe.taskmanager.MainActivity;
import dam.pucp.edu.pe.taskmanager.R;
import dam.pucp.edu.pe.taskmanager.beans.Tarea;
import dam.pucp.edu.pe.taskmanager.util.Proyecto;

public class NewJobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_job);

        final Button backMenu = (Button) findViewById(R.id.button5);
        final Button createJob = (Button) findViewById(R.id.button4);

        final EditText nombre = (EditText) findViewById(R.id.editText5);
        final EditText init_date = (EditText) findViewById(R.id.editText6);
        final EditText end_date = (EditText) findViewById(R.id.editText7);
        final EditText description = (EditText) findViewById(R.id.editText8);

        backMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        createJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tarea tarea = new Tarea();

                tarea.setTitulo(nombre.getText().toString());
                tarea.setFecha_inicio(init_date.getText().toString());
                tarea.setFecha_fin(end_date.getText().toString());
                tarea.setDescripcion(description.getText().toString());

                Proyecto.getTareas().add(tarea);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
