package com.example.csc415_application.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.csc415_application.R


class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        if (arguments != null){
            val name = requireArguments().getString("name")
            val age = requireArguments().getString("age")
            val image = requireArguments().getString("image")
            val planet = requireArguments().getString("planet")
            val id = requireArguments().getString("id")
            val affiliation = requireArguments().getString("affiliation")

            view.findViewById<TextView>(R.id.character_id)


        }

        return view
    }


}