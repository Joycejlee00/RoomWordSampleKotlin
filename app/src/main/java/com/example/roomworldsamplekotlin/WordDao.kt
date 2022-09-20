package com.example.roomworldsamplekotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
    @Query("SELECT * FROM word_table ORDER BY word ASC") //returns a list of words in ascending order
    fun getAlphabetizedWords(): Flow<List<Word>> //get all the words and have it return a list of words

    @Insert(onConflict = OnConflictStrategy.IGNORE) //Ignores a new word if its the same as one in the list
    suspend fun insert(word: Word)
    //declares a suspend function to insert one word

    @Query("DELETE FROM word_table") //requires you to provide SQL query as a string param.
    suspend fun deleteAll() // declares a suspend function to delete all the words
}