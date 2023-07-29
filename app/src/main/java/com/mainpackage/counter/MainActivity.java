package com.mainpackage.counter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtCounter = findViewById(R.id.txtCounter);
        Button btnCount = findViewById(R.id.btnCount);


        btnCount.setOnClickListener(view -> txtCounter.setText(String.valueOf(counter())));
    }
    public int counter(){

         count++;
         return count;

    }
}