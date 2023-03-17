package com.example.expenseapp.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.expenseapp.R
import com.example.expenseapp.base.BaseActivity
import com.example.expenseapp.databinding.ActivityAddTranscationBinding

class AddTranscationActivity : BaseActivity<ActivityAddTranscationBinding>() {

    lateinit var binding: ActivityAddTranscationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun setView(tbinding: ActivityAddTranscationBinding) {
        binding=tbinding
    }
    override fun applyView()= R.layout.activity_add_transcation
}