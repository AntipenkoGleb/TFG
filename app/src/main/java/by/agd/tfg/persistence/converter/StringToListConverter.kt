package by.agd.tfg.persistence.converter

import androidx.room.TypeConverter

class StringToListConverter {

    @TypeConverter
    fun fromList(list: List<String>) = list.joinToString(";")

    @TypeConverter
    fun toList(data: String) = data.split(";")
}