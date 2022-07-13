package com.example.goldenteamproject.ui.DailyMeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goldenteamproject.R;
import com.example.goldenteamproject.adapters.DialyMealAdapter;
import com.example.goldenteamproject.models.DialyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {
    RecyclerView recyclerView;
    List<DialyMealModel> dialyMealModels;
    DialyMealAdapter dialyMealAdapter;
    
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily_meal,container,false);

        recyclerView=root.findViewById(R.id.dialy_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dialyMealModels = new ArrayList<>();

        dialyMealModels.add(new DialyMealModel(R.drawable.foodbreakfast,"Breakfast","the breakfast is necesarry to start your day ;>","breakfast"));
        dialyMealModels.add(new DialyMealModel(R.drawable.foodfour,"Lunch","the breakfast is necesarry to start your day ;>","lunch"));
        dialyMealModels.add(new DialyMealModel(R.drawable.foodseven,"Dinner","the breakfast is necesarry to start your day ;>","dinner"));
        dialyMealModels.add(new DialyMealModel(R.drawable.foodeight,"Healthy Sweets","the breakfast is necesarry to start your day ;>","healthySweets"));
        dialyMealAdapter = new DialyMealAdapter(this.getContext(),dialyMealModels);
        recyclerView.setAdapter(dialyMealAdapter);
        dialyMealAdapter.notifyDataSetChanged();


        return root;
    }

}