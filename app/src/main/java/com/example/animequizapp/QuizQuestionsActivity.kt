package com.example.animequizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

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
    private var submitButton: Button? = null
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
        submitButton = findViewById(R.id.submitButton)

        textViewOptionOne?.setOnClickListener(this)
        textViewOptionTwo?.setOnClickListener(this)
        textViewOptionThree?.setOnClickListener(this)
        textViewOptionFour?.setOnClickListener(this)
        submitButton?.setOnClickListener(this)


        mQuestionsList = Constants.getQuestions()
        setQuestion()
    }

    private fun setQuestion() {


        mCurrentPosition = 1
        val question: Question = mQuestionsList!![mCurrentPosition - 1]
        imageViewImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        textViewProgress?.text = "$mCurrentPosition/${progressBar?.max}"
        textViewQuestion?.text = question.question
        textViewOptionOne?.text = question.optionOne
        textViewOptionTwo?.text = question.optionTwo
        textViewOptionThree?.text = question.optionThree
        textViewOptionFour?.text = question.optionFour

        if (mCurrentPosition == mQuestionsList!!.size) {
            submitButton?.text = "FINISH"
        } else {
            submitButton?.text = "SUBMIT"
        }

    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        textViewOptionOne?.let {
            options.add(0, it)
        }
        textViewOptionTwo?.let {
            options.add(1, it)
        }
        textViewOptionThree?.let {
            options.add(2, it)
        }
        textViewOptionFour?.let {
            options.add(3, it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(view: View?) {
       when(view?.id) {
           R.id.tvOptionOne -> {
               textViewOptionOne?.let {
                   selectedOptionView(it, 1)
               }
           }
           R.id.tvOptionTwo -> {
               textViewOptionTwo?.let {
                   selectedOptionView(it, 2)
               }
           }
           R.id.tvOptionThree -> {
               textViewOptionThree?.let {
                   selectedOptionView(it, 3)
               }
           }
           R.id.tvOptionFour -> {
               textViewOptionFour?.let {
                   selectedOptionView(it, 4)
               }
           }
           R.id.submitButton -> {
               // TODO "implement button submit"
           }
       }
    }
}