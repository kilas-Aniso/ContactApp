package com.aniso.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.aniso.contacts.databinding.ContactItemListBinding

class ContactRvAdapter(var contactList:List<ContactData>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactItemListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return  contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
//        binding.ivAvator.=currentContact.avatar
        binding.tvNameDisplay.text = currentContact.number
        binding.tvNum.text=currentContact.number
        binding.tvEmail.text = currentContact.email

        //    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
//        val currentTweet = tweetList.get(position)
//        val binding = holder.binding
//        binding.tvDisplayName.text = currentTweet.displayName
//        binding.tvHandle.text = currentTweet.handle
//        binding.tvTweet1.text = currentTweet.tvTweet1
//        binding.tvlikeCount.text = currentTweet.tvLikeCount
//        binding.tvCommentCount.text = currentTweet.commentCount
//        binding.tvtvRtCount.text = currentTweet.tvRtCount
//
//    }
    }

}
class ContactViewHolder( var binding:ContactItemListBinding):ViewHolder(binding.root) {

}


////
//class TweetAdapter(var tweetList: List<TweetData>) : RecyclerView.Adapter<TweetViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
//        val binding =
//            TweetListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return TweetViewHolder(binding)
//    }
//
//    override fun getItemCount(): Int {
//        return tweetList.size
//
//    }
//

//
//}
