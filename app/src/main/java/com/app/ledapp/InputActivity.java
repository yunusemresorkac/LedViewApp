package com.app.ledapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    private EditText editText;

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.nextBtn);


        button.setOnClickListener(view -> {
            if (editText.getText().toString().trim().length()>0){
                Intent intent = new Intent(InputActivity.this,MainActivity.class);
                intent.putExtra("word",editText.getText().toString().trim().toUpperCase());
                startActivity(intent);
            }

        });


    }
}