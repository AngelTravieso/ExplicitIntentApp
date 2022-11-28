package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring widgets
    Button btn1;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize widgets
        txt.findViewById(R.id.textView);
        btn1.findViewById(R.id.btn);

        // tap of the button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to the 2nd activity
                // Explicit intent
                Intent i = new Intent(getApplicationContext(), Activity2.class);

                // Send data between activities
                i.putExtra("id", "1000"); // key, value (it's similar to the map)




                startActivity(i);
            }
        });

    }
}