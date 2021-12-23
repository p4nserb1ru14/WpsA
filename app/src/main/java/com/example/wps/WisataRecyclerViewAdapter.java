package com.example.wps;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaviofaria.kenburnsview.KenBurnsView;

import java.util.ArrayList;

public class WisataRecyclerViewAdapter extends RecyclerView.Adapter<WisataRecyclerViewAdapter.WisataViewHolder> {

    ArrayList<Wisata> arrayListWisata;

    public WisataRecyclerViewAdapter(ArrayList<Wisata> arrayListWisata) {
        this.arrayListWisata = arrayListWisata;
    }

    @NonNull
    @Override
    public WisataRecyclerViewAdapter.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wisata_list, parent, false);
        return new WisataViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WisataRecyclerViewAdapter.WisataViewHolder holder, int position) {
        final Wisata wisata = arrayListWisata.get(position);

        holder.textTitle.setText(wisata.getTitle());
        holder.textReting.setText(String.valueOf(wisata.getRating()));
        holder.textLocation.setText(wisata.getLocation());
        holder.wisataImage.setImageResource(wisata.getWisataImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailWisataActivity.class);
                intent.putExtra("WISATA",(wisata));
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayListWisata.size();
    }

    public static class WisataViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle, textReting, textLocation;
        ImageView wisataImage;

        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            KenBurnsView kbvLocation = itemView.findViewById(R.id.kbvLocation);
            textTitle = itemView.findViewById(R.id.textName);
            textReting = itemView.findViewById(R.id.txt_reting);
            textLocation = itemView.findViewById(R.id.txt_location);
            wisataImage = itemView.findViewById(R.id.imageview);
        }

    }
}
