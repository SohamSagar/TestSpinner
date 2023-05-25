package com.example.testspinner

import android.os.Bundle
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.testspinner.adapter.CustomSpinnerAdapter


class MainActivity : AppCompatActivity() {
    companion object{
        var orderType=""
        var spinnerFlag=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)

        var strArray = java.util.ArrayList<String>()

        strArray.add("1")
        strArray.add("2")
        strArray.add("select")

        spinner.adapter = CustomSpinnerAdapter(this, strArray)

        spinnerFlag = 1
        spinner.setSelection(2)
        spinnerFlag = 0
    }
}