package com.example.rechyclerviewapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.rechyclerviewapp.databinding.ItemListBinding
import com.example.rechyclerviewapp.model.Player

class PlayerAdapter (private val playerlist:ArrayList<Player>): RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>(){
    class PlayerViewHolder(val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return playerlist.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = playerlist[position]

        holder.binding.apply {
            profileName.text = player.playerName
            profileDescription.text = player.playerDiscription
            profileImage.setImageResource(player.playerImage)
        }
    }
}