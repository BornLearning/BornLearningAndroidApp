package com.grp15.cmpe272.unitedwayapp.bornlearning.development

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.grp15.cmpe272.unitedwayapp.bornlearning.R
import android.content.Intent
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_main.*


/**
 * Created by amita on 11/9/2017.
 */
class FirstActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var tvView = findViewById(R.id.tvView) as TextView

        val intent = getIntent().extras
        //val extras = getExtra().getIntent()
        val ss:String = intent["fname"].toString()
        //val lName = intent.getStringExtra("lname")

        textView.setText("Your name is: $ss")
    }
}