package by.agd.tfg.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Category(
    var name: String = "",
    var image: String = ""
) {
    @PrimaryKey(autoGenerate = false)
    var id: Long = 0
}