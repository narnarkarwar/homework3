package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            var first = intputOne.text.toString()
            var second = intputTwo.text.toString()

            if (first.isEmpty() || second.isEmpty()){
                Toast.makeText(applicationContext,"Please enter number",Toast.LENGTH_LONG).show()
            }
            else{
                var a: Int = first.toInt()
                var b: Int = second.toInt()
                var c =a + b
                showresult.text = c.toString()
            }
        }

        minus.setOnClickListener {
            var first = intputOne.text.toString()
            var second = intputTwo.text.toString()

            if (first.isEmpty() || second.isEmpty()){
                Toast.makeText(applicationContext,"Please enter number",Toast.LENGTH_LONG).show()
            }
            else{
                var a: Int = first.toInt()
                var b: Int = second.toInt()
                var c =a - b
                showresult.text = c.toString()
            }
        }
        multi.setOnClickListener {
            var first = intputOne.text.toString()
            var second = intputTwo.text.toString()

            if (first.isEmpty() || second.isEmpty()){
                Toast.makeText(applicationContext,"Please enter number",Toast.LENGTH_LONG).show()
            }
            else{
                var a: Int = first.toInt()
                var b: Int = second.toInt()
                var c =a * b
                showresult.text = c.toString()
            }
        }
        div.setOnClickListener {
            var first = intputOne.text.toString()
            var second = intputTwo.text.toString()

            if (first.isEmpty() || second.isEmpty()){
                Toast.makeText(applicationContext,"Please enter number",Toast.LENGTH_LONG).show()
            }
            else{
                var a: Int = first.toInt()
                var b: Int = second.toInt()
                var c =a / b
                showresult.text = c.toString()
            }
        }

    }
}
