package com.example.owen.dsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView quantity, tvTwo,cashprice ,tvPrice;
    Button submit, addbtn , subtractbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Submit coffee", Toast.LENGTH_SHORT).show();

                Intent pageTwo = new Intent(MainActivity.this, OderActivity.class);
                startActivity(pageTwo);
            }
        });

    }

    public void submitOder(View view)
    {
        display(1);
    }
    public void increment(View view)
    {
        //
    }
    public void decrement(View view)
    {
        //
    }

    public  void findIds()
    {
        quantity = (TextView) findViewById(R.id.tvquantity);
        tvTwo = (TextView) findViewById(R.id.tvTtwo);
        submit = (Button) findViewById(R.id.btnSubmit);
        subtractbtn = (Button) findViewById(R.id.btnSub);
        addbtn = (Button)findViewById(R.id.btnAdd);
        tvPrice = (TextView)findViewById(R.id.tvPrice);
        cashprice = (TextView)findViewById(R.id.tvcashPrice);
    }
    private  void display(int number)
    {
           quantity.setText("you have " + number);
    }
}
