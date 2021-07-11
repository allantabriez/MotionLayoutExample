package com.example.motionlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayoutexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mainAdapter = Adapter()
        with(binding.recyclerView){
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mainAdapter
        }
        mainAdapter.setData(setData())
    }

    private fun setData(): List<String> = listOf("Indomie Jumbo","Indomie Jumbo","Indomie Jumbo","Indomie Jumbo","Indomie Jumbo")
}