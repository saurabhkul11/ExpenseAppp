package com.example.expenseapp.view.activity.splash

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.expenseapp.R
import com.example.expenseapp.base.BaseActivity
import com.example.expenseapp.databinding.ActivityFutureMoneyBinding
import com.example.expenseapp.databinding.ActivitySplashBinding
import com.example.expenseapp.view.activity.MainActivity

class SplashActivity:BaseActivity<ActivitySplashBinding>() {

    lateinit var binding: ActivitySplashBinding
    override fun setView(fbinding: ActivitySplashBinding) {
        binding=fbinding
    }
    override fun applyView()= R.layout.activity_splash


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.txtSplash.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }

}