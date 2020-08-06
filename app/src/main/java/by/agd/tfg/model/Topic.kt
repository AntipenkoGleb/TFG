package by.agd.tfg.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Topic(
    var categoryId: Long = 0,
    var name: String = "",
    var image: String = "",
    var cost: Int = 0,
    var unlocked: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}