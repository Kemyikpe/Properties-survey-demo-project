package com.ekemini.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ekemini.project_page12.databinding.PopularPlacesItemsBinding

class PopularPlacesAdapter (
    var popularPlaces:List<PopularPlaces>
): RecyclerView.Adapter<PopularPlacesAdapter.PopularPlacesViewHolder>() {


    inner class PopularPlacesViewHolder(val binding: PopularPlacesItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularPlacesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = PopularPlacesItemsBinding.inflate(layoutInflater, parent, false)
        return PopularPlacesViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return popularPlaces.size
    }

    override fun onBindViewHolder(holder: PopularPlacesViewHolder, position: Int) {
        holder.binding.apply {
            companyNameTv.text = popularPlaces[position].companyName
            locationTv.text = popularPlaces[position].location.toString()
            textviewAmt.text = popularPlaces[position].amount.toString()
            durationTv.text = popularPlaces[position].duration
        }
    }

}
