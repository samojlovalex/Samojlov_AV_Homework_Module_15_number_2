package com.example.samojlov_av_homework_module_15_number_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.samojlov_av_homework_module_15_number_2.databinding.ActivitySafetyBinding
import com.example.samojlov_av_homework_module_15_number_2.fragments.SignUpFragment

class SafetyActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySafetyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySafetyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_safety)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.safetyContainerID)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        init()
    }
    private fun init(){
        supportFragmentManager.beginTransaction()
            .add(R.id.safetyContainerID, SignUpFragment())
            .commit()
    }
}