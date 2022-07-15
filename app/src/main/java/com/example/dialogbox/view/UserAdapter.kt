package com.example.dialogbox.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dialogbox.R
import com.example.dialogbox.model.UserData
import kotlin.contracts.Returns

class UserAdapter (val userList:ArrayList<UserData>):RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    class ViewHolder(m:View):RecyclerView.ViewHolder(m) {
        val ab=m.findViewById<TextView>(R.id.mTitle)
        val bc=m.findViewById<TextView>(R.id.mPara)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val J=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(J)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val manoj=userList[position]
        holder.ab.text=manoj.userName
                holder.bc.text=manoj.userMb
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}