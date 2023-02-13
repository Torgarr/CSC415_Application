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

        fun createCharacters(): MutableList<Character> {
            val characters = mutableListOf<Character>()

            characters.add(
                Character(
                    "Anakin Skywalker",
                    "41 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/6/6f/Anakin_Skywalker_RotS.png/revision/latest?cb=20130621175844",
                    "Tatooine",
                    1,
                    "Jedi Order"
                )
            )
            characters.add(
                Character(
                    "Obi-Wan Kenobi",
                    "57 BBY",
                    "https://i.guim.co.uk/img/media/8a36c17d2c101a4b6bf2c2ead340c3c703784be0/0_1425_2216_1330/master/2216.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=700a7d9249967bd22a0c3ebc753e4233",
                    "Stewjon",
                    2,
                    "Jedi Order"
                )
            )


            characters.add(
                Character(
                    "Boba Fett",
                    "32 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/5/5e/BobaFettMain2.png/revision/latest?cb=20221003235522",
                    "Kamino",
                    3,
                    "Bounty Hunters' Guild"
                )
            )

            characters.add(
                Character(
                    "Darth Vader",
                    "41 BBY",
                    "https://i0.wp.com/www.meganerd.it/wp-content/uploads/2020/06/5adcb1d12bc004a1e15b54ac57f552df.jpg?resize=840%2C1259&ssl=1",
                    "Tatooine",
                    4,
                    "Sith"
                )
            )

            characters.add(
                Character(
                    "Yoda",
                    "896 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/d/d6/Yoda_SWSB.png/revision/latest?cb=20150206140125",
                    "Unknown",
                    5,
                    "Jedi Order"
                )
            )

            characters.add(
                Character(
                    "Jabba 'the Hutt' Desilijic Tiure",
                    "600 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/1/1f/JabbatheHutt-ToppsFinest2019.png/revision/latest?cb=20221001194607",
                    "Tatooine",
                    6,
                    "Hutt Clan"
                )
            )

            characters.add(
                Character(
                    "Din Djarin",
                    "Prior to 19 BBY",
                    "https://static.wikia.nocookie.net/star-wars-legends/images/d/d8/DjinDjarinS2-EW.png/revision/latest?cb=20210728150024",
                    "Aq Vetina",
                    7,
                    "Mandalorians"
                )
            )

            characters.add(
                Character(
                    "Leia Skywalker Organa Solo",
                    "19 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/8/89/Leia_endorpromo02.jpg/revision/latest?cb=20080506155343",
                    "Polis Massa",
                    8,
                    "New Republic"
                )
            )

            characters.add(
                Character(
                    "Chewbacca",
                    "200 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/4/48/Chewbacca_TLJ.png/revision/latest?cb=20221108044917",
                    "Kashyyyk",
                    9,
                    "New Republic"
                )
            )

            characters.add(
                Character(

                    "Luke Skywalker",
                    "19 BBY",
                    "https://images.saymedia-content.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:eco%2Cw_1200/MTc0NDU4NTkwMzE5MzU1MjQw/why-luke-skywalker-is-an-amazing-duelist.jpg",
                    "Polis Massa",
                    10,
                    "New Jedi Order"
                )
            )

            characters.add(
                Character(
                    "Sheev Palpatine",
                    "82 BBY",
                    "https://miro.medium.com/focal/1200/900/49/24/1*Y5rO0iWHQFd8gUd_WuFpqg.jpeg",
                    "Naboo",
                    11,
                    "Sith"
                )
            )

            characters.add(
                Character(
                    "Ahsoka Tano",
                    "36 BBY",
                    "https://lumiere-a.akamaihd.net/v1/images/5cb3c849d5de240001a05880-image_c6729179.jpeg?region=0,0,1536,864",
                    "Shili",
                    12,
                    "Jedi Order"
                )
            )

            characters.add(
                Character(
                    "Padme Amidala",
                    "46 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/b/b2/Padmegreenscrshot.jpg/revision/latest?cb=20100423143631",
                    "Naboo",
                    13,
                    "Galactic Republic"
                )
            )

            characters.add(
                Character(
                    "Maul",
                    "54 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/5/50/Darth_Maul_profile.png/revision/latest?cb=20140209162228",
                    "Dathomir",
                    14,
                    "Sith"
                )
            )

            characters.add(
                Character(
                    "Han Solo",
                    "29 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/0/01/Hansoloprofile.jpg/revision/latest?cb=20100129155042",
                    "Corellia",
                    15,
                    "New Republic"
                )
            )

            characters.add(
                Character(
                    "Jango Fett",
                    "66 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/0/03/Jango_OS_TPB.png/revision/latest?cb=20181120053551",
                    "Concord Dawn",
                    16,
                    "Mandalorians"
                )
            )

            characters.add(
                Character(
                    "Mon Mothma",
                    "48 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/4/46/Monmothma.jpg/revision/latest?cb=20070615234013",
                    "Chandrila",
                    17,
                    "New Republic"
                )
            )

            characters.add(
                Character(
                    "Dooku",
                    "102 BBY",
                    "https://static.wikia.nocookie.net/villains/images/f/f5/Count-dooku.jpg/revision/latest?cb=20200111233859",
                    "Serenno",
                    18,
                    "Sith"
                )
            )

            characters.add(
                Character(
                    "Grievous",
                    "Unknown",
                    "https://upload.wikimedia.org/wikipedia/en/5/54/General_Grievous.png",
                    "Kalee",
                    19,
                    "Confederacy of Independent Systems"
                )
            )

            characters.add(
                Character(
                    "Revan",
                    "3994 BBY",
                    "https://images.squarespace-cdn.com/content/v1/5fbc4a62c2150e62cfcb09aa/08754151-5516-41e7-95e1-54f9644f2bd9/darth-revan-star-wars-closeup.jpg",
                    "Unknown",
                    20,
                    "Jedi Order, Sith"
                )
            )

            characters.add(
                Character(
                    "Mace Windu",
                    "72 BBY",
                    "https://upload.wikimedia.org/wikipedia/en/b/bf/Mace_Windu.png",
                    "Haruun Kal",
                    21,
                    "Jedi Order"
                )
            )

            characters.add(
                Character(
                    "Qui-Gon Jinn",
                    "92 BBY",
                    "https://static.wikia.nocookie.net/swfanon/images/d/d6/QuiGonPortrait-SWE.jpg/revision/latest?cb=20130205204403",
                    "Unknown",
                    22,
                    "Jedi Order"
                )
            )

            characters.add(
                Character(
                    "Lando Calrissian",
                    "31 BBY",
                    "https://static.wikia.nocookie.net/star-wars-canon-extended/images/0/0a/Lando5.jpg/revision/latest?cb=20170807090725",
                    "Socorro",
                    23,
                    "New Republic"
                )
            )

            characters.add(
                Character(
                    "Bo-Katan Kryze",
                    "Unknown",
                    "https://static.wikia.nocookie.net/starwars/images/3/35/BoKatanKryze-AG.png/revision/latest?cb=20220212062546",
                    "Mandalore",
                    24,
                    "Mandalore Resistance, Death Watch"
                )
            )

            characters.add(
                Character(
                    "Wilhuff Tarkin",
                    "64-59 BBY",
                    "https://static.wikia.nocookie.net/starwars/images/c/c1/Tarkininfobox.jpg/revision/latest?cb=20100620213033",
                    "Eriadu",
                    25,
                    "Galactic Empire"
                )
            )

            return characters

        }




        val adapter = CharacterAdapter(createCharacters())
        recyclerView.adapter = adapter

        return view
    }


}