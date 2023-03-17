package com.example.expenseapp.repo

import com.example.expenseapp.room.UserDao
import com.example.expenseapp.room.UserEntity

class MainRepository(private val userDao: UserDao) {

    suspend fun insertData(userEntity: UserEntity){
        userDao.addData(userEntity)
    }

}