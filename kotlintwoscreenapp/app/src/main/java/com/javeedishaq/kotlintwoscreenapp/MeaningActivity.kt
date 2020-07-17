package com.javeedishaq.kotlintwoscreenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_meaning.*

class MeaningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meaning)
        val word = intent.getStringExtra(KEY_WORD)
        title = word

        meaning.text = when(word){
            getString(R.string.petrichor_word) ->
                getString(R.string.petrichor_meaning)
            getString(R.string.defenestrate_word) ->
                getString(R.string.defenestrate_meaning)
            else -> getString(R.string.unknow_word)
        }
    }

    companion object {
        const val KEY_WORD = "word"
    }
}