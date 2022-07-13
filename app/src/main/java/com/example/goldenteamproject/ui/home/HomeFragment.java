package com.example.goldenteamproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goldenteamproject.R;
import com.example.goldenteamproject.adapters.HomeHorAdapter;
import com.example.goldenteamproject.adapters.HomeVerAdapter;
import com.example.goldenteamproject.adapters.UpdateVerticalRec;
import com.example.goldenteamproject.models.HomeHorModel;
import com.example.goldenteamproject.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {
    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    ///////////عامودي
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);

        homeHorizontalRec=root.findViewById(R.id.home_hor_rec);
        homeVerticalRec=root.findViewById(R.id.home_ver_rec);
        ///العرضي
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorModelList = new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.saladthree,"   Fats"));
        homeHorModelList.add(new HomeHorModel(R.drawable.proteins,"Proteins"));
        homeHorModelList.add(new HomeHorModel(R.drawable.bread,"  Carbs"));
        homeHorModelList.add(new HomeHorModel(R.drawable.dairy," Dairy"));
        homeHorModelList.add(new HomeHorModel(R.drawable.salad,"    veg"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sweetpotato,"Sweets"));
        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setHasFixedSize(false);
        homeHorizontalRec.setNestedScrollingEnabled(true);
        ////////////////////////
        /////العامودي
        homeVerModelList =new ArrayList<>();
        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));


        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {
        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);
    }
}