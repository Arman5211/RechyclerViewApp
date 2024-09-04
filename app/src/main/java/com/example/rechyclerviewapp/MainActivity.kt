package com.example.rechyclerviewapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rechyclerviewapp.adapter.PlayerAdapter
import com.example.rechyclerviewapp.databinding.ActivityMainBinding
import com.example.rechyclerviewapp.databinding.ItemListBinding
import com.example.rechyclerviewapp.model.Player

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val player = ArrayList<Player>()

        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))
        player.add(Player("CR7","Youtuber", R.drawable.aaa ))

        val playerAdapter = PlayerAdapter(player)
        binding.recyclerView.adapter = playerAdapter
    }
}