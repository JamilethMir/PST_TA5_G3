package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void elegir(View v){
        ImageView ima = (ImageView)v;
        int id = ima.getId();


        String idString = "no id";
        if(id != View.NO_ID) {                    // make sure id is valid
            Resources res = v.getResources();     // get resources
            if(res != null)
                idString = res.getResourceEntryName(id); // get id string entry
        }

        Intent i = new Intent(this, Info.class );
        i.putExtra("id",idString);

        startActivity(i);


        }
}

