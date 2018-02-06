package com.example.matthewschwarz.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private ImageView supermoonPic;
    private ImageView waterfallPic;

    private int imageID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        supermoonPic = findViewById(R.id.supermoon);
        waterfallPic = findViewById(R.id.waterfall);

        supermoonPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "supermoon clicked", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.supermoon;
                finish();

            }
        });

        waterfallPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "waterfall clicked", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.waterfall;
                finish();
            }
        });

    }

    @Override
    public void finish(){
        Intent intent = new Intent();
        intent.putExtra("imageID", imageID);
        setResult(RESULT_OK, intent);
        super.finish();
    }

}
