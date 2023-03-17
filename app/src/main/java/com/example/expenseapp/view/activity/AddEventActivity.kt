package com.example.expenseapp.view.activity

import android.os.Bundle
import android.view.LayoutInflater
import com.example.expenseapp.R
import com.example.expenseapp.base.BaseActivity
import com.example.expenseapp.databinding.ActivityAddEventBinding

class AddEventActivity :BaseActivity<ActivityAddEventBinding>(){
    lateinit var binding: ActivityAddEventBinding

    override fun setView(abinding: ActivityAddEventBinding) {
        binding=abinding
    }
    override fun applyView()= R.layout.activity_add_event

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}