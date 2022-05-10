package uz.juo.noteappcampose.future.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.juo.noteappcampose.ui.theme.*
import java.sql.Timestamp

@Entity(tableName = "note_db")
data class NoteEntity(
    var title: String,
    val content: String,
    var timestamp: Long,
    var color: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int
) {
    companion object {
        var noteColors = listOf(Red, Green, Blue, Orange, Yellow)
    }
}
