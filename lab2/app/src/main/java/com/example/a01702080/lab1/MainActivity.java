package com.example.a01702080.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.*;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText write;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        write = (EditText)findViewById(R.id.editText);

    }

    //Metodo del botón aplastame wink
    public void Aplastame(View view){
        Intent aplastame = new Intent(this, SecondActivity.class);
        aplastame.putExtra("dato", write.getText().toString());
        startActivity(aplastame);
    }

}
