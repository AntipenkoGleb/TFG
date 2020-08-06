package by.agd.tfg.ui.view.game

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.agd.tfg.R
import by.agd.tfg.databinding.ItemGameresultBinding
import by.agd.tfg.ui.viewmodels.GameViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GameResultFragment : Fragment(R.layout.item_gameresult) {

    private val viewModel: GameViewModel by viewModels({ requireParentFragment() })

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = ItemGameresultBinding.bind(view)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}