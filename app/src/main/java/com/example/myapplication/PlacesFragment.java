package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable ;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.ArrayList;



public class PlacesFragment extends Fragment {
    private final String[] PYD = new String[10] ;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_places, container, false);
        super.onCreate(savedInstanceState);

        PYD[0] = "The Pyramids of Giza are Cairo's number one half-day trip and a must-do attraction on everyone's itinerary. Right on the edge of the city, on the Giza Plateau, these fourth dynasty funerary temples have been wowing travelers for centuries and continue to be one of the country's major highlights. Despite the heat, the dust, and the tourist hustle, you can't miss a trip here.\n" +
                "\n" +
                "The Pyramid of Cheops (also called the Great Pyramid or Pyramid of Khufu) is the largest pyramid of the Giza group, and its interior of narrow passages can be explored, although there isn't much to see, except a plain tomb chamber with an empty sarcophagus.\n" +
                "\n" +
                "Directly behind the Great Pyramid is the Solar Boat Museum, which displays one of the ceremonial solar barques unearthed in the area that has been painstakingly restored to its original glory.\n" +
                "\n" +
                "Farther south on the plateau is the Pyramid of Chephren (also known as the Pyramid of Khefre), with an internal tunnel area, which can be entered, and the smaller Pyramid of Mycerinus (Pyramid of Menkaure). Guarding these mortuary temples is the lion-bodied and pharaoh-faced Sphinx; one of the ancient world's iconic monuments.\n" +
                "\n" +
                "The Giza Plateau is set to welcome another attraction when the Grand Egyptian Museum (GEM) is finally finished. When opened, it will be the biggest museum in the world devoted to exhibiting the antiquities of a single civilization, displaying a wealth of Ancient Egypt's artifacts that have never been seen by the public before. After a stop-start construction, beset with financial difficulties, the museum opening date has been set for 2020.\n" +
                "\n" +
                "The pyramid plateau is on the edge of Giza's suburban sprawl, roughly 13 kilometers southwest of the central city. Most people arrive by taxi, but it's also accessible by an easier-than-you-think combo of taking the metro to Giza and then hopping on a local minibus that drops you outside the entrance. As the pyramids' area is quite sprawling though, many travelers elect to see the area by tour. One of the most popular things to do at the pyramids is a camel ride. A good option for first-time visitors is the Private Half-Day Trip to the Giza Pyramids with Camel-Riding. This includes pickup and drop-off at your hotel, a guide, lunch, and 25 minutes on a camel.";

         PYD[1] = "This small church-filled cluster of twisty laneways lies within the walls of Old Babylon where the Roman Emperor Trajan first built a fortress along the Nile. Parts of the Roman towers still preside over the main street.\n" +
                "\n" +
                "The Coptic Museum here contains a wealth of information on Egypt's early Christian period and is home to one of Egypt's finest collections of Coptic art. Next door, the 9th-century Hanging Church contains some beautiful examples of Coptic architecture. Founded in the 4th century, the church was originally built over the Roman gate towers (hence the name) and was substantially rebuilt during the 9th century.\n" +
                "\n" +
                "For many Christian travelers though, the real highlight of a visit to this district is the Church of St. Sergius and Bacchus, where local legend says the Virgin Mary, baby Jesus, and family sheltered during King Herod's massacre of male babies. Farther into the quarter, you come to the Ben Ezra Synagogue, which is said to be built near the spot where the baby Moses was found in the reeds. Just outside the quarter, you can also visit the Mosque of Amr Ibn al-As; the first mosque built in Egypt.\n" +
                "\n" +
                "Coptic Cairo is easiest reached by taking the Cairo Metro to Mar Girgis station.\n" +
                "\n" +
                "Location: Sharia Mar Girgis, south of Downtown";

         PYD[2]= "Khan el-Khalili is one of the world's great shopping experiences. This Middle Eastern souq (bazaar) is a labyrinthine collection of skinny alleyways established as a shopping district in AD 1400, which still rings with the clang of metal workers and silversmiths.\n" +
                "\n" +
                "The main streets have long ago given themselves over completely to the tourist trade (with plenty of cheap papyrus pictures and plastic pyramids on display), but divert off the main drag into the surrounding alleyways, and the tiny stores and cluttered workshops are some of the best places to pick up traditional products in Egypt. Here, you'll find everything from antiques and gorgeous metal lampshades to locally woven textiles.\n" +
                "\n" +
                "While here stop in at Cairo's most famous coffee shop, Fishawis, where syrupy Arabic coffee and sweet tea are dished out to tourists and local merchants alike at a rapid-fire pace.\n" +
                "\n" +
                "For shoppers, the main souq road is Al-Muski Street (called Gawhar al-Qaid Street at its eastern end). The gold and silver workshops mostly congregate just north of this street's intersection with Al-Muizz Li-Din Allah Street, while the spice market section is just to the south. The market is hemmed in on its eastern side by the Neo-Gothic bulk of the Sayyidna el-Husein Mosque, built in 1792 to honor the Prophet Muhammad's grandson.\n" +
                "\n" +
                "The entry to the Khan el-Khalili area is across the road from Al-Azhar Mosque.\n" +
                "\n" +
                "Location: Off Al-Azhar Street, Islamic Cairo District";

         PYD[3] = "Al-Azhar Mosque is the finest building of Cairo's Fatimid era and one of the city's earliest surviving mosques, completed in AD 972. It's also one of the world's oldest universities — Caliph El-Aziz bestowed it with the status of university in AD 988 (the other university vying for \"oldest\" status is in Fes) and today, Al-Azhar University is still the leading theological center of the Islamic world.\n" +
                "\n" +
                "The main entrance is the Gate of the Barbers on the northwest side of the building, adjoining the neo-Arab facade built by Abbas II. Leave your shoes at the entrance and walk into the central courtyard. To your right is the El-Taibarsiya Medrese, which has a mihrab (prayer niche) dating from 1309. From the central courtyard, you get the best views of the mosque's five minarets, which cap the building. Across the courtyard is the main prayer hall, spanning a vast 3,000 square meters. The front half is part of the original building, while the rear half was added by Abd el-Rahman.\n" +
                "\n" +
                "Al-Azhar Mosque is right in the heart of the Islamic Cairo district and easy to reach by taxi. Al-Azhar Street runs east from Midan Ataba in the downtown area right to the square where the mosque sits.\n" +
                "\n" +
                "Address: Al-Azhar Street, Islamic Cairo District";

        PYD[4] = "In a commanding location at the foot of the Mokattam Hills, Cairo's citadel was built by Saladin in 1176. The original structure he laid out has long disappeared except for the eastern outer walls, but a legacy of rulers has made their own additions here.\n" +
                "\n" +
                "The Mosque of Muhammad Ali is the most famous monument and the main reason for visiting. Nicknamed the \"Alabaster Mosque,\" its white stone and tall, disproportionately slender minarets are one of Cairo's great landmarks. The other big reason to come up here are the views across the city; head to the Gawhara Terrace for the best panorama in town.\n" +
                "\n" +
                "Just to the northeast of the Muhammad Ali Mosque is the El-Nasir Mosque, built in 1318-35 by Mohammed el-Nasir. A collection of rather half-hearted museums (the Police Museum, National Military Museum, and Carriage Museum) take up some of the other buildings on site and are more worthwhile viewing for the architecture of the actual buildings rather than the exhibits themselves.\n" +
                "\n" +
                "You can walk to the citadel area from Bab Zuweila, if you're feeling energetic, by heading along Khayyamiyya Street. The walk takes about 30 minutes.\n" +
                "\n" +
                "Location: Off Midan Salah-ad-Din, Islamic Cairo District";

        PYD[5] ="One of the finest examples of Mamluk architecture in the world, Sultan Hassan Mosque is a vision of Arabic artistry with an abundance of stalactite detailing and intricate arabesque features. It was built in 1356-63 for the Sultan Hassan el-Nasir.\n" +
                "\n" +
                "The exterior, with its large areas of stone, is reminiscent of an ancient Egyptian temple. The massive main doorway at the north corner is almost 26 meters high, and the minaret at the south corner is the tallest in Cairo at 81.5 meters.\n" +
                "\n" +
                "The main doorway leads into a domed vestibule, beyond which are a small antechamber and a corridor leading into the ornate open Court centered around an ablution fountain. From here, an iron door leads into the sultan's mausoleum where the stalactitic pendentives of the original dome still survive. In the center of the chamber is the sultan's simple sarcophagus.\n" +
                "\n" +
                "Directly facing the Sultan Hassan Mosque is the El-Rifai Mosque, built in 1912 to house the tomb of Khedive Ismail and constructed to replicate its older next door neighbor. The ex Shah of Iran, Mohammed Reza Pahlavi (1919-1980), is also buried here.\n" +
                "\n" +
                "Both mosques prominently sit on Midan Salah ad-Din, directly below Cairo's Citadel.\n" +
                "\n" +
                "Location: Midan Salah-ad-Din, Islamic Cairo District";

        PYD[6] ="Of all the Islamic Cairo district's gates, Bab Zuweila is the most interesting. You can climb to the top of this medieval era relic (built in the 11th century) for some amazing rooftop views over Islamic Cairo. The gate itself has two minarets and is the last southern gate of the old town still standing. Right next door is the red-and-white stonework of the Sheikh al-Mu'ayyad Mosque, and a few steps farther away are the fascinating artisan stalls of the Street of the Tentmakers, where Egypt's bright fabric used for weddings and other special occasions is sold in bulk.\n" +
                "\n" +
                "Address: Al-Muiz li-Din Allah Street, Islamic Cairo District";

        PYD[7] ="The northern section of Al-Muizz li-Din Allah Street is rimmed by fine Mamluk buildings, which have been painstakingly restored to their former glory. The Madrassa of as-Salih Ayyub, built in 1247, is a showcase of the tranquil simplicity of Islamic architecture.\n" +
                "\n" +
                "Directly across the road from the madrassa is the drop-dead gorgeous Madrassa of Qalaun, rightly considered one of the Mamluk period's greatest architectural triumphs. It was completed in 1293 by Qalaun's son, Muhammad al-Nasir, and has an interior packed to the brim with intricate tile work, fine marble, mother-of-pearl mosaics, and stained-glass windows. Qalaun's madrassa also functioned as a hospital when it first opened.\n" +
                "\n" +
                "A little farther north is the younger (built in 1309) Madrassa of an-Nasr Mohammed with plenty of ornate detailing to admire, before you come to the fabulous Egyptian Textile Museum with a collection that spans the Pharaonic era right up to the Islamic period.\n" +
                "\n" +
                "Address: Al-Muizz li-Din Allah Street, Islamic Cairo District";

         PYD[8] = "The second oldest mosque still standing in Cairo, Ibn Tulun Mosque, was built between AD 876 and 879 and modeled on the Kaaba in Mecca (Saudi Arabia). At the time it was built, it was the largest mosque in existence.\n" +
                "\n" +
                "The Main Court's colonnades have plentiful surviving fragments of intricate frieze work on display and open onto a series of narrow-fronted halls. The main prayer hall (on the southern side of the court) still holds onto fragments of its older decoration of carved stucco and wood, and the mihrab here has remnants of its original gold mosaic decoration.\n" +
                "\n" +
                "On the mosque's northern side is the 40-meter-high minaret with a fine horseshoe arch over the entrance and a spiral staircase swirling through the interior. It is modeled on the minarets of the Great Mosque of Samarra on the Tigris. If you climb the 173 steps up to its upper platform there are superb views extending over the sea of houses to the north, and to the Mokattam Hills in the east.\n" +
                "\n" +
                "It's an easy stroll from the Sultan Hassan Mosque to the Ibn Tulun Mosque walking straight down Al-Saliba Street.\n" +
                "\n" +
                "Address: Al-Saliba Street\n" ;

        PYD[9] = "Caliph Al-Hakim is one of the most fascinating rulers of Egypt. This Fatimid leader was renowned for his terrifying rule over the land, which included frequent murders of his royal household staff; nightly patrols of the streets of his city, dressed incognito on a donkey to make sure his subjects were behaving themselves; and issuing bizarre rulings across the country (such as banning the eating of the Egyptian mallow-leaf, called molokheya, because only he wanted to be able to consume it).\n" +
                "\n" +
                "His mosque, finished in AD 1013, has functioned over the centuries as a madrassa, Crusader fortress, and mental hospital and was completely restored in the 1980s. The minarets here are the most interesting architectural elements. They were originally round, and their present square casing and domed top sections (resembling an Arab incense burner) date from their rebuilding after Cairo's 1303 earthquake.\n" +
                "\n" +
                "The mosque sits in between two of the old city district's most important gates. Bab el-Futuh (Gate of Conquests) on the mosque's western side and Bab el-Nasr (Gate of Victory) to the east are similar in form to ancient Roman town gates and were both built in 1087.\n" +
                "\n" +
                "You can walk between Al-Azhar Mosque and the Mosque of Al-Hakim by following Al-Mu'izz li-Din Allah Street all the way north.\n" +
                "\n" +
                "Address: Al-Galal Street, Islamic Cairo District";

        final ArrayList<AllPlaces> places = new ArrayList<AllPlaces>();


        places.add(new AllPlaces("The Pyramids",R.drawable.pyramid,"The Pyramids of Giza are Cairo's number one half-day trip and a must-do attraction on everyone's itinerary...",PYD[0]));
        places.add(new AllPlaces("Old Cairo",R.drawable.oldcairo, "This small church-filled cluster of twisty laneways lies within the walls of Old Babylon where the Roman Emperor Trajan first built a fortress along the Nile. Parts of the Roman towers still preside over the main street..." , PYD[1]));
        places.add(new AllPlaces("Khan el-Khalili",R.drawable.peoplewalking,"Khan el-Khalili is one of the world's great shopping experiences. This Middle Eastern souq (bazaar) is a labyrinthine collection of skinny alleyways established as a shopping district in AD 1400..." ,PYD[2]));
        places.add(new AllPlaces("Al-Azhar Mosque",R.drawable.azhar000,"Al-Azhar Mosque is the finest building of Cairo's Fatimid era and one of the city's earliest surviving mosques, completed in AD 972...",PYD[3]));
        places.add(new AllPlaces("The Citadel",R.drawable.citadel,"In a commanding location at the foot of the Mokattam Hills, Cairo's citadel was built by Saladin in 1176. The original structure he laid out has long disappeared except for the eastern outer walls...", PYD[4]));
        places.add(new AllPlaces("Sultan Hassan Mosque",R.drawable.sultanhassan,"One of the finest examples of Mamluk architecture in the world, Sultan Hassan Mosque is a vision of Arabic artistry with an abundance of stalactite detailing and intricate arabesque features..." , PYD[5]));
        places.add(new AllPlaces("Bab Zuweila",R.drawable.babzuweila,"Of all the Islamic Cairo district's gates, Bab Zuweila is the most interesting. You can climb to the top of this medieval era relic (built in the 11th century) for some amazing rooftop views over Islamic Cairo...", PYD[6]));
        places.add(new AllPlaces("Al-Muizz li-Din Allah Street ",R.drawable.almaez,"The northern section of Al-Muizz li-Din Allah Street is rimmed by fine Mamluk buildings, which have been painstakingly restored to their former glory ..." , PYD[7]));
        places.add(new AllPlaces("Ibn Tulun Mosque",R.drawable.bntulunmosque,"The second oldest mosque still standing in Cairo, Ibn Tulun Mosque, was built between AD 876 and 879 and modeled on the Kaaba in Mecca . At the time it was built....",PYD[8]));
        places.add(new AllPlaces("Mosque of Al-Hakim",R.drawable.mosqueofalhakim,"Caliph Al-Hakim is one of the most fascinating rulers of Egypt. This Fatimid leader was renowned for his terrifying rule over the land, which included frequent murders of his royal household staff...." ,PYD[9] ));
        PAdapter itemsAdapter = new PAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                AllPlaces currentAndroid = places.get(position);
                Fdes.Artist = false ;
                Fdes.name = currentAndroid.getmName() ;
                Fdes.full = currentAndroid.getFullDescreption() ;
                Fdes.photo = currentAndroid.getmImageResourceId() ;

                Intent I = new Intent(rootView.getContext() , Fdes.class) ;
                startActivity(I);
            }
        });





        return rootView;
    }

}