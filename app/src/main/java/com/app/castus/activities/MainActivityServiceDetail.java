package com.app.castus.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.castus.castusapp.R;

public class MainActivityServiceDetail extends AppCompatActivity {
    String Nom;
    String Description;
    int Thumnail;

    private TextView tv_nom;
    private TextView tv_description;
    private ImageView img_Thumnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_service_detail);

        tv_description = findViewById(R.id.tv_description);
        tv_nom = findViewById(R.id.tv_nom_id);
        img_Thumnail = findViewById(R.id.id_thumbail);

        //recurer data
        Intent intent =getIntent();
        Nom = intent.getExtras().getString("Nom");
       Description = intent.getExtras().getString("Description");
       Thumnail = intent.getExtras().getInt("Thumbnail");

       tv_description.setText(Description);
       tv_nom.setText(Nom);
       img_Thumnail.setImageResource(Thumnail);


    }
}
