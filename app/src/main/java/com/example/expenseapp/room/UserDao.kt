package com.example.expenseapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    suspend fun addData(userEntity: UserEntity)

    @Query("select * from DATA")
     fun getData():List<UserEntity>


}