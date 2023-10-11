package com.example.challengechapter3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter3.databinding.ListItemResultBinding
import com.example.challengechapter3.model.RecommendResultModel

class RecommendResultAdapter(private val onClick: OnClickListener): RecyclerView.Adapter<RecommendResultAdapter.ViewHolder>() {

    private val diffCallBack = object: DiffUtil.ItemCallback<RecommendResultModel>(){
        override fun areItemsTheSame(oldItem: RecommendResultModel, newItem: RecommendResultModel): Boolean {
            return oldItem == newItem
        }
        override fun areContentsTheSame(oldItem: RecommendResultModel, newItem: RecommendResultModel): Boolean {
            return oldItem.songTitle == newItem.songTitle
        }
    }

    private val differ = AsyncListDiffer(this,diffCallBack)
    fun submitData(value: List<RecommendResultModel>?) = differ.submitList(value)

    interface OnClickListener {
        fun onClickItem (data: RecommendResultModel)
    }

    inner class ViewHolder(private val binding: ListItemResultBinding): RecyclerView.ViewHolder(binding.root){
        fun bind (data: RecommendResultModel){
            binding.ivResultImage.setImageResource(data.songImage)
            binding.tvResultTitle.text = data.songTitle
            binding.tvResultArtist.text = data.songArtist
            binding.root.setOnClickListener {
                onClick.onClickItem(data)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendResultAdapter.ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        return ViewHolder(ListItemResultBinding.inflate(inflate,parent,false))
    }

    override fun onBindViewHolder(holder: RecommendResultAdapter.ViewHolder, position: Int) {
        val data = differ.currentList[position]
        data.let {
            holder.bind(data)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}