package com.example.myfootball;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "extra_data";
    private TextView txtDetail;
    private ImageView imgDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final Club club = getIntent().getParcelableExtra(EXTRA_DATA);

        txtDetail = findViewById(R.id.txt_detail);
        imgDetail = findViewById(R.id.img_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(club.getName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        txtDetail.setText(club.getDetail());
        Glide.with(this)
                .load(club.getPhoto())
                .into(imgDetail);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        this.finish();
        return super.onOptionsItemSelected(item);
    }
}