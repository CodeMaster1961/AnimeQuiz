package com.example.animequizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionsActivity : AppCompatActivity(), OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    private var progressBar: ProgressBar? = null
    private var textViewProgress: TextView? = null
    private var textViewQuestion: TextView? = null
    private var imageViewImage: ImageView? = null

    private var textViewOptionOne: TextView? = null
    private var textViewOptionTwo: TextView? = null
    private var textViewOptionThree: TextView? = null
    private var textViewOptionFour: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        textViewProgress = findViewById(R.id.tvProgress)
        textViewQuestion = findViewById(R.id.question)
        imageViewImage = findViewById(R.id.ivImage)
        textViewOptionOne = findViewById(R.id.tvOptionOne)
        textViewOptionTwo = findViewById(R.id.tvOptionTwo)
        textViewOptionThree = findViewById(R.id.tvOptionThree)
        textViewOptionFour = findViewById(R.id.tvOptionFour)

        setQuestion()
    }

    private fun setQuestion() {
        val questionsList = Constants.getQuestions()
        Log.i("QuestionsList Size is", "${questionsList.size}")

        for (i in questionsList) {
            Log.e("Questions", i.question)
        }

        var currentPosition = 1
        val question: Question = questionsList[currentPosition - 1]
        imageViewImage?.setImageResource(question.image)
        progressBar?.progress = currentPosition
        textViewProgress?.text = "$currentPosition/${progressBar?.max}"
        textViewQuestion?.text = question.question
        textViewOptionOne?.text = question.optionOne
        textViewOptionTwo?.text = question.optionTwo
        textViewOptionThree?.text = question.optionThree
        textViewOptionFour?.text = question.optionFour
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}