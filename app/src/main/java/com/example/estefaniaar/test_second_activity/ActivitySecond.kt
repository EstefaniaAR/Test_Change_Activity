package com.example.estefaniaar.test_second_activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class ActivitySecond : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val received = intent.getStringExtra("input")
        name2.text = "Hello $received"
    }
    fun goBack(view: View)
    {
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
}
