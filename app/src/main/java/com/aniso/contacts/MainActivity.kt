package com.aniso.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.aniso.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
    }

    fun displayContact(){
        val contact1=ContactData("Aniso", "","0724638771","nizakilaz2@gmail.com")
        val contact2=ContactData("Rediet Zerai","","+251927444862","Redietzeraihadera@gmail.com")

        val contactList= listOf(contact1,contact2)
        val contactAdapter= ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter
    }
}
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding)
    }

    override fun onResume() {
        super.onResume()
    }
    fun displayTweets(){
        val Tweet2=TweetData("","Silvia","")

        val tweetList= listOf()
    }
}
 */