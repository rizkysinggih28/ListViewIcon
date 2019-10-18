package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.Adapter.ListAdapterLanguage
import com.example.listviewicon.Model.Language
import com.example.listviewicon.Model.LanguageData

class MainActivity : AppCompatActivity() {
    private lateinit var rvBahasa: RecyclerView
    private var list: ArrayList<Language> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasa = findViewById(R.id.rv_bahasa)
        rvBahasa.setHasFixedSize(true)
        list.addAll(LanguageData.listLanguage)
        showBahasaList()
    }

    private fun showBahasaList() {
        rvBahasa.layoutManager = LinearLayoutManager(this)
        val listBahasaAdapter= ListAdapterLanguage(list)
        rvBahasa.adapter = listBahasaAdapter
    }
}
