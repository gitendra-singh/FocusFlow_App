package com.example.focusflow.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.focusflow.domain.model.Session
import com.example.focusflow.domain.model.Subject
import com.example.focusflow.domain.model.Task

@Database(
    entities = [Subject::class, Session::class, Task::class],
    version = 2
)
@TypeConverters(ColorListConverter::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun subjectDao(): SubjectDao

    abstract fun taskDao(): TaskDao

    abstract fun sessionDao(): SessionDao

}