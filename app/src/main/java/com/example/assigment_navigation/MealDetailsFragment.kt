package com.example.assigment_navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.assigment_navigation.databinding.FragmentBrowseBinding
import com.example.assigment_navigation.databinding.FragmentMealDetailsBinding


class MealDetailsFragment :Fragment() {

   lateinit var binding:FragmentMealDetailsBinding
   private var args: MealDetailsFragmentArgs by  this.navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMealDetailsBinding.inflate(inflater,container,false)


    }
}