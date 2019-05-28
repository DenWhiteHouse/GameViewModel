package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore : Int) : ViewModel(){

    private val _eventPlayAgainButtonPressed = MutableLiveData<Boolean>()
    val eventPlayAgainButtonPressed: LiveData<Boolean>
        get()= _eventPlayAgainButtonPressed

    private val _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    init{
        _eventPlayAgainButtonPressed.value = false
        _score.value = finalScore
    }

    fun onPlayAgainPressed(){
        _eventPlayAgainButtonPressed.value = true
    }
}