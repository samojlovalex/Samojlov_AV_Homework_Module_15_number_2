package com.example.samojlov_av_homework_module_15_number_2.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.samojlov_av_homework_module_15_number_2.SafetyActivity
import com.example.samojlov_av_homework_module_15_number_2.models.Page
import com.example.samojlov_av_homework_module_15_number_2.databinding.FragmentStartBinding


@Suppress("DEPRECATION")
class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private lateinit var startInfoTextViewTV: TextView
    private lateinit var startImageIV: ImageView
    private lateinit var startButtonBT: Button
    private var check = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        startInfoTextViewTV = binding.startInfoTextViewTV
        startImageIV = binding.startImageIV
        startButtonBT = binding.startButtonBT

        val viewPagerItem = arguments?.getSerializable("vp") as Page

        startInfoTextViewTV.text = viewPagerItem.text
        startImageIV.setImageResource(viewPagerItem.image)
        check = viewPagerItem.checkButton

        if (!check) {
            startButtonBT.visibility = View.VISIBLE
            startButtonBT.setOnClickListener {
                startActivity(Intent(activity,SafetyActivity::class.java))
            }
        }
    }
}