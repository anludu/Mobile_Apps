package com.example.a01702080.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.*;
import android.widget.*;

public class SecondActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = (TextView)findViewById(R.id.textView);

        String dato = getIntent().getStringExtra("dato");
        text.setText("Texto " + dato);

    }

    //Metodo del botón back
    public void Back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}
