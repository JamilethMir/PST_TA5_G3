package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Info extends AppCompatActivity {

    private TextView name, autor, actorcine, descripcion;
    private ImageView imagen;
    private Personaje actual;
    private String id;
    private int codigo;
    private ArrayList<Personaje> personajes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        personajes.add(new Personaje("ironman", "IronMan", "Robert Downey Jr.", "Un hombre extremadamente inteligente con una armadura increiblemente poderosa", "Stan Lee", getResources().getDrawable(R.drawable.ironman)));
        personajes.add(new Personaje("thor", "Thor", "Chris Hemsworth", "El dios del trueno, el vengador mas fuerte", "Stan Lee", getResources().getDrawable(R.drawable.thor)));
        personajes.add(new Personaje("wanda", "Scarlet Witch", "Elizabeth Olsen", "Al principio era una villana, luego se unio a los vengadores con sus asombrosos poderes psiquicos", "Stan Lee", getResources().getDrawable(R.drawable.wanda)));
        personajes.add(new Personaje("widow", "Black Widow", "Scarlett Johanson", "Una espia de elite, siempre dispuesta a cumplir las misiones mas peligrosas", "Stan Lee", getResources().getDrawable(R.drawable.blackwidow)));
        personajes.add(new Personaje("spiderman", "Spiderman", "Tom Holland", "Un chico con poderes de araña y un sugar daddy millonario", "Steve Dikto", getResources().getDrawable(R.drawable.spiderman)));
        personajes.add(new Personaje("strange", "Dr Strange", "Bennedict Cumberbacht", "El hechicero supremo", "Stan Lee", getResources().getDrawable(R.drawable.strange)));
        name = (TextView) findViewById(R.id.nombre);
        autor = (TextView) findViewById(R.id.creador);
        actorcine = (TextView) findViewById(R.id.actor);
        descripcion = (TextView) findViewById(R.id.descripcion);
        imagen = (ImageView) findViewById(R.id.foto);
        Bundle bundle = getIntent().getExtras();
        id = bundle.getString("id");
        codigo = bundle.getInt("codigoimage");
        for (Personaje p : personajes) {
            if (id.equals(p.getId())) {
                Log.d("codigo", String.valueOf(codigo));
                Log.d("id", String.valueOf(R.drawable.ironman));
                name.setText(p.getNombre());
                actorcine.setText(p.getActor());
                autor.setText(p.getCreador());
                descripcion.setText(p.getDescripcion());
                imagen.setImageDrawable(p.getImagen());
            }

        }


    }

}
