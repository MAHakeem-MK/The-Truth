package com.example.thetruth

object QuestionBank {
    val questions = listOf<Question>(
        //note the usage of named parameter
        Question(
            questionText = "Cyclones spin in a clockwise direction in the southern hemisphere",
            answer = true
        ),
        Question(questionText = "Goldfish only have a memory of three seconds", answer = false),
        Question(questionText = "The capital of Libya is Benghazi", answer = false),
        Question(questionText = "An octopus has five hearts", answer = false),
        Question(questionText = "The highest mountain in England is Ben Nevis", answer = false),
        Question(
            questionText = "The mathematical name for the shape of a Pringle is hyperbolic paraboloid",
            answer = true
        ),
        Question(
            questionText = "Charlie Chaplin came first in a Charlie Chaplin look-alike contest",
            answer = false
        ),
        Question(questionText = "The Statue of Liberty was a gift from France", answer = true),
        Question(questionText = "The Great Wall of China is visible from space", answer = false),
        Question(questionText = "The first tea bags were made of silk", answer = true),
        Question(questionText = "A metre is further than a yard", answer = true),
        Question(questionText = "The currency of France is the Franc", answer = false)
    )
}