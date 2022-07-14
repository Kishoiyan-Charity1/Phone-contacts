package com.example.mycontacts

import android.app.ActionBar
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycontacts.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
//        val actionBar:ActionBar? = supportActionBar;
        val extras = intent.extras
        var name = extras?.getString("NAME", "")
        var phone= extras?.getString("PHONE", "")
        var email= extras?.getString("EMAIL", "")
        var address=extras?.getString("ADDRESS", "")
        var image = binding.imgContact2

        Toast.makeText(this,name, Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        binding.tvName2.text=name
        binding.tvPhone2.text=phone
        binding.tvEmail2.text=email
        binding.tvAddress2.text=address
        Picasso.get()
            .load(intent.getStringExtra("IMAGE")).
            into(image)


    }
}