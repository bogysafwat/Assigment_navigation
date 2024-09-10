package com.example.assigment_navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.assigment_navigation.databinding.FragmentBrowseBinding


class BrowseFragment:Fragment(),MealAdapter.MealClickListener {

    lateinit var binding:FragmentBrowseBinding
    var meals : MutableList<Meal> = mutableListOf()
    lateinit var mealAdapter: MealAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBrowseBinding.inflate(inflater,container,false)

        meals= mutableListOf(
            Meal("Burger",R.drawable.burger),
            Meal("Steak",R.drawable.filletsteak),
            Meal("Puncakes",R.drawable.pancakes),
            Meal("Pizza",R.drawable.pizza),
            Meal("Shawerma",R.drawable.shawerma),
            Meal("Waffiles",R.drawable.waffles))

        mealAdapter=MealAdapter(meals,this)
        binding.rvMeals.adapter=mealAdapter
        return binding.root
    }


    override fun OnMealCLicked(meal: Meal) {
     val action =
    }
}