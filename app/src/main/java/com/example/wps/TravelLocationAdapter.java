package com.example.wps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TravelLocationAdapter extends RecyclerView.Adapter<TravelLocationAdapter.TravelLocationViewHolder> {

    private final List<TravelLocation> travelLocations;

    public TravelLocationAdapter(List<TravelLocation> travelLocations) {
        this.travelLocations = travelLocations;
    }

    @NonNull
    @Override
    public TravelLocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TravelLocationViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_contrain_location_new,
                        parent,
                        false
                )

        );
    }

    @Override
    public void onBindViewHolder(@NonNull TravelLocationViewHolder holder, int position) {
        holder.setLocationData(travelLocations.get(position));

    }

    @Override
    public int getItemCount() {
        return travelLocations.size();
    }

    static class TravelLocationViewHolder extends RecyclerView.ViewHolder {
        private final KenBurnsView kbvLocation;
        private final TextView textTitel;
        private final TextView textLocation;
        private final TextView textStarRating;
        private final TextView textTime;
        private final TextView textWib;

        TravelLocationViewHolder(@NonNull View itemView) {
            super(itemView);
            kbvLocation = itemView.findViewById(R.id.kbvLocation);
            textTitel = itemView.findViewById(R.id.txt_title_wisata);
            textTime = itemView.findViewById(R.id.txt_time);
            textLocation = itemView.findViewById(R.id.txt_km);
            textStarRating = itemView.findViewById(R.id.txt_reting);
            textWib = itemView.findViewById(R.id.txt_wib);

        }

        void setLocationData(TravelLocation travelLocation) {
            Picasso.get().load(travelLocation.wisataImage).into(kbvLocation);
            textLocation.setText(travelLocation.location);
            textTitel.setText(travelLocation.title);
            textWib.setText(travelLocation.wib);
            textStarRating.setText(String.valueOf(travelLocation.starRating));
            textTime.setText(travelLocation.time);


        }
    }
}
