package com.ekemini.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ekemini.Adapter.PopularPlaces
import com.ekemini.Adapter.PopularPlacesAdapter
import com.ekemini.Adapter.RecentPosted
import com.ekemini.Adapter.RecentPostedAdapter
import com.ekemini.project_page12.R
import com.ekemini.project_page12.databinding.FragmentHomeFragmentBinding


class HomeFragment : Fragment() {

    var binding: FragmentHomeFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeFragmentBinding.inflate(inflater,container,false)

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var recentPostedList = mutableListOf(
            RecentPosted("Brolen Properties","hossain_market_dokka_1212", amount = "$425",
                duration = "Monthly"),
            RecentPosted("Brolen Properties","hossain_market_dokka_1212",amount = "$525",
                duration = "weekly"),
            RecentPosted("Brolen Properties","hossain_market_dokka_1212" ,amount = "$625",
                duration = "Monthly"),
            RecentPosted("Brolen Properties","hossain_market_dokka_1212",amount = "$725",
                duration = "daily"),
            RecentPosted("Brolen Properties","hossain_market_dokka_1212",amount = "$825",
                duration = "Monthly"),
            RecentPosted("Brolen Properties","hossain_market_dokka_1212",amount = "$925",
                duration = "weekly"),
            RecentPosted("Brolen Properties","hossain_market_dokka_1212",amount = "$225",
                duration = "Monthly")

        )


        var popularPlacesList = mutableListOf(
            PopularPlaces("Brolen Properties","hossain_market_dokka_1212", amount = "$425",
                duration = "Monthly"),
            PopularPlaces("Brolen Properties","Hossain_Market_Dokka_1212",amount = "$330",
                duration = "weekly"),
            PopularPlaces("Ablox Appartment","hossain_market_dokka_1212" ,amount = "$330",
                duration = "Monthly"),
            PopularPlaces("Ablox Appartment","hossain_market_dokka_1212",amount = "$330",
                duration = "daily"),
            PopularPlaces("Ablox Appartment","hossain_market_dokka_1212",amount = "$330",
                duration = "Monthly"),
            PopularPlaces("Ablox Appartment","hossain_market_dokka_1212",amount = "$330",
                duration = "weekly"),
            PopularPlaces("Ablox Appartment","hossain_market_dokka_1212",amount = "$330",
                duration = "Monthly")

        )


        val popularPlacesAdapter = PopularPlacesAdapter(popularPlacesList)
        binding?.apply {
            popularPlacesRv.adapter = popularPlacesAdapter
            popularPlacesRv.layoutManager = LinearLayoutManager(requireContext())


            val recentPostedAdapter = RecentPostedAdapter(recentPostedList)
            binding?.apply {
                recentPostedRv.adapter = recentPostedAdapter
                recentPostedRv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)

        }


//        adapter..setOnClickListener{
//            val title = etTodo.text.toString()
//            val todo = RecentPosted(title,false)
//            todoList.add(todo)
//            adapter.notifyItemInserted(todoList.size - 1)
        }
    }

}

