package com.example.expenseapp.view.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.expenseapp.R
import com.example.expenseapp.base.BaseActivity
import com.example.expenseapp.databinding.ActivityMainBinding
import com.example.expenseapp.factory.MainFactory
import com.example.expenseapp.model.TranscationData
import com.example.expenseapp.repo.MainRepository
import com.example.expenseapp.room.UserDatabase
import com.example.expenseapp.room.UserEntity
import com.example.expenseapp.viewmodel.MainViewModel


class MainActivity : BaseActivity<ActivityMainBinding>() {

    lateinit var binding: ActivityMainBinding
     lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dao=UserDatabase.getInstance(this).userDao()
        viewModel=ViewModelProvider(this,MainFactory(MainRepository(dao))).get(MainViewModel::class.java)

        binding.btnContinue.setOnClickListener {
            viewModel.insertData(UserEntity(0,binding.edttextName.text.toString(), binding.edttextBudget.text.toString(), binding.edttextIncome.text.toString()))
            val intent=Intent(this, FutureMoneyActivity::class.java)
            startActivity(intent)
        }
    }


//    private fun validForm(name:String,budget:String,income:String):Boolean{
//        if(binding.edttextBudget.text==null || binding.edttextIncome==null || binding.edttextName==null) {
//            Toast.makeText(this, "Field cannot be empty", Toast.LENGTH_SHORT).show()
//            return false
//        }
//            return true
//    }

    override fun applyView(): Int= R.layout.activity_main
    override fun setView(mbinding: ActivityMainBinding) {
        binding=mbinding
    }
}