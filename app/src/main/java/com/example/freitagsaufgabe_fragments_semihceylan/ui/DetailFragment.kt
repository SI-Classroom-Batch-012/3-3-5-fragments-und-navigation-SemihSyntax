package com.example.freitagsaufgabe_fragments_semihceylan.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.freitagsaufgabe_fragments_semihceylan.MainActivity
import com.example.freitagsaufgabe_fragments_semihceylan.R
import com.example.freitagsaufgabe_fragments_semihceylan.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position = args.notizenIndex
        val mainActivity = activity as MainActivity
        val notiz = mainActivity.dataset[position]

        binding.etTitel.setText(notiz.titel)
        binding.etText.setText(notiz.text)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            notiz.text = binding.etText.text.toString()
            notiz.titel = binding.etTitel.text.toString()

            findNavController().popBackStack()
        }
    }
}