package com.atnncei.vnuaak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import java.util.WeakHashMap;

public class Center extends AppCompatActivity {
    WebView we;
    ImageView imP;
    Boolean ool =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center);
        getWindow().addFlags(1024);
        ImageView im = findViewById(R.id.imageView);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.animate().rotationBy(200);
            }
        });
         we = findViewById(R.id.privacy11);
         imP = findViewById(R.id.imageViewPrivacy);

    }

    public void Clk(View v) {
        switch (v.getId()) {
            case R.id.start:
                Intent intent = new Intent(this, PointGG.class);
                startActivity(intent);
                break;
            case R.id.privacy:
                we.loadUrl(Dec.DecPoo("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49Vm82aTVWeHJVWHg2b2F0WVJtSFNWYVh4QUliNzZBQ1E="));
                we.setVisibility(View.VISIBLE);
                imP.setVisibility(View.VISIBLE);
                ool = true;
                break;
            case R.id.imageViewPrivacy:

                we.setVisibility(View.INVISIBLE);
                imP.setVisibility(View.INVISIBLE);
                break;
            case R.id.backk:
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if(ool) {
            Intent intent = new Intent(this, Center.class);
            startActivity(intent);
            finishAffinity();
            ool = false;
        }
    }
}