package com.example.expenseapp.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.expenseapp.R
import com.example.expenseapp.base.BaseActivity
import com.example.expenseapp.databinding.ActivityDetailBinding

class DetailActivity:BaseActivity<ActivityDetailBinding>() {

    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        binding.showText.setOnClickListener {
            val intent = Intent(this, RevenueActivity::class.java)
            startActivity(intent)

        }
    }

    override fun setView(dbinding: ActivityDetailBinding) {
        binding=dbinding
    }
    override fun applyView()= R.layout.activity_detail

    }

