package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contacts =Contacts (name = "Ann", phone = "12345678", email = "aaa@hamail", address = "123 Nandi", image = "")
        var contacts1 =Contacts (name = "May", phone = "12345679", email = "ee@hamail", address = "123 Nakuru", image = "")
        var contacts2 =Contacts (name = "Anto", phone = "12345676", email = "ii@hamail", address = "123 Nairobi", image = "")
        var contacts3 =Contacts (name = "Brian", phone = "12345673", email = "ooo@hamail", address = "123 Naivasha", image = "")
        var contacts4 =Contacts (name = "Ema", phone = "12345672", email = "uuu@hamail", address = "123 Narok", image = "")

        var contactList = listOf(contacts, contacts1,contacts2, contacts3, contacts4)
        var contactAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager( this)
        binding.rvContacts.adapter = contactAdapter

    }
}