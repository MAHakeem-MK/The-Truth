package com.example.thetruth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val TOTAL_NO_QUESTIONS = 3

class MainActivity : AppCompatActivity() {
    private val randomNumbers = mutableSetOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateRandomQuestions()

        showQuestion()

        true_button.setOnClickListener {
//            checkAnswer()
            showQuestion()
        }

        false_button.setOnClickListener {
//            checkAnswer()
            showQuestion()
        }
    }

    private fun generateRandomQuestions() {
        while (randomNumbers.size < TOTAL_NO_QUESTIONS) {
            val randomNumber = (QuestionBank.questions.indices).random()
            randomNumbers.add(randomNumber)
        }
    }

    private fun showQuestion() {
        randomNumbers.pop()?.also {
            question_text.text = QuestionBank.questions[it].toString()
        } ?: run { question_text.text = "No more questions" }
    }

    private fun checkAnswer() {
        TODO("Not yet implemented")
    }

}

// Note the use of extension function.
private fun <E> MutableSet<E>.pop(): E? {
    val value = this.lastOrNull()
    this.remove(value)
    return value
}

