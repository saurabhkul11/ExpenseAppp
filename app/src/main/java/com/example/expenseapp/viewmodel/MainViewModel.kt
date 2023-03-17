package com.example.expenseapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.expenseapp.repo.MainRepository
import com.example.expenseapp.room.UserEntity
import kotlinx.coroutines.launch

class MainViewModel(private val repository: MainRepository):ViewModel() {

   fun insertData(userEntity: UserEntity){
      viewModelScope.launch {
         repository.insertData(userEntity)
      }

   }

}