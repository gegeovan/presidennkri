package com.apkgeo.presidennkri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir soekarno", "Presiden Pertama", R.drawable.soekarno))
        list.add(Model("Soeharto", "Presiden Kedua", R.drawable.soeharto))
        list.add(Model("BJ Habibie", "Presiden Ketiga", R.drawable.habibie))
        list.add(Model("Abdurrahman Wahid", "Presiden Keempat", R.drawable.gusdur))
        list.add(Model("Megawati", "Presiden Kelima", R.drawable.megawati))
        list.add(Model("Susilo Bambang Yudhoyono", "Presiden Keenam", R.drawable.sby))
        list.add(Model("Joko Widodo", "Presiden Ketujuh", R.drawable.jokowi))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "Bung Karno atau Soekarno. Presiden Ke 1. Lahir pada 6 Juni 1901 di Blitar, Jawa Timur. Meninggal : 21 Juni 1970 . Dimakamkan : Blitar, Jawa-Timur", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "Jend. Besar TNI Purn. Haji Muhammad Soeharto. Presiden Ke 2. Rabu, 8 Juni 1921, Kemusuk, Yogyakarta. Meninggal : 27 Januari 2008 .", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Bacharuddin Jusuf Habibie. Presiden Ke 3. Lahir pada Parepare, 25 juni 1936", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "KH. Abdurrahman Wahid .Presiden Ke 4. Lahir pada Jombang, 04 Agustus 1940 ", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Megawati. Presiden Ke 5. Lahir pada  Yogyakarta, 23 Januari 1947", Toast.LENGTH_LONG).show()
            }
            if (position == 5 ){
                Toast.makeText(this@MainActivity, "Susilo Bambang Yudhoyono. Presiden Ke 6.Lahir di Remas, Arjosari, Pacitan, Jawa Timur Tanggal Lahir : Jumat, 9 September 1949", Toast.LENGTH_LONG).show()
            }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Jokowi .Presiden Ke 7. Lahir pada Surakarta, 21 Juni 1961", Toast.LENGTH_LONG).show()
            }
        }
    }
}
