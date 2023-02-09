package com.example.csc415_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterAdapter(private val characters: List<Character>) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card_view, parent, false)
        return CharacterViewHolder(view)
    }

    override fun getItemCount() = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.chatacterImage.setImageResource(character.image)
        holder.characterName.text = character.name
        holder.characterAge.text = character.age.toString()
        holder.characterPlanet.text = character.planet
        holder.characterAffiliation.text = character.affiliation
    }

    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val chatacterImage: ImageView = itemView.findViewById(R.id.character_image)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterAge: TextView = itemView.findViewById(R.id.character_age)
        val characterPlanet: TextView = itemView.findViewById(R.id.character_planet)
        val characterAffiliation: TextView = itemView.findViewById(R.id.character_affiliation)
    }


}