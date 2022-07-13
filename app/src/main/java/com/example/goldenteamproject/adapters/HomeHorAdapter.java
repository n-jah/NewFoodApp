package com.example.goldenteamproject.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goldenteamproject.R;
import com.example.goldenteamproject.models.HomeHorModel;
import com.example.goldenteamproject.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {
    UpdateVerticalRec   updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(list.get(position).getImg());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel("Corn Chowder",R.drawable.corchowder,"It's chock full of carrots, potatoes, and corn for a filling and tasty meal. "));
            homeVerModels.add(new HomeVerModel("Peanut Butter Oatmeal Bars",R.drawable.sweetsone,"These peanut butter oatmeal bars are the best trick! They’re no bake, easy and healthy; and the flavor is out of this world. "));
            homeVerModels.add(new HomeVerModel("Herb-Crusted Salmon",R.drawable.protin_salamon,"Flaky salmon slathered in creamy dijon mustard then topped with crispy panko and fresh herbs. "));
            homeVerModels.add(new HomeVerModel("Spicy Shrimp and Cauliflower Mash With Garlic Kale" ,R.drawable.protienschremb,"Spicy Shrimp with Cauliflower Mash and Garlic Kale – tender-sweet shrimp and smoky garlic kale over creamy cauliflower mash. The most DELICIOUS fake-fancy weeknight dinner! "));
            homeVerModels.add(new HomeVerModel("Skillet Garlic Parmesan Chicken Thighs",R.drawable.protienschicken,"Amazing one-pan skillet meal. A mouth-watering recipe done in 30 minutes with only 262 calories per serving! "));
            homeVerModels.add(new HomeVerModel("Sun-Dried Tomato Pesto Pasta Salad",R.drawable.carbspasta,"No one said you have to give up pasta to eat clean. "));
            homeVerModels.add(new HomeVerModel("This Chicken Zoodle Soup" ,R.drawable.carbnodels,"This Chicken Zoodle Soup Recipe Is Comfort Food Wrapped in a Whole30 Hug"));
            homeVerModels.add(new HomeVerModel("Garlic Mushroom Quinoa",R.drawable.carpmashroum,"You can easily make this into your main meal. "));
            homeVerModels.add(new HomeVerModel("Try This Keto-Friendly Steak Taco",R.drawable.taco," your favorite taco fillings, including steak, are stuffed inside crispy cheddar cheese shells for a beginner "));
            homeVerModels.add(new HomeVerModel("Mediterranean Boneless Pork Chops" ,R.drawable.diarysalad,"Vegetables is made with thin sliced,olives and Feta cheese.  "));
            homeVerModels.add(new HomeVerModel("Healthy Chocolate Pudding Snack" ,R.drawable.sweetstwo,"Need a chocolate fix? This chocolate snack tastes rich and chocolaty, but it’s just Greek yogurt, cocoa powder and maple syrup. And it’s made in 2 minutes!"));
            homeVerModels.add(new HomeVerModel("Chocolate Covered Bananas" ,R.drawable.sweetthree,"Frozen chocolate covered bananas are the perfect easy and healthy dessert! Store them in the freezer for whenever you crave a sweet bite."));

