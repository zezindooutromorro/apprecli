package com.example.coletalixo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button voltar = findViewById(R.id.btn_voltar3);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });



        Button prefeitura = findViewById(R.id.btn_prefeitura);
        prefeitura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri number = Uri.parse("tel: (41) 3590-3500");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);


            }
        });










    }
}