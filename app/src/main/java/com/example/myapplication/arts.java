package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class arts extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_arts, container, false);
        super.onCreate(savedInstanceState);

        final ArrayList<AllPlaces> places = new ArrayList<AllPlaces>();


        places.add(new AllPlaces("Umme Kulthum",R.drawable.ummkulthum4,"Umm Kulthum was known for her vocal ability and unique style. She sold over 80 million records worldwide, making her one of the best-selling Middle Eastern. ",R.raw.amklthom));
        places.add(new AllPlaces("Abdel Halim Hafez",R.drawable.ahafez,"was an Egyptian singer, actor, conductor, businessman, music teacher and movie producer.",R.raw.amklthom));
        places.add(new AllPlaces("Warda",R.drawable.warda,"She was an Algerian singer who was well known for her Egyptian Arabic songs and music. Her name literally meant Warda the Algerian, but she was sometimes referred to as just Warda .",R.raw.warda));
        places.add(new AllPlaces("Amr Diab",R.drawable.amrd,"Amr Diab is an Egyptian singer, composer and actor. He has established himself as an acclaimed recording artist.",R.raw.diab));


        PAdapter itemsAdapter = new PAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                AllPlaces currentAndroid = places.get(position); ;
                Intent I = new Intent(rootView.getContext() , Fdes.class) ;
                Fdes.name = currentAndroid.getmName() ;
                Fdes.full = currentAndroid.getmDescreption() ;
                Fdes.photo = currentAndroid.getmImageResourceId() ;
                Fdes.Artist = true ;
                Fdes.VR= currentAndroid.getRRAW() ;
                startActivity(I);
            }
        });

        return rootView;
    }
}