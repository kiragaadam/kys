package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button klik1;

    Button klik2;

    TextView tekst;

    Integer ilosc = 0;

    Integer amount = 1;
    Switch zmiana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klik1 = findViewById(R.id.button);

        klik2 = findViewById(R.id.button2);

        tekst = findViewById(R.id.textView);

        zmiana = findViewById(R.id.switch1);


        klik1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                ilosc = ilosc + amount;
                tekst.setText("Kliknięcia: " + ilosc);

            }
        });
        klik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ilosc = 0;
                tekst.setText("Kliknięcia: " + ilosc);


            }
        });




        zmiana.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(zmiana.isChecked()){
                    amount = -1;
                } else
                {
                    amount = 1;
                }

            }
        });


    }
}
