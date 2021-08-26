package com.example.android_viewbinding_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android_viewbinding_example.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        private var instance: MainFragment? = null
        fun getInstance(): MainFragment {
            if (instance == null) instance = MainFragment()
            return instance!!
        }
    }

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.fragmentMainTextviewIntro.text = "This is ViewBinding Example"

        return binding.root
    }

}