package com.asgard.recyclerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.asgard.recyclerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val contacts: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactsView = binding.contacts
        createMockData()

        contactsView.layoutManager = LinearLayoutManager(this)
        contactsView.adapter = ContactsAdapter(contacts)
    }

    private fun createMockData() {
        contacts.add(ContactInfo("GABRIEL", "(11) 96983-6428"))
        contacts.add(ContactInfo("EDUARDO", "(11) 94677-6277"))
        contacts.add(ContactInfo("PAULO", "(11) 98020-6277"))
        contacts.add(ContactInfo("HELGA", "(11) 98020-6277"))
        contacts.add(ContactInfo("BOLOTA", "(11) 98020-6277"))
        contacts.add(ContactInfo("MEL", "(11) 98020-6277"))
        contacts.add(ContactInfo("GABRIEL", "(11) 96983-6428"))
        contacts.add(ContactInfo("EDUARDO", "(11) 94677-6277"))
        contacts.add(ContactInfo("PAULO", "(11) 98020-6277"))
        contacts.add(ContactInfo("HELGA", "(11) 98020-6277"))
        contacts.add(ContactInfo("BOLOTA", "(11) 98020-6277"))
        contacts.add(ContactInfo("MEL", "(11) 98020-6277"))
        contacts.add(ContactInfo("GABRIEL", "(11) 96983-6428"))
        contacts.add(ContactInfo("EDUARDO", "(11) 94677-6277"))
        contacts.add(ContactInfo("PAULO", "(11) 98020-6277"))
        contacts.add(ContactInfo("HELGA", "(11) 98020-6277"))
        contacts.add(ContactInfo("BOLOTA", "(11) 98020-6277"))
        contacts.add(ContactInfo("MEL", "(11) 98020-6277"))
        contacts.add(ContactInfo("MEL", "(11) 98020-6277"))

    }
}