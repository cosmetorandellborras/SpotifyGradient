package com.example.spotifygradient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class ThirdActivity extends AppCompatActivity {

    private SeekBar seekBar2;
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        layout = (ConstraintLayout) findViewById(R.id.constraint);

        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.i("SeekBar",String.valueOf(i));
                String num = String.valueOf(i);
                num = num.substring(num.length()-1);
                Log.i("SeekBar",String.valueOf(num));
                int option = Integer.valueOf(num);
                switch (option){
                    case 0: layout.setBackgroundColor(Color.BLACK); break;
                    case 1: layout.setBackgroundColor(Color.BLUE); break;
                    case 2: layout.setBackgroundColor(Color.RED); break;
                    case 3: layout.setBackgroundColor(Color.GREEN); break;
                    case 4: layout.setBackgroundColor(Color.CYAN); break;
                    case 5: layout.setBackgroundColor(Color.GRAY); break;
                    case 6: layout.setBackgroundColor(Color.MAGENTA); break;
                    case 7: layout.setBackgroundColor(Color.YELLOW); break;
                    case 8: layout.setBackgroundColor(Color.DKGRAY); break;
                    case 9: layout.setBackgroundColor(Color.WHITE); break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}