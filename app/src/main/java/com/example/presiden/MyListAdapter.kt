package com.example.presiden


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter (var mCtx:Context, var resource:Int, var item:List<Model>)
    :ArrayAdapter<Model>(mCtx, resource, item) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val layoutInflater : LayoutInflater
        val view : View = layoutInflater.inflate(resource , null)
        val imageView : ImageView = view.findViewById(R.id.iconIv)
        var textView :TextView = view.findViewById(R.id.titleTv)
        var textView1 : TextView = view.findViewById(R.id.descTv)

        var person : Model = item[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(person.photo))
        textView.text = person.title
        textView1.text = person.desc

        return view
    }
}
