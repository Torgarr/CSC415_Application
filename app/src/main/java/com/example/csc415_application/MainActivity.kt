package com.example.csc415_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.csc415_application.ui.StarWarsListFragment
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit(){
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, StarWarsListFragment())
            addToBackStack(null)
        }

    }
/*
        v
    */
}