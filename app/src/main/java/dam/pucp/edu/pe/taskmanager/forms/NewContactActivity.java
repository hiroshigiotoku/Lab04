package dam.pucp.edu.pe.taskmanager.forms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import dam.pucp.edu.pe.taskmanager.MainActivity;
import dam.pucp.edu.pe.taskmanager.R;
import dam.pucp.edu.pe.taskmanager.Tab1Activity;
import dam.pucp.edu.pe.taskmanager.beans.Contacto;
import dam.pucp.edu.pe.taskmanager.util.Agenda;

public class NewContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        final Button backMenu = (Button) findViewById(R.id.button3);
        final Button createContact = (Button) findViewById(R.id.button2);

        final EditText nombre = (EditText) findViewById(R.id.editText);
        final EditText dni = (EditText) findViewById(R.id.editText2);
        final EditText correo = (EditText) findViewById(R.id.editText3);
        final EditText numero = (EditText) findViewById(R.id.editText4);


        backMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        createContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contacto contacto = new Contacto();

                contacto.setNombre(nombre.getText().toString());
                contacto.setCorreo(correo.getText().toString());
                contacto.setDNI(dni.getText().toString());
                contacto.setNumero(numero.getText().toString());

                Agenda.agendas().add(contacto);

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
