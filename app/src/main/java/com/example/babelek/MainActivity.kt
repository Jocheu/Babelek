package com.example.babelek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var listaTextwiev = arrayListOf<TextView>(findViewById(R.id.l1), findViewById(R.id.l2),findViewById(R.id.l3),findViewById(R.id.l4),findViewById(R.id.l5),findViewById(R.id.l6),findViewById(R.id.l7),findViewById(R.id.l8),findViewById(R.id.l9))
        var listaBtn = arrayListOf<ToggleButton>(findViewById(R.id.btn1), findViewById(R.id.btn2),findViewById(R.id.btn3),findViewById(R.id.btn4),findViewById(R.id.btn5),findViewById(R.id.btn6),findViewById(R.id.btn7),findViewById(R.id.btn8),findViewById(R.id.btn9))

        fun losowanie(){
            for(txt in listaTextwiev){
                txt.text =  Random.nextInt(0,100).toString()
            }
        }

        fun sortowanie(){
            findViewById<TextView>(R.id.wynik).text = ""
            var doPosortowania = arrayListOf<Int>()

            for(i in 0..8){
                if(listaBtn[i].isChecked){
                    doPosortowania.add(listaTextwiev[i].text.toString().toInt())
                }
            }

            val l = doPosortowania.size
            for (pass in 0 until (doPosortowania.size - 1)) {
                // A single pass of bubble sort
                for (currentPosition in 0 until (doPosortowania.size - 1)) {
                    // This is a single step
                    if (doPosortowania[currentPosition] > doPosortowania[currentPosition + 1]) {
                        val tmp = doPosortowania[currentPosition]
                        doPosortowania[currentPosition] = doPosortowania[currentPosition + 1]
                        doPosortowania[currentPosition + 1] = tmp
                    }
                }
            }
            for(liczby in doPosortowania){
                findViewById<TextView>(R.id.wynik).text =findViewById<TextView>(R.id.wynik).text.toString() + liczby + " "
            }
        }
        losowanie()
        findViewById<Button>(R.id.losujBtn).setOnClickListener {
            losowanie()
        }
        findViewById<Button>(R.id.sortBtn).setOnClickListener {
            sortowanie()
        }
    }
}