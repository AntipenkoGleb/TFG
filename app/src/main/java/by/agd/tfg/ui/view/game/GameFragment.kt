package by.agd.tfg.ui.view.game

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import by.agd.tfg.R
import by.agd.tfg.adapter.game.QuestionAdapter
import by.agd.tfg.databinding.FragmentGameBinding
import by.agd.tfg.ui.viewmodels.GameViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GameFragment : Fragment(R.layout.fragment_game) {

    private val viewModel: GameViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentGameBinding.bind(view)
        binding.vpGame.isUserInputEnabled = false
        observeViewModel(binding)
    }

    private fun observeViewModel(binding: FragmentGameBinding) {
        with(viewModel) {
            questions.observe(viewLifecycleOwner, Observer {
                binding.vpGame.adapter = QuestionAdapter(it, this@GameFragment)
            })

            currentPage.observe(viewLifecycleOwner, Observer {
                binding.vpGame.currentItem = it - 1
            })
        }
    }
}