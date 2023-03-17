package com.example.expenseapp.view.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.expenseapp.R
import com.example.expenseapp.model.TranscationData

class FutureMoneyAdapter(val context: Context,var list:ArrayList<TranscationData>): RecyclerView.Adapter<FutureMoneyAdapter.ViewHolder>()  {


    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val name=itemView.findViewById<TextView>(R.id.txt_item_no)
        val bill_date=itemView.findViewById<TextView>(R.id.txt_date)
        val amount=itemView.findViewById<TextView>(R.id.txt_amount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_transcations,parent,false)
        return ViewHolder(itemView)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var current=list[position]
        holder.name.text=current.name
        holder.bill_date.text=current.date
        holder.amount.text=current.amount.toString()

        if (holder.adapterPosition % 2==1  )
        {
            holder.amount.setTextColor(R.color.red)
        }
        else{
            holder.amount.setTextColor(R.color.green)
        }

    }
    override fun getItemCount()= list.size

}
