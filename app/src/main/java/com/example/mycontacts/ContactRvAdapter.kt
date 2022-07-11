package com.example.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRvAdapter(var contactsList:List<Contacts>):
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.contactslistitems,parent, false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactsList.get(position)
        holder.tvEmail.text = currentContact.email
        holder.tvPhone.text = currentContact.phone
        holder.tvName.text = currentContact.name
        holder.tvAddress.text = currentContact.address

    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName =itemView.findViewById<TextView>(R.id.tvName)
    var tvPhone =itemView.findViewById<TextView>(R.id.tvPhone)
    var tvEmail =itemView.findViewById<TextView>(R.id.tvEmail)
    var tvAddress =itemView.findViewById<TextView>(R.id.tvAddress)
    var tvContacts =itemView.findViewById<ImageView>(R.id.imgContact)
}