package com.android.app2

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView
import kotlinx.android.synthetic.main.item_list.view.*

class Adapter(var persons:ArrayList<Actor>):RecyclerView.Adapter<Adapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = persons[position].name
        holder.role.text = persons[position].role
    }

    override fun onCreateViewHolder(holder: ViewGroup, position: Int): ViewHolder {
        val inflater = LayoutInflater.from(holder.context)
        val view = inflater.inflate(R.layout.item_list, holder, false)
        return ViewHolder(view)
    }
    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        return persons.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var name: TextView = itemView.name_xml
        var role: TextView  = itemView.role_xml
    }
}