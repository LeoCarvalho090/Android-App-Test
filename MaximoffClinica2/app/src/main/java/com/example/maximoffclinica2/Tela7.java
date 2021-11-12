package com.example.maximoffclinica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela7 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_tela7);

        Button btn_prf = (Button) findViewById(R.id.btn_prf);
        btn_prf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent prf = new Intent(getBaseContext(), perfil.class);

                startActivity(prf);

            }
        });

        Button btn_config = findViewById(R.id.btn_config);

        btn_config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent config = new Intent(getBaseContext(), config.class);

                startActivity(config);
            }
        });

        Button btn_newconsult = findViewById(R.id.btn_newconsult);

        btn_newconsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent newconsult = new Intent(getBaseContext(), newconsult.class);

                startActivity(newconsult);
            }
        });

        Button btn_consultinf = findViewById(R.id.btn_consultinf);

        btn_consultinf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent newconsult = new Intent(getBaseContext(), newconsult.class);

                startActivity(newconsult);

            }
        });
    }
}

