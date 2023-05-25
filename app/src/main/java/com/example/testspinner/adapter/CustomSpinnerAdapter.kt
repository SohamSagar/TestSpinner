package com.example.testspinner.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.testspinner.MainActivity.Companion.orderType
import com.example.testspinner.MainActivity.Companion.spinnerFlag
import com.example.testspinner.R

open class CustomSpinnerAdapter(val context: Context, val data:ArrayList<String>): BaseAdapter() {

    override fun getCount(): Int {
        return data.size-1
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.spinner_drop_down_item, parent, false)
        val textView = view!!.findViewById(R.id.text) as TextView

            if (data[position] == orderType && spinnerFlag == 0) {
                view!!.setBackgroundColor(context.resources.getColor(R.color.purple_200))
            } else {
                view!!.setBackgroundColor(0)
            }
            textView.text=data[position]
            return view

    }
}