package com.example.lab4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView mTitleTv, mDescTv;
    ImageView mImageIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        ActionBar actionBar = getSupportActionBar();

        mTitleTv = findViewById(R.id.title);
        mDescTv = findViewById(R.id.description);
        mImageIv = findViewById(R.id.imageView);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("ARG_ITEM_ID");
        String mDescription = intent.getStringExtra("DETAILS_ITEM");

        actionBar.setTitle(mTitle);

        mTitleTv.setText("Информация об элементе: " + mTitle);
        mDescTv.setText(mDescription);
    }
}
