package com.example.freitagsaufgabe_fragments_semihceylan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freitagsaufgabe_fragments_semihceylan.data.Data
import com.example.freitagsaufgabe_fragments_semihceylan.data.Datasource
import com.example.freitagsaufgabe_fragments_semihceylan.databinding.ActivityMainBinding
import com.example.freitagsaufgabe_fragments_semihceylan.ui.adapter.ItemAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    var dataset : List<Data> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataset = Datasource().loadData()
        binding.tvAnzahlNotizen.text = dataset.size.toString() + " Notizen"

    }
}