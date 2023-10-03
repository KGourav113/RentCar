package com.example.rentcar.Nav_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentcar.MainActivity;
import com.example.rentcar.R;
import com.example.rentcar.Recycler_car_type_adapter;
import com.example.rentcar.car_type_model;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Nav_Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Nav_Home extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Nav_Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Nav_Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Nav_Home newInstance(String param1, String param2) {
        Nav_Home fragment = new Nav_Home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_nav__home, container, false);





        ArrayList<car_type_model> carTypeModels = new ArrayList<>();


        // Create and set up your RecyclerView adapter
        RecyclerView recyclerView = rootView.findViewById(R.id.home_recycler_view);




        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv2"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Sedan"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv2"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv3"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv5"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv6"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv7"));
        carTypeModels.add(new car_type_model(R.drawable.baseline_person_24,"Suv8"));




        Recycler_car_type_adapter adapter = new Recycler_car_type_adapter(carTypeModels);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }




}