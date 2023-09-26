package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels);

        CardView item = findViewById(R.id.hotel);
        item.setOnClickListener(view -> item());

        CardView item1 = findViewById(R.id.hotel1);
        item1.setOnClickListener(view -> item());

        CardView item2 = findViewById(R.id.hotel2);
        item2.setOnClickListener(view -> item());

        CardView item3 = findViewById(R.id.hotel3);
        item3.setOnClickListener(view -> item());

        CardView item4 = findViewById(R.id.hotel4);
        item4.setOnClickListener(view -> item());

    }

    public void item(){
        Intent intent = new Intent(HotelsActivity.this, Food_List.class);
        startActivity(intent);
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (vibrator != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
            } else {
                vibrator.vibrate(50);
            }
        }
    }
}