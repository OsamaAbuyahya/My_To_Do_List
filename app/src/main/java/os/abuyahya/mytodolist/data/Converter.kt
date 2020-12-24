package os.abuyahya.mytodolist.data

import androidx.room.TypeConverter
import os.abuyahya.mytodolist.data.model.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String{
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }
}
