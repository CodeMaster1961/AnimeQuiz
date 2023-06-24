package com.example.animequizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionText = "What is the name of this Anime Character ?"
        val questionsList = ArrayList<Question>()
        val question1 = Question(
            1, questionText,
            R.drawable.ic_character_of_ichigo,
            "Naruto", "Ichigo", "Goku", "Aizen",
            2

        )
        questionsList.add(question1)

        val question2 = Question(
            2, questionText,
            R.drawable.ic_character_of_aizen,
            "Ywhach", "Ichigo", "Itachi", "Aizen",
            4
        )

        questionsList.add(question2)


        val question3 = Question(
            3, questionText,
            R.drawable.ic_character_of_itachi,
            "Itachi", "Sasuke", "Hashirama", "Madara",
            1
        )

        questionsList.add(question3)


        val question4 = Question(
            4, questionText,
            R.drawable.ic_character_of_ulquiorra,
            "Unohana", "Kenpachi", "Ulquiorra", "Grimmjow",
            3
        )

        questionsList.add(question4)

        val question5 = Question(
            5, questionText,
            R.drawable.ic_character_of_whitebeard,
            "Luffy", "Zoro", "Kaido", "Whitebeard",
            4
        )

        questionsList.add(question5)

        val question6 = Question(
            6, questionText,
            R.drawable.ic_character_of_luffy,
            "Zoro", "Shanks", "Luffy", "Imu",
            3
        )

        questionsList.add(question6)

        val question7 = Question(
            7, questionText,
            R.drawable.ic_character_of_eren,
            "Mikasa", "Eren", "Reiner", "Levi",
            2
        )

        questionsList.add(question7)


        val question8 = Question(
            8, questionText,
            R.drawable.ic_character_of_ace,
            "Ace", "Marco", "Tanjiro", "Big Mom",
            1
        )

        questionsList.add(question8)


        val question9 = Question(
            9, questionText,
            R.drawable.ic_character_of_urahara,
            "Jugram", "Yamamoto", "Urahara", "Rukia",
            3
        )

        questionsList.add(question9)

        val question10 = Question(
            10, questionText,
            R.drawable.ic_character_of_goku,
            "Goku", "Vegeta", "Beerus", "Jiren",
            1
        )

        questionsList.add(question10)

        return questionsList


    }

}