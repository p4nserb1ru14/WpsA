package com.example.wps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailWisataActivity extends AppCompatActivity {

    TextView textViewTitle, textViewRating, textViewLocation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        imageView = findViewById(R.id.imageview);
        textViewTitle = findViewById(R.id.textName);
        textViewRating = findViewById(R.id.txt_reting);
        textViewLocation = findViewById(R.id.txt_location);



        Wisata wisata = getIntent().getParcelableExtra("WISATA" );
        textViewTitle.setText(wisata.getTitle());
        textViewRating.setText(String.valueOf(wisata.getRating()));
        textViewLocation.setText(wisata.getLocation());
        imageView.setImageResource(wisata.getWisataImage());
    }
}