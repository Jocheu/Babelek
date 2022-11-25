package com.example.babelek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var listaTextwiev = arrayListOf<TextView>(findViewById(R.id.l1), findViewById(R.id.l2),findViewById(R.id.l3),findViewById(R.id.l4),findViewById(R.id.l5),findViewById(R.id.l6),findViewById(R.id.l7),findViewById(R.id.l8),findViewById(R.id.l9))
        fun losowanie(){
            for(txt in listaTextwiev){
                txt.text =  Random.nextInt(0,100).toString()
            }
        }
        losowanie()
        findViewById<Button>(R.id.sortBtn).setOnClickListener {
            losowanie()
        }
    }
}