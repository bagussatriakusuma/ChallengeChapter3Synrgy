package com.example.challengechapter3.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.databinding.ListItemGenreBinding
import com.example.challengechapter3.model.GenreModel
import com.example.challengechapter3.utils.randomizeBackgroundColor
import java.util.Random

class GenreAdapter(private val onClick: OnClickListener): RecyclerView.Adapter<GenreAdapter.ViewHolder>() {

    private val diffCallBack = object: DiffUtil.ItemCallback<GenreModel>(){
        override fun areItemsTheSame(oldItem: GenreModel, newItem: GenreModel): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: GenreModel, newItem: GenreModel): Boolean {
            return oldItem.genreTitle == newItem.genreTitle
        }
    }

    private val differ = AsyncListDiffer(this,diffCallBack)
    fun submitData(value: List<GenreModel>?) = differ.submitList(value)

    interface OnClickListener {
        fun onClickItem (data: GenreModel)
    }

    inner class ViewHolder(private val binding: ListItemGenreBinding): RecyclerView.ViewHolder(binding.root){
        fun bind (data: GenreModel){
            binding.ivGenreImage.setImageResource(data.genreImage)
            binding.tvGenreName.text = data.genreTitle
            binding.cvGenre.setCardBackgroundColor(randomizeBackgroundColor())
            binding.root.setOnClickListener {
                onClick.onClickItem(data)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreAdapter.ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return ViewHolder(ListItemGenreBinding.inflate(inflate,parent,false))
    }

    override fun onBindViewHolder(holder: GenreAdapter.ViewHolder, position: Int) {
        val data = differ.currentList[position]
        data.let {
            holder.bind(data)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}