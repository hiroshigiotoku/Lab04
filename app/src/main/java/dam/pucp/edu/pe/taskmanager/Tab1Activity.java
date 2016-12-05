package dam.pucp.edu.pe.taskmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import dam.pucp.edu.pe.taskmanager.adapters.ContactListAdapter;
import dam.pucp.edu.pe.taskmanager.beans.Contacto;
import dam.pucp.edu.pe.taskmanager.forms.NewContactActivity;
import dam.pucp.edu.pe.taskmanager.forms.NewJobActivity;
import dam.pucp.edu.pe.taskmanager.util.Agenda;

public class Tab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        final Button newContact = (Button) findViewById(R.id.button);

        newContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewContactActivity.class);
                startActivity(intent);
            }
        });

        this.populateListViewContact();
    }

    private void populateListViewContact(){
        ArrayAdapter<Contacto> adapter = new ContactListAdapter(getBaseContext(), android.R.layout.two_line_list_item, Agenda.agendas());
        ListView listContact = (ListView) findViewById(R.id.listView2);

        listContact.setAdapter(adapter);
        listContact.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent(getApplicationContext(), ContactoView.class);
                startActivity(intent);
            }
        });
    }


}