//لما تضغط علي عنصر من الايتمز ينزل الي تحط من نفس النوع
            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();
                    if (position == 0)
                    {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel("Corn Chowder",R.drawable.corchowder,"It's chock full of carrots, potatoes, and corn for a filling and tasty meal. "));
                        homeVerModels.add(new HomeVerModel("Sun-Dried Tomato Pesto Pasta Salad",R.drawable.carbspasta,"No one said you have to give up pasta to eat clean. "));
                        homeVerModels.add(new HomeVerModel("This Chicken Zoodle Soup" ,R.drawable.carbnodels,"This Chicken Zoodle Soup Recipe Is Comfort Food Wrapped in a Whole30 Hug"));
                        homeVerModels.add(new HomeVerModel("Garlic Mushroom Quinoa",R.drawable.carpmashroum,"You can easily make this into your main meal. "));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }else if (position ==1 ){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel("Herb-Crusted Salmon",R.drawable.protin_salamon,"Flaky salmon slathered in creamy dijon mustard then topped with crispy panko and fresh herbs. "));
                        homeVerModels.add(new HomeVerModel("Spicy Shrimp and Cauliflower Mash With Garlic Kale" ,R.drawable.protienschremb,"Spicy Shrimp with Cauliflower Mash and Garlic Kale – tender-sweet shrimp and smoky garlic kale over creamy cauliflower mash. The most DELICIOUS fake-fancy weeknight dinner! "));
                        homeVerModels.add(new HomeVerModel("Skillet Garlic Parmesan Chicken Thighs",R.drawable.protienschicken,"Amazing one-pan skillet meal. A mouth-watering recipe done in 30 minutes with only 262 calories per serving! "));
                        updateVerticalRec.callBack(position,homeVerModels);

                    }else if (position ==2 ){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel("Sun-Dried Tomato Pesto Pasta Salad",R.drawable.carbspasta,"No one said you have to give up pasta to eat clean. "));
                        homeVerModels.add(new HomeVerModel("This Chicken Zoodle Soup" ,R.drawable.carbnodels,"This Chicken Zoodle Soup Recipe Is Comfort Food Wrapped in a Whole30 Hug"));
                        homeVerModels.add(new HomeVerModel("Garlic Mushroom Quinoa",R.drawable.carpmashroum,"You can easily make this into your main meal. "));
                        updateVerticalRec.callBack(position,homeVerModels);

                    }else if (position ==3 ){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel("Try This Keto-Friendly Steak Taco",R.drawable.taco," your favorite taco fillings, including steak, are stuffed inside crispy cheddar cheese shells for a beginner "));
                        homeVerModels.add(new HomeVerModel("Mediterranean Boneless Pork Chops" ,R.drawable.diarysalad,"Vegetables is made with thin sliced,olives and Feta cheese.  "));
                        homeVerModels.add(new HomeVerModel("Corn Chowder",R.drawable.corchowder,"It's chock full of carrots, potatoes, and corn for a filling and tasty meal. "));

                        updateVerticalRec.callBack(position,homeVerModels);


                    }else if (position ==4 ){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel("One-Pan Healthy Sausage and Veggies",R.drawable.vegpen,"makes for the best simple, filling, and nutritious dinner with virtually no cleanup! "));
                        homeVerModels.add(new HomeVerModel("Baked Bell Pepper Tacos" ,R.drawable.vetsalad,"Itou can prep these ahead of time and have them ready to pop in the oven when you get home"));
                        homeVerModels.add(new HomeVerModel("Classic Bruschetta" ,R.drawable.vetsaldo,"Chiffonade the basil by stacking the leaves in a pile."));


                        updateVerticalRec.callBack(position,homeVerModels);

                    }else if (position ==5 ){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel("Peanut Butter Oatmeal Bars",R.drawable.sweetsone,"These peanut butter oatmeal bars are the best trick! They’re no bake, easy and healthy; and the flavor is out of this world. "));
                        homeVerModels.add(new HomeVerModel("Healthy Chocolate Pudding Snack" ,R.drawable.sweetstwo,"Need a chocolate fix? This chocolate snack tastes rich and chocolaty, but it’s just Greek yogurt, cocoa powder and maple syrup. And it’s made in 2 minutes!"));
                        homeVerModels.add(new HomeVerModel("Chocolate Covered Bananas" ,R.drawable.sweetthree,"Frozen chocolate covered bananas are the perfect easy and healthy dessert! Store them in the freezer for whenever you crave a sweet bite."));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }

                }
            });
            //////////////////////////////////////////////////////
            //لما تختار النود يتغير لونها
            if (select){
                if (position ==0 ){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }else{
                if (row_index==position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);

                }else {
                    holder.cardView.setBackgroundResource(R.drawable.defulte_bg);
                }
            }

        }


    @Override
    public int getItemCount() {
        return list.size();
    }

     public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.hor_img);
            name=itemView.findViewById(R.id.hor_txt);
            cardView = itemView.findViewById(R.id.card_view_of_scroll);


        }
    }
}
