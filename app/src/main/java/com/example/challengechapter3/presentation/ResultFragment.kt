package com.example.challengechapter3.presentation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.challengechapter3.R
import com.example.challengechapter3.adapter.MoreResultAdapter
import com.example.challengechapter3.adapter.RecentlyResultAdapter
import com.example.challengechapter3.adapter.RecommendResultAdapter
import com.example.challengechapter3.databinding.FragmentResultBinding
import com.example.challengechapter3.model.MoreResultModel
import com.example.challengechapter3.model.RecentlyResultModel
import com.example.challengechapter3.model.RecommendResultModel
import com.example.challengechapter3.utils.fetchContentMore
import com.example.challengechapter3.utils.fetchContentRecently
import com.example.challengechapter3.utils.fetchContentRecommended

class ResultFragment : Fragment() {
    private lateinit var binding: FragmentResultBinding
    private lateinit var resultAdapter: RecommendResultAdapter
    private lateinit var recentlyResultAdapter: RecentlyResultAdapter
    private lateinit var moreResultAdapter: MoreResultAdapter
    private lateinit var resultDataList: List<RecommendResultModel>
    private lateinit var recentlyResultDataList: List<RecentlyResultModel>
    private lateinit var moreResultDataList: List<MoreResultModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getData()
        bindView()
        bindAdapter()
        provideDataResult()
    }

    private fun bindView(){
        binding.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun getData(){
        val getTitleName = arguments?.getString(SearchFragment.EXTRAS_TITLE)
        val genreIdentifier = arguments?.getString(SearchFragment.GENRE_IDENTIFIER)

        binding.tvGenreNameResult.text = getTitleName
        resultDataList = fetchContentRecommended(genreIdentifier)
        recentlyResultDataList = fetchContentRecently(genreIdentifier)
        moreResultDataList = fetchContentMore(genreIdentifier)
    }

    private fun bindAdapter() {
        resultAdapter = RecommendResultAdapter(object : RecommendResultAdapter.OnClickListener {
            override fun onClickItem(data: RecommendResultModel) {
                goToBrowserRecommend(data)
            }
        })
        binding.rvResult.adapter = resultAdapter

        recentlyResultAdapter = RecentlyResultAdapter(object : RecentlyResultAdapter.OnClickListener {
            override fun onClickItem(data: RecentlyResultModel) {
                goToBrowserRecently(data)
            }
        })
        binding.rvRecently.adapter = recentlyResultAdapter

        moreResultAdapter = MoreResultAdapter(object : MoreResultAdapter.OnClickListener {
            override fun onClickItem(data: MoreResultModel) {
                goToBrowserMore(data)
            }
        })
        binding.rvMore.adapter = moreResultAdapter
    }


    private fun provideDataResult(){
        resultAdapter.submitData(resultDataList)
        recentlyResultAdapter.submitData(recentlyResultDataList)
        moreResultAdapter.submitData(moreResultDataList)
    }

    private fun goToBrowserRecommend(data: RecommendResultModel){
        val searchQuery = data.songTitle
        val encodedQuery = Uri.encode(searchQuery)
        val url = "https://www.google.com/search?q=$encodedQuery"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private fun goToBrowserRecently(data: RecentlyResultModel){
        val searchQuery = data.songTitle
        val encodedQuery = Uri.encode(searchQuery)
        val url = "https://www.google.com/search?q=$encodedQuery"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private fun goToBrowserMore(data: MoreResultModel){
        val searchQuery = data.songTitle
        val encodedQuery = Uri.encode(searchQuery)
        val url = "https://www.google.com/search?q=$encodedQuery"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}