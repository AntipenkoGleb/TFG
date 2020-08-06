package by.agd.tfg.ui.view.game

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.agd.tfg.R
import by.agd.tfg.databinding.ItemQuestionBinding
import by.agd.tfg.ui.viewmodels.GameViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuestionFragment : Fragment(R.layout.item_question) {

    private val gameViewModel: GameViewModel by viewModels({ requireParentFragment() })

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = ItemQuestionBinding.bind(view)
        binding.apply {
            lifecycleOwner = this@QuestionFragment
            viewModel = gameViewModel
        }
    }
}
