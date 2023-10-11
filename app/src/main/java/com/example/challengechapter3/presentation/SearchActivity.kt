package com.example.challengechapter3.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import com.example.challengechapter3.R
import com.example.challengechapter3.adapter.GenreAdapter
import com.example.challengechapter3.databinding.ActivitySearchBinding
import com.example.challengechapter3.model.GenreModel

class SearchActivity : AppCompatActivity() {
    companion object{
        const val EXTRAS_TITLE = "GenreTitle"
        const val GENRE_IDENTIFIER = "GenreIdentifier"
    }
    private lateinit var binding: ActivitySearchBinding
    private lateinit var genreAdapter: GenreAdapter
    private lateinit var genreDataList: List<GenreModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindAdapter()
        provideDataGenre()
        setSearchGenre()
    }

    private fun bindAdapter(){
        genreAdapter = GenreAdapter(object: GenreAdapter.OnClickListener {
            override fun onClickItem(data: GenreModel) {
                val intent = Intent(this@SearchActivity, ResultActivity::class.java)
                intent.putExtra(EXTRAS_TITLE, data.genreTitle)
                intent.putExtra(GENRE_IDENTIFIER, data.genreTitle)
                startActivity(intent)
            }
        })
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