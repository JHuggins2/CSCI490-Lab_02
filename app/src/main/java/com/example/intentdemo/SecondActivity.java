package com.example.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private ImageView moonImg;
    private ImageView waterImg;
    private int imageId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        //String str = i.getExtras().getString(getString(R.string.str_key1));


        moonImg = findViewById(R.id.moonImg);
        waterImg = findViewById(R.id.waterImg);

        moonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageId = R.drawable.supermoon;
                finish();
            }
        });

        waterImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageId = R.drawable.waterfall;
                finish();
            }
        });



    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra(getString(R.string.imageId_key1), imageId);

        setResult(RESULT_OK, intent);
        super.finish();
    }
}
