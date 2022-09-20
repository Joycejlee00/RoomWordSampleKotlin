package com.example.roomworldsamplekotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//represents the entity
//each property in the class represents a column in the table

//use kotlin annotations -> specific annotations to identity
// how each parts of the class relates to an entry
@Entity(tableName = "word_table") //represents an SQLite Table - Name of table
class Word(@PrimaryKey(autoGenerate = true) val id: Int, @ColumnInfo(name = "word") val word: String)  {

}

    //@PrimaryKey - each word has a key value (primary key)
    //@ColumnInfo - specifies the name of the column in the table
