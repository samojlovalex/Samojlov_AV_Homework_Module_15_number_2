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
import com.example.samojlov_av_homework_module_15_number_2.databinding.FragmentSignUpBinding

@Suppress("DEPRECATION")
class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    private lateinit var userNameSignUpET: EditText
    private lateinit var passwordSignUpET: EditText
    private lateinit var loginSignUpBT: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        userNameSignUpET = binding.userNameSignUpET
        passwordSignUpET = binding.passwordSignUpET
        loginSignUpBT = binding.loginSignUpBT

        loginSignUpBT.setOnClickListener {
            val userNameSignUp = userNameSignUpET.text.toString()
            val passwordSignUp = passwordSignUpET.text.toString()
            if (passwordSignUp.isEmpty() || userNameSignUp.isEmpty()) {
                Toast.makeText(
                    context,
                    getString(R.string.buttonSignUpCheck_Toast), Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            }
            val bundle = Bundle()
            val signInFragment = SignInFragment()
            bundle.putString("name", userNameSignUp)
            bundle.putString("password", passwordSignUp)
            signInFragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.safetyContainerID, signInFragment)?.commit()
            Toast.makeText(
                context,
                getString(R.string.buttonSignUp_TransactionToast), Toast.LENGTH_LONG
            ).show()
        }
    }
}