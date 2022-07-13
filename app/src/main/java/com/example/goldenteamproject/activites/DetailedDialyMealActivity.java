package com.example.goldenteamproject.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.goldenteamproject.R;
import com.example.goldenteamproject.adapters.DetailedDialeyAdapter;
import com.example.goldenteamproject.models.DeatailedDialeyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDialyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DeatailedDialeyModel> deatailedDialeyModels;
    DetailedDialeyAdapter detailedDialeyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detailed_dialy_meal);
        String type = getIntent().getStringExtra("Type");
        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        deatailedDialeyModels = new ArrayList<>();
        detailedDialeyAdapter = new DetailedDialeyAdapter(deatailedDialeyModels);
        recyclerView.setAdapter(detailedDialeyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){

            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodbreakfast,"Breakfast meal","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.saladtwo,"salad","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodfour,"Breakfast","description"));
            detailedDialeyAdapter.notifyDataSetChanged();
        }


        if (type != null && type.equalsIgnoreCase("lunch")){

            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodtwo,"lunch","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodseven,"lunch stuff","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodbreakfast,"lunch things","description"));
            detailedDialeyAdapter.notifyDataSetChanged();
        }


        if (type != null && type.equalsIgnoreCase("dinner")){

            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodfour,"dinner","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodtwo,"dinner","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodtwo,"dinner","description"));
            detailedDialeyAdapter.notifyDataSetChanged();
        }


        if (type != null && type.equalsIgnoreCase("healthySweets")){

            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodbreakfast,"healthySweets","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodbreakfast,"healthySweets","description"));
            deatailedDialeyModels.add(new DeatailedDialeyModel(R.drawable.foodbreakfast,"healthySweets","description"));
            detailedDialeyAdapter.notifyDataSetChanged();
        }
    }
}