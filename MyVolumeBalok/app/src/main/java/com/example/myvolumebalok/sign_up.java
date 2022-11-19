package com.example.myvolumebalok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_up extends AppCompatActivity {
    Button btn_enter_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btn_enter_up = (Button) findViewById(R.id.btn_enter_up);

        btn_enter_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukakan = new Intent(getApplicationContext(),sign_in.class);
                startActivity(bukakan);
            }
        });
    }
}