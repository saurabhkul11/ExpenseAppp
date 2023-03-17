package com.example.expenseapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities =[(UserEntity::class)] ,version = 1)
abstract class UserDatabase:RoomDatabase() {

    abstract fun userDao():UserDao

    companion object {
        private var instance: UserDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): UserDatabase {
            if(instance == null)
                instance = Room.databaseBuilder(ctx,UserDatabase::class.java,"user_database")
                    .build()
            return instance!!
        }
}
}