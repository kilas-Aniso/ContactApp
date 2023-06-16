package com.aniso.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.aniso.contacts.databinding.ContactItemListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

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
        binding.ivAvator.imageAlpha
        binding.tvNameDisplay.text = currentContact.names
        binding.tvNum.text=currentContact.number
        binding.tvEmail.text = currentContact.email

        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivAvator)


    }

}
class ContactViewHolder( var binding:ContactItemListBinding):ViewHolder(binding.root) {

}

