package by.agd.tfg.utils

import android.widget.Button
import androidx.databinding.BindingAdapter
import by.agd.tfg.model.Question

@BindingAdapter(
    "answer:question",
    "answer:answered",
    "answer:buttonId",
    "answer:answerId",
    "answer:backgroundColor",
    "answer:wrongAnswerColor",
    "answer:correctAnswerColor",
    requireAll = true
)
fun answerButton(
    button: Button,
    question: Question,
    answered: Boolean,
    buttonId: Int,
    answerId: Int,
    backgroundColor: Int,
    wrongAnswerColor: Int,
    correctAnswerColor: Int
) {
    with(button) {
        val color = if (answered) {
            if (answerId == buttonId) {
                if (answerId == question.getCorrectAnswerId()) correctAnswerColor
                else wrongAnswerColor
            } else if (buttonId == question.getCorrectAnswerId()) correctAnswerColor
            else backgroundColor
        } else backgroundColor

        setBackgroundColor(color)
        text = question.getAnswer(buttonId).first
        isEnabled = !answered
    }
}
