package com.example.csc415_application.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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

            view.findViewById<TextView>(R.id.character_name).text = name
            view.findViewById<TextView>(R.id.character_age).text = age
            //view.findViewById<ImageView>(R.id.character_image) = image



        }

        return view
    }


}