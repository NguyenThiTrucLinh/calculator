package com.example.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private val Any.text: Any
    get() {}

class MainActivity(private val etShowNumber: Any) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view: View){

        val buSelect= view as Button
        val buClickValue:String=etShowNumber.text.toString()
        val buplusMins
        when (buSelect.id){
            bu0.id->{
                buClickValue+="0"
            }
            bu1.id->{
                buClickValue+="1"
            }
            bu2.id->{
                buClickValue+="2"
            }
            bu3.id->{
                buClickValue+="3"
            }
            bu4.id->{
                buClickValue+="4"
            }
            bu5.id->{
                buClickValue+="5"
            }
            bu6.id->{
                buClickValue+="6"
            }
            bu7.id->{
                buClickValue+="7"
            }
            bu8.id->{
                buClickValue+="8"
            }
            bu9.id->{
                buClickValue+="9"
            }
            buDot.id->{
                buClickValue+="."
            }
            buplusMins.id->{
                buClickValue="-"+ buClickValue

            }
        }
        etShowNumber.setText(buClickValue)
    }
}

private fun Any.setText(buClickValue: String) {

}
