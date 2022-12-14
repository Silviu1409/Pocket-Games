package com.example.pocketgames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pocketgames.databinding.HomePageBinding
import kotlin.system.exitProcess


class HomePage : Fragment() {
    private var _binding: HomePageBinding? = null
    private val binding get() = _binding!!

    @Override
    override fun onSaveInstanceState(outState: Bundle) {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonStart.setOnClickListener {
            findNavController().navigate(R.id.home_page_to_coin_flip_page)
        }

        binding.buttonExit.setOnClickListener {
            exitProcess(0)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}