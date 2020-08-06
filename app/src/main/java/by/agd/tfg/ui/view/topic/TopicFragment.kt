package by.agd.tfg.ui.view.topic

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.agd.tfg.R
import by.agd.tfg.adapter.base.ItemClickListener
import by.agd.tfg.adapter.topic.TopicAdapter
import by.agd.tfg.databinding.FragmentTopicBinding
import by.agd.tfg.model.Topic
import by.agd.tfg.ui.viewmodels.TopicViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TopicFragment : Fragment(R.layout.fragment_topic) {

    private val viewModel: TopicViewModel by viewModels()

    private var binding: FragmentTopicBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTopicBinding.bind(view)

        val listener = ItemClickListener<Topic> {
            val action = TopicFragmentDirections.toGameFragment(it.id)
            findNavController().navigate(action)
        }
        val topicAdapter = TopicAdapter(listener)

        binding!!.rvTopic.apply {
            setHasFixedSize(true)
            adapter = topicAdapter
        }

        viewModel.topics.observe(this.viewLifecycleOwner, Observer {
            topicAdapter.submitList(it)
        })

    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}