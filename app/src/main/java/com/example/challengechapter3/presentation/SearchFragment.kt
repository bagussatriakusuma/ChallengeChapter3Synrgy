package com.example.challengechapter3.presentation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.challengechapter3.R
import com.example.challengechapter3.adapter.GenreAdapter
import com.example.challengechapter3.databinding.FragmentSearchBinding
import com.example.challengechapter3.model.GenreModel

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    companion object{
        const val EXTRAS_TITLE = "GenreTitle"
        const val GENRE_IDENTIFIER = "GenreIdentifier"
    }
    private lateinit var genreAdapter: GenreAdapter
    private lateinit var genreDataList: List<GenreModel>
    private val bundle = Bundle()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindAdapter()
        provideDataGenre()
        setSearchGenre()
    }

    private fun bindAdapter(){
        genreAdapter = GenreAdapter(object: GenreAdapter.OnClickListener {
            override fun onClickItem(data: GenreModel) {
                bundle.putString(EXTRAS_TITLE, data.genreTitle)
                bundle.putString(GENRE_IDENTIFIER, data.genreTitle)
                findNavController().navigate(R.id.action_searchFragment_to_resultFragment, bundle)
            }
        })
        StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL).apply {
            binding.rvGenre.layoutManager = this
        }
        binding.rvGenre.adapter = genreAdapter
    }

    private fun provideDataGenre(){
        genreDataList = listOf(
            GenreModel(genreTitle = "Jazz", genreImage = R.drawable.cover_jazz),
            GenreModel(genreTitle = "EDM", genreImage = R.drawable.cover_edm),
            GenreModel(genreTitle = "Techno", genreImage = R.drawable.cover_techno),
            GenreModel(genreTitle = "Future Bass", genreImage = R.drawable.cover_futurebass),
            GenreModel(genreTitle = "K-pop", genreImage = R.drawable.cover_kpop),
            GenreModel(genreTitle = "Pop", genreImage = R.drawable.cover_pop),
            GenreModel(genreTitle = "Indie", genreImage = R.drawable.cover_indie),
            GenreModel(genreTitle = "Rock", genreImage = R.drawable.cover_rock),
            GenreModel(genreTitle = "Funk", genreImage = R.drawable.cover_funk),
            GenreModel(genreTitle = "Heavy Metal", genreImage = R.drawable.cover_heavymetal),
            GenreModel(genreTitle = "Reggae", genreImage = R.drawable.cover_reggae),
            GenreModel(genreTitle = "Hard Rock", genreImage = R.drawable.cover_hardrock),
            GenreModel(genreTitle = "Rap", genreImage = R.drawable.cover_rap),
            GenreModel(genreTitle = "Folk", genreImage = R.drawable.cover_folk)
        )

        genreAdapter.submitData(genreDataList)
    }

    private fun setSearchGenre() {
        binding.etSearch.setOnEditorActionListener { _, i, _ ->
            if (i == EditorInfo.IME_ACTION_SEARCH) {
                val query = binding.etSearch.text.toString().trim()
                performSearch(query)
                true
            } else {
                false
            }
        }
    }

    private fun performSearch(query: String) {
        val filteredList = if (query.isEmpty()) {
            genreDataList
        } else {
            genreDataList.filter { genreModel ->
                genreModel.genreTitle.contains(query, ignoreCase = true)
            }
        }
        genreAdapter.submitData(filteredList)
    }
}