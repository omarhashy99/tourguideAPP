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
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Museums extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_museums, container, false);
        super.onCreate(savedInstanceState);
        final ArrayList<AllPlaces> places = new ArrayList<AllPlaces>();
        // places.add(new AllPlaces("The Coptic Museum",R.drawable.,"Sultan Hassan Mosque"));




        places.add(new AllPlaces("The Egyptian Museum",R.drawable.egyptianmuseum,"The absolutely staggering collection of antiquities displayed in Cairo's Egyptian Museum makes it one of the world's great museums...","The absolutely staggering collection of antiquities displayed in Cairo's Egyptian Museum makes it one of the world's great museums. You would need a lifetime to see everything on show.\n" +
                "\n" +
                "The museum was founded in 1857 by French Egyptologist August Mariette and moved to its current home — in the distinctive powder-pink mansion in Downtown Cairo — in 1897. Yes, the collection is poorly labeled and not well set out due to limits of space (and only a fraction of its total holdings are actually on display). It also suffers currently with some empty cases due to artifacts having been transferred to the GEM, but you still can't help being impressed by the sheer majesty of the exhibits.\n" +
                "\n" +
                "If you're pressed for time, make a beeline straight for the Tutankhamun Galleries. The treasures displayed here were all found in the tomb of Tutankhamun, son-in-law and successor of Amenophis IV (later Akhenaten), who died at the age of 18. The tomb, discovered by Howard Carter in the Valley of the Kings in 1922, contained the largest and richest assemblage of grave goods ever found intact in an Egyptian tomb.\n" +
                "\n" +
                "Highlights include Tutankhamun's death mask and sarcophagi (Room 3), the pharaoh's lion throne (Room 35), and his fascinating wardrobe collection (Room 9). Afterwards, don't miss a wander through the Egyptian jewelry collection (Room 4), which contains more bling than you'll ever see again in one lifetime, and finish off by viewing the Royal Mummies Collection (Room 56 & 46), where you can say hello to Hatshepsut, Tuthmosis II, Ramses II, and Seti I in person.\n" +
                "\n" +
                "Even when the GEM opens, this iconic building will still be used as a museum. It has not been announced which collections will stay here and which will be moved — except for the Tutankhamun Galleries, which will all eventually be transferred to the GEM.\n" +
                "\n" +
                "The Egyptian Museum sits right beside Midan Tahrir, the central square of Downtown Cairo. The easiest way to arrive here is to take the Cairo Metro to Sadat station (on Midan Tahrir) and follow the exit signs to the museum.\n" +
                "\n" +
                "Location: Midan al-Tahrir, Downtown"));


        places.add(new AllPlaces("Abdeen Palace Museum",R.drawable.abdeenpalacemuseum,"Located in the Old Cairo district of Abdeen, the grand Abdeen Palace used to serve as the principal workplace of the president of Egypt...","Located in the Old Cairo district of Abdeen, the grand Abdeen Palace used to serve as the principal workplace of the president of Egypt. Today it is a museum, and is home to many sumptuous adornments and paintings. The lower floor contains the Silver Museum, Arms Museum, Royal Family Museum, Presidential Gifts Museum, and the Historical Documents Museum."));

        places.add(new AllPlaces("Manial Palace Museum",R.drawable.manialpalaceandmuseum,"Dating back to the Ottoman dynasty, the Manial Palace Museum is located in the El-Manial district of southern Cairo...","Dating back to the Ottoman dynasty, the Manial Palace Museum is located in the El-Manial district of southern Cairo. It is also known as Prince Mohammed Ali Tawfik Palace, as it was built by him. The beautiful palace is a mix of European and Ottoman, Persian and Moorish styles. The sumptuous furniture and interiors showcase the lifestyle of the Egyptian prince."));

        places.add(new AllPlaces("Museum of Islamic Art",R.drawable.museislam001,"Located in central Cairo, the Museum of Islamic Art is one of the largest museums in the world specialising in Islamic art...","Located in central Cairo, the Museum of Islamic Art is one of the largest museums in the world specialising in Islamic art. The museum comprises around 100,000 artefacts from various periods of Islamic history. It also houses manuscripts from diverse Islamic sciences including medicine, engineering, astronomy and more. Jewellery, weapons, wood and ivory objects, textiles, and carpets showcasing fine Islamic workmanship are also part of the collection. In 2014, the museum was damaged by a car bomb, which destroyed many artefacts; it reopened in early 2017."));

        places.add(new AllPlaces("The Egyptian National Military Museum",R.drawable.egyptiannationalmilitarymuseum,"Located inside one of Cairo’s most visited attractions, the Cairo Citadel, the Egyptian National Military Museum...","Located inside one of Cairo’s most visited attractions, the Cairo Citadel, the Egyptian National Military Museum displays unique ancient artefacts that date from Pharanoic to modern times. As the building was once part of a palace, the museum has high ceilings with plasterwork decorations. On display are military artefacts, and sculptures of past kings, army officials and politicians. There are several wings, including an area dedicated to the Suez Canal. Visitors can also enjoy the beautiful landscapes of the Cairo Citadel and the panoramic views from the Mosque of Muhammed Ali, which is also inside the Citadel."));

        places.add(new AllPlaces("October War Panorama",R.drawable.octoberwarpanorama,"The October War Panorama Museum is dedicated in the memory of the 1973 October War, also known as the Arab-Israeli war...","The October War Panorama Museum is dedicated in the memory of the 1973 October War, also known as the Arab-Israeli war. The museum displays military vehicles, tanks, aircrafts and weapons used during the war. There are also two documentaries about the war shown; one of them is screened on a 360-degree rotating platform, and depicts Egyptian soldiers storming the Bar-Lev Line on the Suez Canal."));

        places.add(new AllPlaces("Gayer-Anderson Museum",R.drawable.gayerandersonmuseum,"The Gayer-Anderson Museum was one of the two Cairo homes of British officer and physician Gayer Anderson...","The Gayer-Anderson Museum was one of the two Cairo homes of British officer and physician Gayer Anderson, an Egyptian culture fanatic. It is located in the Sayyida Zeinab neighbourhood, facing the famous Mosque of Ibn Tulun. The museum displays furniture, carpets, textiles and other objects, exemplifying the beautiful domestic architecture of Cairo."));





        PAdapter itemsAdapter = new PAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                AllPlaces currentAndroid = places.get(position); ;
                Fdes.name = currentAndroid.getmName() ;
                Fdes.full = currentAndroid.getFullDescreption() ;
                Fdes.photo = currentAndroid.getmImageResourceId() ;
                Fdes.Artist = false ;

                Intent I = new Intent(rootView.getContext() , Fdes.class) ;
                startActivity(I);
            }
        });


        return rootView;
    }
}