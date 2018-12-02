package com.example.jilson.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MusicStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);

        Button buyButton1 = findViewById(R.id.buy_button_1);
        buyButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),PaymentActivity.class);
                startActivity(i);
            }
        });

        Button buyButton2 = findViewById(R.id.buy_button_2);
        buyButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),PaymentActivity.class);
                startActivity(i);
            }
        });

        /* TextView object is created and onClickListener is set to the object
        *  Intent object i is used for starting next activity
        *  */
        Button buyButton3 = findViewById(R.id.buy_button_3);
        buyButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),PaymentActivity.class);
                startActivity(i);
            }
        });

        Button buyButton4 = findViewById(R.id.buy_button_4);
        buyButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),PaymentActivity.class);
                startActivity(i);
            }
        });

        Button buyButton5 = findViewById(R.id.buy_button_5);
        buyButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),PaymentActivity.class);
                startActivity(i);
            }
        });

        Button buyButton6 = findViewById(R.id.buy_button_6);
        buyButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),PaymentActivity.class);
                startActivity(i);
            }
        });
    }
}
