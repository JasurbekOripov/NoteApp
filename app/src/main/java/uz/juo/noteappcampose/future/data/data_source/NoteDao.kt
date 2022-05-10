package uz.juo.noteappcampose.future.data.data_source

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import uz.juo.noteappcampose.future.domain.model.NoteEntity

@Dao
interface NoteDao {
    @Query("select * from note_db")
    fun getNotes(): Flow<List<NoteEntity>>

    @Query("select * from note_db where id = :id")
    suspend fun getNoteById(id: Int): NoteEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NoteEntity)

    @Delete
    suspend fun deleteNote(note: NoteEntity)
}