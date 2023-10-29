package com.example.roomwordsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
private val wordViewModel: WordViewModel by viewModels {
    WordViewModelFactory((application as WordsApplication).repository)
}