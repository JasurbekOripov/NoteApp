package uz.juo.noteappcampose.future.data.repository

import kotlinx.coroutines.flow.Flow
import uz.juo.noteappcampose.future.data.data_source.NoteDao
import uz.juo.noteappcampose.future.domain.model.NoteEntity
import uz.juo.noteappcampose.future.domain.repository.NoteRepository

class NoteRepositoryImpl(var noteDao: NoteDao):NoteRepository {
    override fun getNotes(): Flow<List<NoteEntity>> {
        return noteDao.getNotes()
    }

    override suspend fun insertNote(noteEntity: NoteEntity) {
        noteDao.insertNote(noteEntity)
    }

    override suspend fun deleteNote(noteEntity: NoteEntity) {
        noteDao.deleteNote(noteEntity)
    }

    override suspend fun getNoteById(id: Int): NoteEntity {
       return noteDao.getNoteById(id)
    }
}