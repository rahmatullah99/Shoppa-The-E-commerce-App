package com.shopping.shoppa.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.shopping.shoppa.db.Card.CardDao
import com.shopping.shoppa.db.Card.CardEntity

@Database(entities = [ProductEntity::class,CardEntity::class], version = 1,exportSchema = false)
abstract class AppDatabase:RoomDatabase() {

    abstract fun productDao(): ProductDao
    abstract fun cardDao(): CardDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(AppDatabase::class) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}