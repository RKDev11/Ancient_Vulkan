package com.atnncei.vnuaak;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PointGG extends AppCompatActivity {

    public Handler handler;
    Boolean o = false;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.activity_point_gg);
        ImageView imageView11 = findViewById(R.id.imageView11);
        ImageView imageView12 = findViewById(R.id.imageView12);
        ImageView imageView13 = findViewById(R.id.imageView13);
        ImageView imageView14 = findViewById(R.id.imageView14);
        ImageView imageView15 = findViewById(R.id.imageView15);
        ImageView imageView21 = findViewById(R.id.imageView21);
        ImageView imageView22 = findViewById(R.id.imageView22);
        ImageView imageView23 = findViewById(R.id.imageView23);
        ImageView imageView24 = findViewById(R.id.imageView24);
        ImageView imageView25 = findViewById(R.id.imageView25);
        ImageView imageView31 = findViewById(R.id.imageView31);
        ImageView imageView32 = findViewById(R.id.imageView32);
        ImageView imageView33 = findViewById(R.id.imageView33);
        ImageView imageView34 = findViewById(R.id.imageView34);
        ImageView imageView35 = findViewById(R.id.imageView35);
        ImageView imageView41 = findViewById(R.id.imageView41);
        ImageView imageView42 = findViewById(R.id.imageView42);
        ImageView imageView43 = findViewById(R.id.imageView43);
        ImageView imageView44 = findViewById(R.id.imageView44);
        ImageView imageView45 = findViewById(R.id.imageView45);
        Button button = findViewById(R.id.button2);
        TextView tv = findViewById(R.id.textView);


        ImageView[][] matrixImage = {{imageView11, imageView12, imageView13, imageView14, imageView15},
                {imageView21, imageView22, imageView23, imageView24, imageView25},
                {imageView31, imageView32, imageView33, imageView34, imageView35},
                {imageView41, imageView42, imageView43, imageView44, imageView45}};

        int[] icons = {R.drawable.bg_stone, R.drawable.ic_slot_13,
                R.drawable.ic_slot_21, R.drawable.ic_slot_31,
                R.drawable.ic_slot_41, R.drawable.ic_slot_51,
                R.drawable.ic_slot_61, R.drawable.ic_slot_71};


        handler = new Handler();
            for (int i = 0; i < matrixImage.length; i++) {
                for (int j = 0; j < matrixImage[i].length; j++) {
                    int n = (int) Math.floor(Math.random() * icons.length);
                    matrixImage[i][j].setImageResource(icons[n]);
                    int finalI = i;
                    int finalJ = j;
                    matrixImage[i][j].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            matrixImage[finalI][finalJ].setImageResource(R.drawable.ic_slot_wild);

                        }
                    });

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            if (matrixImage[0][0].getDrawable().getConstantState() ==
                                    matrixImage[0][4].getDrawable().getConstantState() &&
                                    matrixImage[1][0].getDrawable().getConstantState() ==
                                            matrixImage[1][4].getDrawable().getConstantState() &&
                                    matrixImage[2][0].getDrawable().getConstantState() ==
                                            matrixImage[2][4].getDrawable().getConstantState() &&
                                    matrixImage[3][0].getDrawable().getConstantState() ==
                                            matrixImage[3][4].getDrawable().getConstantState() &&
                                    matrixImage[0][1].getDrawable().getConstantState() ==
                                            matrixImage[3][2].getDrawable().getConstantState()) {
                                o = true;
                            } else {
                                o = false;
                            }
                            if (o) {
                                button.setVisibility(View.VISIBLE);
                                tv.setVisibility(View.VISIBLE);
                            } else {
                                button.setVisibility(View.INVISIBLE);
                            }

                            handler.postDelayed(this::run, 1000);
                        }
                    });


                }
            }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < matrixImage.length; i++) {
                    for (int j = 0; j < matrixImage[i].length; j++) {
                        int n = (int) Math.floor(Math.random() * icons.length);
                        matrixImage[i][j].setImageResource(icons[n]);
                    }
                }
                tv.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);
            }
        });

    }

}
