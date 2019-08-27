package com.example.tugas5rikii;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class samsung22 extends RecyclerView.Adapter<samsung22.samsung22holder> {
    private ArrayList<samsung21> listGame;

    samsung22(ArrayList<samsung21> samsung21) {this.listGame = samsung21; }
    @NonNull
    @Override
    public samsung22.samsung22holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.nama_hp, viewGroup, false);
        return new samsung22holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull samsung22.samsung22holder holder, int position) {
        samsung21 samsung = listGame.get(position);

        Glide.with(holder.itemView.getContext())
                .load(R.drawable.awaw)
                .apply(new RequestOptions().override(350, 550))
                .into(holder.gambar);

        holder.name.setText(samsung.getName());
        holder.desk.setText(samsung.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return listGame.size();
    }

    public class samsung22holder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView name, desk;


        public samsung22holder(@NonNull View itemView) {
            super(itemView);

            gambar = itemView.findViewById(R.id.img_item_foto);
            name = itemView.findViewById(R.id.item_name);
            desk = itemView.findViewById(R.id.item_deks);
        }
    }
}
