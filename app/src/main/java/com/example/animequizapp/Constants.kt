package com.example.animequizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val question1 = Question(
            1, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_ichigo,
            "Naruto", "Ichigo", "Goku", "Aizen",
            2

        )
        questionsList.add(question1)

        val question2 = Question(
            2, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_aizen,
            "Ywhach", "Ichigo", "Itachi", "Aizen",
            4
        )

        questionsList.add(question2)


        val question3 = Question(
            3, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_itachi,
            "Itachi", "Sasuke", "Hashirama", "Madara",
            1
        )

        questionsList.add(question3)


        val question4 = Question(
            4, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_ulquiorra,
            "Unohana", "Kenpachi", "Ulquiorra", "Grimmjow",
            3
        )

        questionsList.add(question4)

        val question5 = Question(
            5, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_whitebeard,
            "Luffy", "Zoro", "Kaido", "Whitebeard",
            4
        )

        questionsList.add(question5)

        val question6 = Question(
            6, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_luffy,
            "Zoro", "Shanks", "Luffy", "Imu",
            3
        )

        questionsList.add(question6)

        val question7 = Question(
            7, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_eren,
            "Mikasa", "Eren", "Reiner", "Levi",
            2
        )

        questionsList.add(question7)


        val question8 = Question(
            8, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_ace,
            "Ace", "Marco", "Tanjiro", "Big Mom",
            1
        )

        questionsList.add(question8)


        val question9 = Question(
            9, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_urahara,
            "Jugram", "Yamamoto", "Urahara", "Rukia",
            3
        )

        questionsList.add(question9)

        val question10 = Question(
            10, "What is the name of this Anime Character ?",
            R.drawable.ic_character_of_goku,
            "Goku", "Vegeta", "Beerus", "Jiren",
            1
        )

        questionsList.add(question10)

        val question11 = Question(
            11, "What is the schrift of Ywhach ?",
            R.drawable.ic_character_of_ywhach,
            "The Visionary", "The Balance", "The Almighty", "The Fear",
            3
        )

        questionsList.add(question11)

        val question12 = Question(
            12, "What is the zanpakuto name of Ichigo ?",
            R.drawable.ic_character_of_ichigo,
            "Zangetsu", "Kyokasuigetsu", "Hyorinmaru", "Zabimaru",
            1
        )

        questionsList.add(question12)


        val question13 = Question(
            13, "What is the name of ichigo's bankai",
            R.drawable.ic_character_of_ichigobankai,
            "Minazuki", "Hakka no Togame", "Tensa Zangetsu", "Senbonzakura Kageyoshi",
            3
        )

        questionsList.add(question13)


        val question14 = Question(
            14, "What is this eye called ?",
            R.drawable.ic_eye_of_mangekyousharingan,
            "Tenseigan", "Mangekyou Sharingan", "Rinnegan", "Byakugan",
            2
        )

        questionsList.add(question14)


        val question15 = Question(
            15, "What is this eye called ?",
            R.drawable.ic_eye_of_rinnegan,
            "Rinnegan", "Sharingan", "Mangekyou Sharingan", "Tenseigan",
            1
        )

        questionsList.add(question15)


        val question16 = Question(
            16, "What is the schrift of Gremmy ?",
            R.drawable.ic_character_of_gremmy,
            "The Visionary", "The Almighty", "The Heat", "The Balance",
            1
            )

        questionsList.add(question16)


        val question17 = Question(
            17, "What is the schrift of Jugram ?",
            R.drawable.ic_character_of_jugram,
            "The Visionary", "The Iron", "The Fear", "The Balance",
            4
        )

        questionsList.add(question17)

        return questionsList


    }

}