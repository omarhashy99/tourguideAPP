package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Districts extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_districts, container, false);
        super.onCreate(savedInstanceState);

        final ArrayList<AllPlaces> places = new ArrayList<AllPlaces>();
        // places.add(new AllPlaces("El Qobbah","Sultan Hassan Mosque"));

        places.add(new AllPlaces("Islamic_Cairo",R.drawable.islamiccairo67,"After the Muslims conquered Egypt in 641 AD, they built their city, Al-Fustat, on what is now the southern border of modern Cairo."));
        places.add(new AllPlaces("Zamalek",R.drawable.zamalek,"This island is located in the Nile River between downtown Cairo and Giza, and is characterized by upscale hotels, restaurants and pleasant gardens."));
        places.add(new AllPlaces("Heliopolis",R.drawable.heliopolis,"This neighborhood is over a century old. It had beautiful architecture, a mix of old Islamic and rustic French."));
        places.add(new AllPlaces("Downtown Cairo",R.drawable.cairodw,"Downtown Cairo has been the urban center of Cairo, Egypt since the late 19th century, when the district was designed and built."));

        places.add(new AllPlaces("Abbassia","In 1865 an observatory, principally for meteorological work, was founded at Abbassia, by the Khedive Isma'il Pasha ."));
        places.add(new AllPlaces("Ain Shams","The name means Eye of the Sun in Arabic, referring to the fact that Ain Shams is built on top of the ancient city of Heliopolis, once the spiritual centre of ancient Egyptian sun-worship."));
        places.add(new AllPlaces("Azbakeya","Uzbakeya is one of the central districts of Cairo, Egypt. It contains many historically important establishments."));
        places.add(new AllPlaces("Bab al-Louq","Bab al-Louq is a neighborhood in downtown Cairo."));
        places.add(new AllPlaces("Boulaq","Coptic Cairo is a part of Old Cairo which encompasses the Babylon Fortress, the Coptic Museum, the Hanging Church, the Greek Church of St. George and many other Coptic churches and historical sites."));
        places.add(new AllPlaces("El Zaher","El Zaher is named after al-Malik al-Zahir Baibars, who was the king of Egypt and Syria."));
        places.add(new AllPlaces("El Manial","El Manial is a district of Cairo, located on Rhoda Island in the Nile."));
        places.add(new AllPlaces("El Marg ","El Marg is an administrative ward  of Cairo, in the north-east of Cairo, bordering Qalyubia CITY near Shubra El Kheima."));
        places.add(new AllPlaces("El Qobbah","It is famous for having two major palaces that were once the residences of the King Farouk. Along with the Tahra Palace, the Koubbeh Palace is said to be the largest palace in Egypt. They are both still used as official residences for high-level delegations."));
        PAdapter itemsAdapter = new PAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}