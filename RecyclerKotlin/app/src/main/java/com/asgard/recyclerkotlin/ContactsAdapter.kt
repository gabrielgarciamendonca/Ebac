package com.asgard.recyclerkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asgard.recyclerkotlin.databinding.ContactBinding

class ContactsAdapter(private val contacts: MutableList<ContactInfo>): RecyclerView.Adapter<ContactsAdapter.RoomViewHolder>() {
    class RoomViewHolder(binding: ContactBinding): RecyclerView.ViewHolder(binding.root) {
        var phone = binding.phone
        var name = binding.name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        return RoomViewHolder(ContactBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        val room = contacts[position]
        holder.name.text = room.name
        holder.phone.text = room.phone
    }
}