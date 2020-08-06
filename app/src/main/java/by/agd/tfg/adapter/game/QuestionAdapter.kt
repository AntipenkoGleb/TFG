package by.agd.tfg.adapter.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import by.agd.tfg.model.Question
import by.agd.tfg.ui.view.game.GameResultFragment
import by.agd.tfg.ui.view.game.GameStartFragment
import by.agd.tfg.ui.view.game.QuestionFragment

class QuestionAdapter(
    private val questions: List<Question>,
    fragment: Fragment
) : FragmentStateAdapter(fragment) {

    private var questionId = 0

    override fun getItemCount(): Int = questions.size + 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> GameStartFragment()
            itemCount - 1 -> GameResultFragment()
            else -> QuestionFragment().apply {
                arguments = Bundle().apply { putInt("questionId", questionId++) }
            }
        }
    }

}