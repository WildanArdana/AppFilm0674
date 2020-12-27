package com.appfilm.app.ui.news

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.appfilm.app.R
import com.appfilm.app.data.model.News
import com.appfilm.app.databinding.ItemNewsBinding
import com.appfilm.app.ui.base.BaseAdapter
import com.bumptech.glide.Glide

class NewsAdapter(val context: Context) : BaseAdapter<News>(R.layout.item_news) {
    override fun onBind(binding: ViewDataBinding?, data: News) {
        val mBinding = binding as ItemNewsBinding
        Glide.with(context).load(data.poster).into(mBinding.itemPoster)
    }

    override fun onClick(binding: ViewDataBinding?, data: News) {
        val intent = Intent(context, NewsActivity::class.java)
        intent.putExtra(NewsActivity.OPEN_NEWS, data)
        context.startActivity(intent)
    }
}