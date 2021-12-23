package com.example.wps;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


public class HomePageActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Wisata> objWisata = new ArrayList<>();
    WisataRecyclerViewAdapter adapter= new WisataRecyclerViewAdapter(objWisata);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        recyclerView = findViewById(R.id.recyclerView);

        objWisata.add(new Wisata("Gua Maria",R.drawable.img_bg,4.8,"Semarang"));
        objWisata.add(new Wisata("Kota Lama",R.drawable.img_bg2,4.8,"Semarang"));

        adapter = new WisataRecyclerViewAdapter(objWisata);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));



        ViewPager2 locationsViewPager = findViewById(R.id.viewPager);


        List<TravelLocation> travelLocations = new ArrayList<>();

        TravelLocation travelLocationSemarangIndah = new TravelLocation();
        travelLocationSemarangIndah.wisataImage = R.drawable.img_bg2;
        travelLocationSemarangIndah.title = "Semarang Indah";
        travelLocationSemarangIndah.starRating = 4.8f;
        travelLocationSemarangIndah.time = "08.30";
        travelLocationSemarangIndah.wib = "AM";
        travelLocationSemarangIndah.location = "Close";
        travelLocations.add(travelLocationSemarangIndah);

        TravelLocation travelLocationSemarangIndah2 = new TravelLocation();
        travelLocationSemarangIndah2.wisataImage = R.drawable.img_bg;
        travelLocationSemarangIndah2.title = "Semarang Indah";
        travelLocationSemarangIndah2.starRating = 4.8f;
        travelLocationSemarangIndah2.time = "07.00";
        travelLocationSemarangIndah2.wib = "AM";
        travelLocationSemarangIndah2.location = "Open";
        travelLocations.add(travelLocationSemarangIndah2);

        locationsViewPager.setAdapter(new TravelLocationAdapter(travelLocations));

    }
}