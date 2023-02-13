package com.example.csc415_application.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.csc415_application.CharacterAdapter
import com.example.csc415_application.Character
import com.example.csc415_application.R


class StarWarsListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_star_wars_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val characters = mutableListOf<Character>()


        val anakin = Character(
            name = "Anakin Skywalker",
            age = "41 BBY",
            image = "https://static.wikia.nocookie.net/starwars/images/6/6f/Anakin_Skywalker_RotS.png/revision/latest?cb=20130621175844",
            planet = "Tatooine",
            id = 1,
            affiliation = "Jedi Order"
        )

        val obiwan = Character(
            name = "Obi-Wan Kenobi",
            age = "57 BBY",
            image = R.drawable.obiwan,
            planet = "Stewjon",
            id = 2,
            affiliation = "Jedi Order"
        )

        val boba = Character(
            name = "Boba Fett",
            age = "32 BBY",
            image = R.drawable.bobafett,
            planet = "Kamino",
            id = 3,
            affiliation = "Bounty Hunters' Guild"
        )

        val vader = Character(
            name = "Darth Vader",
            age = "41 BBY",
            image = R.drawable.vader,
            planet = "Tatooine",
            id = 4,
            affiliation = "Sith"
        )

        val yoda = Character(
            name = "Yoda",
            age = "896 BBY",
            image = R.drawable.yoda,
            planet = "Unknown",
            id = 5,
            affiliation = "Jedi Order"
        )

        val jabba = Character(
            name = "Jabba 'the Hutt' Desilijic Tiure",
            age = "600 BBY",
            image = R.drawable.jabba,
            planet = "Tatooine",
            id = 6,
            affiliation = "Hutt Clan"
        )

        val din = Character(
            name = "Din Djarin",
            age = "Prior to 19 BBY",
            image = R.drawable.dindjarin,
            planet = "Aq Vetina",
            id = 7,
            affiliation = "Mandalorians"
        )

        val leia = Character(
            name = "Leia Skywalker Organa Solo",
            age = "19 BBY",
            image = R.drawable.leia,
            planet = "Polis Massa",
            id = 8,
            affiliation = "New Republic"
        )

        val chewbacca = Character(
            name = "Chewbacca",
            age = "200 BBY",
            image = R.drawable.chewbacca,
            planet = "Kashyyyk",
            id = 9,
            affiliation = "New Republic"
        )

        val luke = Character(
            name = "Luke Skywalker",
            age = "19 BBY",
            image = R.drawable.luke,
            planet = "Polis Massa",
            id = 10,
            affiliation = "New Jedi Order"
        )

        val palpatine = Character(
            name = "Sheev Palpatine",
            age = "82 BBY",
            image = R.drawable.sidious,
            planet = "Naboo",
            id = 11,
            affiliation = "Sith"
        )

        val ahsoka = Character(
            name = "Ahsoka Tano",
            age = "36 BBY",
            image = R.drawable.ahsoka,
            planet = "Shili",
            id = 12,
            affiliation = "Jedi Order"
        )

        val padme = Character(
            name = "Padme Amidala",
            age = "46 BBY",
            image = R.drawable.padme,
            planet = "Naboo",
            id = 13,
            affiliation = "Galactic Republic"
        )

        val maul = Character(
            name = "Maul",
            age = "54 BBY",
            image = R.drawable.maul,
            planet = "Dathomir",
            id = 14,
            affiliation = "Sith"
        )

        val han = Character(
            name = "Han Solo",
            age = "29 BBY",
            image = R.drawable.han,
            planet = "Corellia",
            id = 15,
            affiliation = "New Republic"
        )

        val jango = Character(
            name = "Jango Fett",
            age = "66 BBY",
            image = R.drawable.jango,
            planet = "Concord Dawn",
            id = 16,
            affiliation = "Mandalorians"
        )

        val mothma = Character(
            name = "Mon Mothma",
            age = "48 BBY",
            image = R.drawable.monmothma,
            planet = "Chandrila",
            id = 17,
            affiliation = "New Republic"
        )

        val dooku = Character(
            name = "Dooku",
            age = "102 BBY",
            image = R.drawable.dooku,
            planet = "Serenno",
            id = 18,
            affiliation = "Sith"
        )

        val grievous = Character(
            name = "Grievous",
            age = "Unknown",
            image = R.drawable.grievous,
            planet = "Kalee",
            id = 19,
            affiliation = "Confederacy of Independent Systems"
        )

        val revan = Character(
            name = "Revan",
            age = "3994 BBY",
            image = R.drawable.revan,
            planet = "Unknown",
            id = 20,
            affiliation = "Jedi Order, Sith"
        )

        val mace = Character(
            name = "Mace Windu",
            age = "72 BBY",
            image = R.drawable.mace,
            planet = "Haruun Kal",
            id = 21,
            affiliation = "Jedi Order"
        )

        val quigon = Character(
            name = "Qui-Gon Jinn",
            age = "92 BBY",
            image = R.drawable.quigon,
            planet = "Unknown",
            id = 22,
            affiliation = "Jedi Order"
        )

        val lando = Character(
            name = "Lando Calrissian",
            age = "31 BBY",
            image = R.drawable.lando,
            planet = "Socorro",
            id = 23,
            affiliation = "New Republic"
        )

        val bokatan = Character(
            name = "Bo-Katan Kryze",
            age = "Unknown",
            image = R.drawable.bokatan,
            planet = "Mandalore",
            id = 24,
            affiliation = "Mandalore Resistance, Death Watch"
        )

        val tarkin = Character(
            name = "Wilhuff Tarkin",
            age = "64-59 BBY",
            image = R.drawable.tarkin,
            planet = "Eriadu",
            id = 25,
            affiliation = "Galactic Empire"
        )

        characters.add(anakin)
        characters.add(obiwan)
        characters.add(boba)
        characters.add(vader)
        characters.add(yoda)
        characters.add(jabba)
        characters.add(din)
        characters.add(leia)
        characters.add(chewbacca)
        characters.add(luke)
        characters.add(palpatine)
        characters.add(ahsoka)
        characters.add(padme)
        characters.add(maul)
        characters.add(han)
        characters.add(jango)
        characters.add(mothma)
        characters.add(dooku)
        characters.add(grievous)
        characters.add(revan)
        characters.add(mace)
        characters.add(quigon)
        characters.add(lando)
        characters.add(bokatan)
        characters.add(tarkin)

        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter

        return view
    }


}