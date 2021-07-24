package com.example.findageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*buFindAge.setOnClickListener {
           //fire when button is clicked


       }

        */
    }

    fun buFindAgeEvent(view: View) {
        val yearOfBirth:Int = txtYearOFBirth.text.toString().toInt()
         if (yearOfBirth.toInt()==0) {
             tvShowAge.text = "Invalid Input"
             return
         }
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = currentYear - yearOfBirth
        val avg = myAge/yearOfBirth.toInt()
        tvShowAge.text = "Your Age is $myAge years"
        
    }
}