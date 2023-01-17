package com.ekemini.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekemini.project_page12.databinding.RecentPostedItemsBinding


class RecentPostedAdapter (
    var recentPosted:List<RecentPosted>
): RecyclerView.Adapter<RecentPostedAdapter.RecentPostedViewHolder>() {


    inner class RecentPostedViewHolder(val binding: RecentPostedItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentPostedViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecentPostedItemsBinding.inflate(layoutInflater, parent, false)
        return RecentPostedViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return recentPosted.size
    }

    override fun onBindViewHolder(holder: RecentPostedViewHolder, position: Int) {
        holder.binding.apply {
            companyNameTv.text = recentPosted[position].companyName
            locationTv.text = recentPosted[position].location.toString()
            amountTv.text = recentPosted[position].amount.toString()
            durationTv.text = recentPosted[position].duration
            // tvTitle this now works
        }
    }


}