package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Connected to the layout file named "activity_main.xml"
        setContentView(R.layout.activity_main)
//        Display customized text to show 'Hello from {name}'
//        User can tap a button to change text color of the label
//                Add a button to the layout
//        Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener{
            //                Set up logic to know when user has tapped on a button
//                Change the color of the text upon being tapped on by the user
            Log.i("Olivia", "Tapped on button")
//            Get a reference to the text view
//            Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.hot_pink))
        }


    }
}