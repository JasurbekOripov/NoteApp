package uz.juo.noteappcampose.future.data.data_source

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import uz.juo.noteappcampose.future.domain.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun dao(): NoteDao
}