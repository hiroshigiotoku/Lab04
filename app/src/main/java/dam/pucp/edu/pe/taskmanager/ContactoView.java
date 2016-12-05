package dam.pucp.edu.pe.taskmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacto_view);

        final Button call = (Button)findViewById(R.id.button6);
        final Button mail = (Button)findViewById(R.id.button7);
        final TextView nro = (TextView) findViewById(R.id.textView11);
        final TextView mailUri = (TextView) findViewById(R.id.textView13);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phno = nro.getText().toString();

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + phno));
                startActivity(callIntent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = mailUri.getText().toString();

                Intent i = new Intent(Intent.CATEGORY_APP_EMAIL, Uri.parse(correo));
                startActivity(i);
            }
        });


    }
}
