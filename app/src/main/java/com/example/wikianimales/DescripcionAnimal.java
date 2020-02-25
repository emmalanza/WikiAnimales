package com.example.wikianimales;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DescripcionAnimal extends AppCompatActivity {

    private ImageView imagen_animal;
    private TextView text_nombre, text_descripcion;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc_animal);

        imagen_animal = (ImageView) findViewById(R.id.img_anml);
        text_nombre = (TextView) findViewById(R.id.tv_nombre_animal);
        text_descripcion = (TextView) findViewById(R.id.tv_desripcion_animal);

        Bundle extras = getIntent().getExtras();
        String nombre, desc; int img;
        nombre = extras.getString("nombre");
        desc = extras.getString("desc");
        img = extras.getInt("id_img");

        imagen_animal.setImageResource(img);
        text_nombre.setText(nombre);
        text_descripcion.setText(desc);

    }



}
