package com.example.otaqtk.ui.edit_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.otaqtk.R
import com.example.otaqtk.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_edit_profile )
        binding.lifecycleOwner = this


        initListeners()
    }

    private fun initListeners() {
        binding.buttonBackEditProfile.setOnClickListener {
            finish()
        }
    }
}