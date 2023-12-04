package com.example.freitagsaufgabe_fragments_semihceylan.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.freitagsaufgabe_fragments_semihceylan.MainActivity
import com.example.freitagsaufgabe_fragments_semihceylan.data.Data
import com.example.freitagsaufgabe_fragments_semihceylan.databinding.ListItemBinding
import com.example.freitagsaufgabe_fragments_semihceylan.ui.ListFragment
import com.example.freitagsaufgabe_fragments_semihceylan.ui.ListFragmentDirections

class ItemAdapter(
    var dataset: List<Data>
) : RecyclerView.Adapter<ItemAdapter.TeamViewHolder>() {
    private lateinit var mainActivity: MainActivity
    private lateinit var listFragment: ListFragment

    inner class TeamViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TeamViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {

        val note = dataset[position]

        holder.binding.tvTitel.text = note.titel
        holder.binding.tvVorschau.text = note.text

        holder.binding.mcwNotizen.setOnClickListener {
            val navcontroller = holder.binding.root.findNavController()
            navcontroller.navigate(ListFragmentDirections.actionListFragmentToDetailFragment(position))
        }
        holder.binding.btnLoeschen.setOnClickListener{
            dataset = dataset - note
            mainActivity.dataset = dataset
            listFragment.dataset = dataset
        }

    }
}