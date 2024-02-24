package com.example.recylerviewwithclickfunction


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class RecylerViewItemAdapter(
    val itemList: ArrayList<ItemModel>,
    val listener: OnItemClickListener
) :
    RecyclerView.Adapter<RecylerViewItemAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val usenameview: TextView = itemView.findViewById(R.id.textview_1)
        val birthdateview: TextView = itemView.findViewById(R.id.textView_2)
        val cityview: TextView = itemView.findViewById(R.id.textview_3)
        val cardview: CardView = itemView.findViewById(R.id.item_cardview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.usenameview.text = itemList[position].userName
        holder.birthdateview.text = itemList[position].birthdate
        holder.cityview.text = itemList[position].city
        holder.cardview.setOnClickListener { listener.onItemClick(itemList.get(holder.getAdapterPosition()))
        }
    }


}