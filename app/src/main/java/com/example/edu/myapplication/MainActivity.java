package com.example.edu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.uno);

        final ArrayList<String> materias = new ArrayList<String>();

        materias.add("fisica");
        materias.add("calculo");
        materias.add("español");
        materias.add("tutoreo");
        materias.add("ingles");
        materias.add("liderazgo");
        materias.add("programacion");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, materias);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast toast =

                Toast.makeText(getApplicationContext(),"Hello " + materias.get(position), Toast.LENGTH_LONG);

                toast.show();


            }

        });

    }

}
