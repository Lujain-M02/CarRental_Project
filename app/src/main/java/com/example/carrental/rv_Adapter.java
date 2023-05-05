package com.example.carrental;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rv_Adapter extends RecyclerView.Adapter<rv_Adapter.rvViewHolderClass> {

    ArrayList<Car> CarList;


    public rv_Adapter(ArrayList<Car> carList) {
        CarList = carList;
    }

    @NonNull
    @Override
    public rvViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new rvViewHolderClass(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_cars,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull rvViewHolderClass holder, int position) {
        Car CarObject=CarList.get(position);
        holder.sr_tv_carName.setText(CarObject.getName());
        holder.sr_iv_cars.setImageBitmap(CarObject.getImage());
    }

    @Override
    public int getItemCount() {
        return CarList.size();
    }

    public static class rvViewHolderClass extends RecyclerView.ViewHolder{

         TextView sr_tv_carName;
         ImageView sr_iv_cars;


        public rvViewHolderClass(@NonNull View itemView) {
            super(itemView);
            sr_tv_carName=itemView.findViewById(R.id.sr_tv_carName);
            sr_iv_cars=itemView.findViewById(R.id.sr_iv_cars);

        }
    }

}
