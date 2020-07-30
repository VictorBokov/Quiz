package com.example.quiz

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers" +
            ""
    fun getQustions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong?",
            R.drawable.belgium,
            "Belgium",
            "Aust",
            "Russia",
            "Germany",
            1)
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong?",
            R.drawable.brazil,
            "Ukraine",
            "France",
            "Brazil",
            "USA",
            3)
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong?",
            R.drawable.canada,
            "Canada",
            "France",
            "Brazil",
            "Germany",
            1)
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong?",
            R.drawable.finland,
            "Belgium",
            "Canada",
            "USA",
            "Finland",
            4)
        questionList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong?",
            R.drawable.france,
            "France",
            "Ukraine",
            "USA",
            "Germany",
            1)
        questionList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong?",
            R.drawable.germany,
            "France",
            "Russia",
            "USA",
            "Germany",
            4)
        questionList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong?",
            R.drawable.united_states,
            "France",
            "Russia",
            "USA",
            "Germany",
            3)
        questionList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong?",
            R.drawable.japan,
            "France",
            "USA",
            "Japan",
            "Germany",
            3)
        questionList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong?",
            R.drawable.russia,
            "Russia",
            "Ukraine",
            "USA",
            "Japan",
            1)
        questionList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong?",
            R.drawable.sweden,
            "Japan",
            "Russia",
            "Sweden",
            "Germany",
            3)
        questionList.add(que10)

        return questionList
    }
}