package uz.juo.noteappcampose.future.domain.use_case

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import uz.juo.noteappcampose.future.domain.model.NoteEntity
import uz.juo.noteappcampose.future.domain.repository.NoteRepository
import uz.juo.noteappcampose.future.domain.utils.NoteOrder
import uz.juo.noteappcampose.future.domain.utils.OrderType

class DeleteNoteUseCase(private val repository: NoteRepository) {
   suspend  operator fun invoke(note: NoteEntity) {
        repository.deleteNote(note)
    }
}