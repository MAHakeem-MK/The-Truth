package com.example.thetruth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val TOTAL_NO_QUESTIONS = 3

class MainActivity : AppCompatActivity() {
    private val randomNumbers = mutableSetOf<Int>()
    private var currentQuestion: Question? = null
    private var noOfRight = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateRandomQuestions()

        showQuestion()

        true_button.setOnClickListener {
            checkAnswer(true)
            showQuestion()
        }

        false_button.setOnClickListener {
            checkAnswer(false)
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
            currentQuestion = QuestionBank.questions[it]
            question_text.text = currentQuestion.toString()
        } ?: run {
            question_text.text = "No more questions"
            currentQuestion = null
        }
    }

    private fun checkAnswer(selectedOption: Boolean) {
        currentQuestion?.let {
            if (it.answer == selectedOption) {
                noOfRight++
            }
        }
        showScore()
    }

    private fun showScore() {
        // note the use of string template.
        score_text.text = "${noOfRight.toString()}/$TOTAL_NO_QUESTIONS"
    }
}

// Note the use of extension function.
private fun <E> MutableSet<E>.pop(): E? {
    val value = this.lastOrNull()
    this.remove(value)
    return value
}

