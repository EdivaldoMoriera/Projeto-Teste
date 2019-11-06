package com.example.meuprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button jogar;
    private Button jogar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = (Button) findViewById(R.id.BotaoId);
        jogar2 = (Button) findViewById(R.id.botao2) ;
        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Oi", Toast.LENGTH_LONG).show();
            }
        });

        jogar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Oi de novo", Toast.LENGTH_LONG).show();
            }
        });
    }
}
