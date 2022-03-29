package com.example.aop_act3_chapter06.home

import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter: ListAdapter<ArticleModel,ArticleAdapter.ViewHolder>(diffUtil) {


    inner class ViewHolder(private val binding: ItemArticleBinding): RecyclerView.ViewHolder(binding.root){

    }
}