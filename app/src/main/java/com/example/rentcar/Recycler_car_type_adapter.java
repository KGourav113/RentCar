package com.example.rentcar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_car_type_adapter extends RecyclerView.Adapter <Recycler_car_type_adapter.Holder>{


    ArrayList<car_type_model> carTypeModels = new ArrayList<>();
    public Recycler_car_type_adapter( ArrayList<car_type_model> carTypeModels){

        this.carTypeModels = carTypeModels;

    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car_type, parent, false);
        return new Holder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.Image.setImageResource(carTypeModels.get(position).Car_Image);
        holder.CarName.setText(carTypeModels.get(position).Car_Name);


    }

    @Override
    public int getItemCount() {
        return carTypeModels.size();
    }

    public static class Holder extends RecyclerView.ViewHolder{
        ImageView Image;
        TextView CarName;
        public Holder(View item){
            super(item);
            Image = item.findViewById(R.id.car_type_image);
            CarName = item.findViewById(R.id.car_type_name);
        }


    }

}
