package com.example.capstone1

import android.app.ActionBar
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var MyAppointment: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val supportToolAc = supportActionBar
        supportToolAc?.title = "Appointment"

        MyAppointment = findViewById(R.id.MyAppointment)
        MyAppointment.setOnClickListener {
            startActivity(Intent(this@MainActivity,AppointmentActivity::class.java))
        }

        val myAppointmentAct = findViewById<CardView>(R.id.MyAppointment)
        myAppointmentAct.setOnClickListener {
            val intent = Intent(this, AppointmentActivity::class.java)
            startActivity(intent)
        }

        val healthTracker = findViewById<CardView>(R.id.healthTracker)
        healthTracker.setOnClickListener {
            val intent = Intent(this, HealthTrackerActivity::class.java)
            startActivity(intent)
        }

        val forumAct = findViewById<CardView>(R.id.chat)
        forumAct.setOnClickListener {
            val intent = Intent(this, ForumActivity::class.java)
            startActivity(intent)
        }

        val settingsAct = findViewById<CardView>(R.id.settings)
        settingsAct.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}