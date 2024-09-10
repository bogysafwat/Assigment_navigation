package com.example.assigment_navigation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.assigment_navigation.MealAdapter.MyViewHolder
import com.example.assigment_navigation.databinding.ItemMealBinding

class MealAdapter(val data :List<Meal>,val mealClickListener: MealClickListener )
    :ListAdapter<Meal, MyViewHolder>(MealItemDiffCallback()) {

    class MyViewHolder(val binding: ItemMealBinding) : ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemMealBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }

    }


    interface MealClickListener {
        fun OnMealCLicked(meal: Meal)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.meal=data.get(position)
        holder.binding.itemMealIv.setImageResource(data.get(position).image)

        holder.binding.root.setOnClickListener{
            mealClickListener.OnMealCLicked(data.get(position))
        }
    }


}


class MealItemDiffCallback: DiffUtil.ItemCallback<Meal>(){
    override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem == newItem
    }

}




