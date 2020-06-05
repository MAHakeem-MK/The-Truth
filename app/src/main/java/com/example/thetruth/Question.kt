package com.example.thetruth

// note the usage of data class representing question and corresponding True or False answer.
data class Question(val questionText: String, val answer: Boolean) {
    override fun toString(): String = questionText
}