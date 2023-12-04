package com.example.freitagsaufgabe_fragments_semihceylan.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.freitagsaufgabe_fragments_semihceylan.MainActivity
import com.example.freitagsaufgabe_fragments_semihceylan.databinding.FragmentListBinding
import com.example.freitagsaufgabe_fragments_semihceylan.ui.adapter.ItemAdapter

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    var mainActivity = activity as MainActivity

    var dataset = mainActivity.dataset
    var adapter = ItemAdapter(dataset)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvListe.adapter = adapter
    }
}