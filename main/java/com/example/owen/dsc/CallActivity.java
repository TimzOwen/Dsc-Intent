package com.example.owen.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class CallActivity extends AppCompatActivity {
    Button radioBtn , trybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        radioBtn = (RadioButton) findViewById(R.id.radioButton);
        trybtn = (Button) findViewById(R.id.btnTry);

        trybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neew = new Intent(CallActivity.this, OderActivity.class);
                startActivity(neew);
            }
        });

    }
}
