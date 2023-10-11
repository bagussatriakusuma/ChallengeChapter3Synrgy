package com.example.challengechapter3.presentation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.challengechapter3.adapter.MoreResultAdapter
import com.example.challengechapter3.adapter.RecentlyResultAdapter
import com.example.challengechapter3.adapter.RecommendResultAdapter
import com.example.challengechapter3.databinding.ActivityResultBinding
import com.example.challengechapter3.model.MoreResultModel
import com.example.challengechapter3.model.RecentlyResultModel
import com.example.challengechapter3.model.RecommendResultModel
import com.example.challengechapter3.utils.fetchContentMore
import com.example.challengechapter3.utils.fetchContentRecently
import com.example.challengechapter3.utils.fetchContentRecommended

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    private lateinit var resultAdapter: RecommendResultAdapter
    private lateinit var recentlyResultAdapter: RecentlyResultAdapter
    private lateinit var moreResultAdapter: MoreResultAdapter
    private lateinit var resultDataList: List<RecommendResultModel>
    private lateinit var recentlyResultDataList: List<RecentlyResultModel>
    private lateinit var moreResultDataList: List<MoreResultModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()
        bindView()
        bindAdapter()
        provideDataResult()
    }

    private fun bindView(){
        binding.ivBack.setOnClickListener {
            goBackToSearchActivity()
        }
    }

    private fun getData(){
        val getTitleName = intent.getStringExtra(SearchActivity.EXTRAS_TITLE)
        val genreIdentifier = intent.getStringExtra(SearchActivity.GENRE_IDENTIFIER)

        binding.tvGenreNameResult.text = getTitleName
        resultDataList = fetchContentRecommended(genreIdentifier)
        recentlyResultDataList = fetchContentRecently(genreIdentifier)
        moreResultDataList = fetchContentMore(genreIdentifier)
    }

    private fun bindAdapter() {
        resultAdapter = RecommendResultAdapter(object : RecommendResultAdapter.OnClickListener {
            override fun onClickItem(data: RecommendResultModel) {
                val searchQuery = data.songTitle
                val encodedQuery = Uri.encode(searchQuery)
                val url = "https://www.google.com/search?q=$encodedQuery"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        })
        binding.rvResult.adapter = resultAdapter

        recentlyResultAdapter = RecentlyResultAdapter(object : RecentlyResultAdapter.OnClickListener {
            override fun onClickItem(data: RecentlyResultModel) {
                val searchQuery = data.songTitle
                val encodedQuery = Uri.encode(searchQuery)
                val url = "https://www.google.com/search?q=$encodedQuery"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        })
        binding.rvRecently.adapter = recentlyResultAdapter

        moreResultAdapter = MoreResultAdapter(object : MoreResultAdapter.OnClickListener {
            override fun onClickItem(data: MoreResultModel) {
                val searchQuery = data.songTitle
                val encodedQuery = Uri.encode(searchQuery)
                val url = "https://www.google.com/search?q=$encodedQuery"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        })
        binding.rvMore.adapter = moreResultAdapter
    }


    private fun provideDataResult(){
        resultAdapter.submitData(resultDataList)
        recentlyResultAdapter.submitData(recentlyResultDataList)
        moreResultAdapter.submitData(moreResultDataList)
    }

    private fun goBackToSearchActivity(){
        startActivity(Intent(this, SearchActivity::class.java))
    }
}