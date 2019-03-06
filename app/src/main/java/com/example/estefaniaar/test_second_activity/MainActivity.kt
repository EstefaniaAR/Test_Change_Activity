package com.example.estefaniaar.test_second_activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeActivity(view: View)
    {
        val intent = Intent(applicationContext,ActivitySecond::class.java)
        intent.putExtra("input",name.text.toString())
        startActivity(intent)
    }
}
