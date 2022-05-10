package uz.juo.noteappcampose.future.presentation.notes

import uz.juo.noteappcampose.future.domain.model.NoteEntity
import uz.juo.noteappcampose.future.domain.utils.NoteOrder
import uz.juo.noteappcampose.future.domain.utils.OrderType

data class NotesState(
    val notes: List<NoteEntity> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionvisible: Boolean = false
)