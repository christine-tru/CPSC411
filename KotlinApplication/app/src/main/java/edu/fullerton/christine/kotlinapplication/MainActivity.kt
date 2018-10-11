package edu.fullerton.christine.kotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

fun TextView.increment() {
    val i = Integer.parseInt(this.text.toString())
    this.text = (i + 1).toString()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonIncrement.setOnClickListener {
          countTextView.increment()
        }

        // Text below is unnecessary
        //val incrementButton : Button =  findViewByID(R.id.buttonIncrement)
    }
}
