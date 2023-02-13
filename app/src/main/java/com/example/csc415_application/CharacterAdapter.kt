package com.example.csc415_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.csc415_application.ui.DetailFragment

class CharacterAdapter(private val characters: List<Character>) :
    RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card_view, parent, false)
        return CharacterViewHolder(view){position ->
            val character = characters[position]

            val bundle = bundleOf(
                "name" to character.name,
                "age" to character.age,
                "image" to character.image,
                "planet" to character.planet,
                "id" to character.id,
                "affiliation" to character.affiliation
            )
            val detailFragment = DetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount() = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        //holder.chatacterImage.setImageResource(character.image)
        //Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);
        Glide.with(holder.itemView.context).load(character.image).into(holder.chatacterImage)
        holder.characterName.text = character.name
        holder.characterAge.text = character.age.toString()
        holder.characterPlanet.text = character.planet
        holder.characterAffiliation.text = character.affiliation
    }

    inner class CharacterViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        val chatacterImage: ImageView = itemView.findViewById(R.id.character_image)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterAge: TextView = itemView.findViewById(R.id.character_age)
        val characterPlanet: TextView = itemView.findViewById(R.id.character_planet)
        val characterAffiliation: TextView = itemView.findViewById(R.id.character_affiliation)

        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }


}