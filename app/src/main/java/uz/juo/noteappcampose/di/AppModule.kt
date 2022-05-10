package uz.juo.noteappcampose.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.juo.noteappcampose.future.data.data_source.NoteDataBase
import uz.juo.noteappcampose.future.data.repository.NoteRepositoryImpl
import uz.juo.noteappcampose.future.domain.repository.NoteRepository
import uz.juo.noteappcampose.future.domain.use_case.DeleteNoteUseCase
import uz.juo.noteappcampose.future.domain.use_case.GetNotesUseCase
import uz.juo.noteappcampose.future.domain.use_case.NoteUseCases
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDataBase(app: Application): NoteDataBase {
        return Room.databaseBuilder(app.baseContext, NoteDataBase::class.java, "juo_note_db")
//            .allowMainThreadQueries()
//            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideNoterepository(db: NoteDataBase): NoteRepository {
        return NoteRepositoryImpl(db.dao())
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            GetNotesUseCase(repository = repository),
            DeleteNoteUseCase(repository = repository)
        )
    }
}