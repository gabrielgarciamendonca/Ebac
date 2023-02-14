package com.asgard.recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.asgard.recycle.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), ListAdapter.IListAdapterListener {
        private lateinit var binding: ActivityMainBinding
        private val itemList: MutableList<ListItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val listView = binding.lista

        createMockData()

        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ListAdapter(itemList, this)
    }

    private fun createMockData() {
        itemList.add(ListItem("São Paulo", "SP"))
        itemList.add(ListItem("Indaiatuba", "SP"))
        itemList.add(ListItem("Campinas", "SP"))
        itemList.add(ListItem("Santos", "SP"))
        itemList.add(ListItem("Itu", "SP"))
    }

    override fun onItemClicked(value: String) {
        Snackbar.make(binding.root, value, Snackbar.LENGTH_SHORT).show()
    }
}