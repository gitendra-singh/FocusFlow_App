package com.example.focusflow.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.focusflow.domain.model.Session
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {

    @Insert
    suspend fun insertSession(session: Session)

    @Delete
    suspend fun deleteSession(session: Session)

    @Query("SELECT * FROM Session")
    fun getAllSessions(): Flow<List<Session>>

    @Query("SELECT * FROM Session WHERE sessionSubjectsId = :subjectId")
    fun getRecentSessionSubject(subjectId: Int): Flow<List<Session>>

    @Query("SELECT SUM(duration) FROM Session")
    fun getTotalSessionDuration(): Flow<Long>

    @Query("SELECT SUM(duration) FROM Session WHERE sessionSubjectsId = :subjectId")
    fun getTotalSessionsDurationBySubject(subjectId: Int): Flow<Long>

    @Query("DELETE FROM Session WHERE sessionSubjectsId = :subjectId")
    fun deleteSessionsBySubjectId(subjectId: Int)
}