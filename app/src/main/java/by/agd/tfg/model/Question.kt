package by.agd.tfg.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import by.agd.tfg.persistence.converter.StringToListConverter

@Entity
@TypeConverters(StringToListConverter::class)
data class Question(
    var topicId: Long = 0L,
    var text: String = "",
    var image: String = "",
    var difficult: Int = 0,
    var wrong: List<String> = emptyList(),
    var correct: String = "",
    var answered: Int = 0
) {
    @PrimaryKey(autoGenerate = false)
    var id: Long = 0L

    @Ignore
    private var shuffledAnswers: List<Pair<String, Boolean>>? = null

    private fun getShuffledAnswers(): List<Pair<String, Boolean>> {
        return if (shuffledAnswers != null) shuffledAnswers!!
        else {
            val wrong = wrong.map { it to false }
            val correct = correct to true
            shuffledAnswers = (wrong + correct).shuffled()
            shuffledAnswers!!
        }
    }

    fun getAnswer(position: Int): Pair<String, Boolean> {
        return getShuffledAnswers()[position]
    }

    fun getCorrectAnswerId(): Int {
        return shuffledAnswers?.indexOfFirst { it.second } ?: 0
    }
}

