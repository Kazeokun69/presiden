package com.example.presiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Sukarno", "Presiden Pertama", R.mipmap.ic_launcher))
        list.add(Model("Suharto", "Presiden ke Dua", R.mipmap.ic_launcher_round))
        list.add(Model("Habibie", "Presiden ke Tiga", R.mipmap.ic_launcher))
        list.add(Model("Abdurahman Wahid", "Presiden ke Empat", R.mipmap.ic_launcher_round))
        list.add(Model("Megawati", "Presiden Ke Lima", R.mipmap.ic_launcher))
        list.add(Model("Susilo Bambang Yudhoyono", "Presiden ke Enam", R.mipmap.ic_launcher_round))
        list.add(Model("Joko Widodo", "Presiden Ke Tujuh", R.mipmap.ic_launcher))

        listView.adapter = MyListAdapter(this, R.layout.row,list)
        listView.setOnItemClickListener{parent, view, position, id ->
            if (position==0){
                Toast.makeText(this@MainActivity, "item one", Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "Item two", Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "Item three", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "Item four", Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "Item five", Toast.LENGTH_SHORT).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity, "Item six", Toast.LENGTH_SHORT).show()
            }
            if (position==6){
                Toast.makeText(this@MainActivity, "Item seven", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
