package com.example.wikianimales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListaAdaptador adaptador;
    private ArrayList<Animal> animales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);

        animales = new ArrayList<>();

        //cargamos la lista de animales
        animales.add(new Animal(R.drawable.buho,"Búho",getString(R.string.buho )));
        animales.add(new Animal(R.drawable.colibri, "Colibrí", getString(R.string.colibri)));
        animales.add(new Animal(R.drawable.cuervo, "Cuervo", getString(R.string.cuervo)));
        animales.add(new Animal(R.drawable.flamenco, "Flamenco", getString(R.string.flamenco)));
        animales.add(new Animal(R.drawable.kiwi, "Kiwi", getString(R.string.kiwi)));
        animales.add(new Animal(R.drawable.loro, "Loro", getString(R.string.loro)));
        animales.add(new Animal(R.drawable.pavo, "Pavo", getString(R.string.pavo)));
        animales.add(new Animal(R.drawable.pinwino, "Pingüino", getString(R.string.pinwino)));

        //referenciamos el listView
        listView = (ListView) findViewById(R.id.listado);

        //creamos nuestro adaptador
        adaptador = new ListaAdaptador(this, R.layout.entrada, animales);
        //asignamos nuestro adaptador a la lista
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override //sobreescribimos la funcion
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, DescripcionAnimal.class);
                i.putExtra("id_img", animales.get(position).getAnimal());
                i.putExtra("nombre", animales.get(position).getNombre());
                i.putExtra("desc", animales.get(position).getDescripcion());
                startActivity(i);
            }
        });


    }
}
