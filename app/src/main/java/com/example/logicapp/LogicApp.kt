package com.example.logicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logicapp.*

class LogicApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logicapp)
        btnSubmit.setOnClickListener { checkAnswer() }
    }

    private fun checkAnswer(){
        if (et1.text.toString().capitalize() == getString(R.string.t) && et2.text.toString().capitalize() == getString(R.string.f) &&
            et3.text.toString().capitalize() == getString(R.string.f) && et4.text.toString().capitalize() == getString(R.string.t))
            onAnswerCorrect()
        else
            onAnswerIncorrect()
    }

    private fun onAnswerCorrect(){
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    private fun onAnswerIncorrect(){
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }
}
