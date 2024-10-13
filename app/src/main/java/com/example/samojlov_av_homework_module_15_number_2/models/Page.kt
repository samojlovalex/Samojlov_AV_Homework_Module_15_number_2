package com.example.samojlov_av_homework_module_15_number_2.models

import com.example.samojlov_av_homework_module_15_number_2.R
import java.io.Serializable

data class Page(val text: String, val image: Int, val checkButton: Boolean): Serializable {
    companion object {
        val pageList = mutableListOf(
            Page("Безопасность ваших вкладов - наш главный приоритет", R.drawable.one, true),
            Page(
                "Работа в нашем банке - это постоянное развитие профессинальных и коммуникационных навыков",
                R.drawable.two, true
            ),
            Page("Прибыль ваших вкладов гарантирована", R.drawable.three, false)
        )
    }
}