package com.example.goldenteamproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goldenteamproject.R;
import com.example.goldenteamproject.models.DeatailedDialeyModel;

import java.util.List;

public class DetailedDialeyAdapter extends RecyclerView.Adapter<DetailedDialeyAdapter.ViewHoldar> {
    List<DeatailedDialeyModel> list;
    Context context;

    public DetailedDialeyAdapter(List<DeatailedDialeyModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHoldar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHoldar(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item,parent,false));

    }

    public DetailedDialeyAdapter(List<DeatailedDialeyModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoldar holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.desc.setText(list.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHoldar extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,desc;
        public ViewHoldar(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.detailed_img);
            name= itemView.findViewById(R.id.detailed_name);
            desc = itemView.findViewById(R.id.detailed_desc);
        }
    }
}
