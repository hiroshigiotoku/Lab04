package dam.pucp.edu.pe.taskmanager;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the TabHost that will contain the Tabs
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabHost.TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second Tab");

        // Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
        tab1.setIndicator("Contactos");
        tab1.setContent(new Intent(this,Tab1Activity.class));

        tab2.setIndicator("Tareas");
        tab2.setContent(new Intent(this,Tab2Activity.class));

        /** Add the tabs to the TabHost to display. */
        tabHost.addTab(tab1);

        tabHost.addTab(tab2);
    }
}
