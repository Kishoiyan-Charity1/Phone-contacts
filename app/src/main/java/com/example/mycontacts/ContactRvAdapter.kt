package com.example.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactslistitemsBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contactsList:List<Contacts>):
    RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var binding =ContactslistitemsBinding
           .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactsList.get(position)
        with(holder.binding){
            tvEmail.text = currentContact.email
            tvPhone.text = currentContact.phone
            tvName.text = currentContact.name
            tvAddress.text = currentContact.address

            Picasso.get()
                .load(currentContact.image)
//                .error()
                .resize(300,300)
                .centerCrop()
//                .placeholder(R.drawable.ic_baseline_person_24)
                .into(holder.binding.imgContact)
        }



    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

}
class ContactViewHolder( var binding:ContactslistitemsBinding)
    : RecyclerView.ViewHolder(binding.root){

}