package com.example.samojlov_av_homework_module_15_number_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.samojlov_av_homework_module_15_number_2.R
import com.example.samojlov_av_homework_module_15_number_2.databinding.FragmentSignInBinding

@Suppress("DEPRECATION")
class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding
    private lateinit var userNameSignInET: EditText
    private lateinit var passwordSignInET: EditText
    private lateinit var loginSignInBT: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        userNameSignInET = binding.userNameSignInET
        passwordSignInET = binding.passwordSignInET
        loginSignInBT = binding.loginSignInBT

        val name = arguments?.getString("name")
        val password = arguments?.getString("password")

        loginSignInBT.setOnClickListener {
            if (name != userNameSignInET.text.toString() ||
                password != passwordSignInET.text.toString()
            ) {
                Toast.makeText(
                    context,
                    getString(R.string.loginSignInBT_Check_Toast), Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            } else{
                fragmentManager?.beginTransaction()?.replace(R.id.safetyContainerID, LastFragment())?.commit()
            }
        }
    }
}