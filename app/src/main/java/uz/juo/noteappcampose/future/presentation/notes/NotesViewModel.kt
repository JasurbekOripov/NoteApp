package uz.juo.noteappcampose.future.presentation.notes

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.juo.noteappcampose.future.domain.use_case.DeleteNoteUseCase
import uz.juo.noteappcampose.future.domain.use_case.NoteUseCases
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(private val noteUseCase: NoteUseCases):ViewModel()
{

}