package com.example.wikianimales;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAdaptador extends BaseAdapter {

    private Context contexto;
    private int layout;
    private ArrayList<Animal> animales;

    public ListaAdaptador(Context contexto, int layout, ArrayList<Animal> animales){
        this.contexto=contexto;
        this.layout=layout;
        this.animales=animales;
    }

    @Override
    public int getCount() {

        //devuelve el nº de elementos en la lista comunidades
        return animales.size();
    }

    @Override
    public Object getItem(int position) {

        //devuelve los valores de un animal
        return animales.get(position);
    }

    @Override
    public long getItemId(int id) {

        //devuelve el id de un animal
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //cubre cada item del list view con los datos del array

        View vista = convertView;

        LayoutInflater inflador = LayoutInflater.from(contexto);
        vista = inflador.inflate(R.layout.entrada, null);

        //extraemos los datos de un elemento actual de la lista
        Animal itemAnimal = (Animal) getItem(position);

        //referenciamos por el id los componentes del layout
        ImageView img_animal = (ImageView) vista.findViewById(R.id.imagen);
        TextView nombre = (TextView) vista.findViewById(R.id.tv_titulo);
        TextView desc = (TextView) vista.findViewById(R.id.tv_descripcion);

        //asignamos los valores a las vistas
        img_animal.setImageResource(itemAnimal.getAnimal());
        nombre.setText(itemAnimal.getNombre());
        desc.setText(itemAnimal.getDescripcion());

        //devolvemos la vista para que se muestre en el listView
        return vista;
    }
}
