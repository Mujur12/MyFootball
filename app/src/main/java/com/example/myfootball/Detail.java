package com.example.myfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    public static final String EXTRA_DATA = "extra_data";
    private TextView txtDetail;
    private ImageView imgDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail");

        txtDetail = findViewById(R.id.txt_detail);
        imgDetail = findViewById(R.id.img_detail);

        final Club club = getIntent().getParcelableExtra(EXTRA_DATA);

        txtDetail.setText(club.getDetail());
        Glide.with(this)
                .load(club.getPhoto())
                .into(imgDetail);
    }
}