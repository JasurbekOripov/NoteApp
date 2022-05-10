package uz.juo.noteappcampose.future.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.juo.noteappcampose.future.domain.model.NoteEntity

interface NoteRepository {

    fun getNotes(): Flow<List<NoteEntity>>

    suspend fun insertNote(noteEntity: NoteEntity)

    suspend fun deleteNote(noteEntity: NoteEntity)

    suspend fun getNoteById(id: Int):NoteEntity

}