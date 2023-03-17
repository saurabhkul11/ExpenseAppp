package com.example.expenseapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewDataBinding>:AppCompatActivity(){

    private lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, applyView())
        setView(binding)
    }

    open fun showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    abstract fun setView(binding: VB)
    abstract fun applyView():Int
}