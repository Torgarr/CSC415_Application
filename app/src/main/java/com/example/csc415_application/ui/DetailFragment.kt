package com.example.csc415_application.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.csc415_application.R


class DetailFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        if (arguments != null){
            val name = requireArguments().getString("name")
            val age = requireArguments().getString("age")
            val image = requireArguments().getString("image")
            val planet = requireArguments().getString("planet")
            val affiliation = requireArguments().getString("affiliation")
            val desc = requireArguments().getString("desc")

            view.findViewById<TextView>(R.id.character_name).text = "Name: " + name
            view.findViewById<TextView>(R.id.character_age).text = "Born: " + age
            view.findViewById<TextView>(R.id.character_planet).text = "Birth Planet: " + planet
            view.findViewById<TextView>(R.id.character_affiliation).text = "Affiliation: " + affiliation
            view.findViewById<TextView>(R.id.character_desc).text = desc

            Glide
                .with(this)
                .load(image)
                .into(view.findViewById(R.id.character_image))
            //Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);


        }

        return view
    }


}