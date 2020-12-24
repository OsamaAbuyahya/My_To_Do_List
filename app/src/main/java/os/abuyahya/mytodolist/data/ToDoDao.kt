package os.abuyahya.mytodolist.data

import androidx.lifecycle.LiveData
import androidx.room.*
import os.abuyahya.mytodolist.data.model.ToDoData

@Dao
interface ToDoDao {

    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllData(): LiveData<List<ToDoData>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertData(toDoData: ToDoData)

    @Update
    suspend fun updateData(toDoData: ToDoData)

    @Delete
    suspend fun deleteItem(toDoData: ToDoData)

    @Query("delete FROM todo_table")
    suspend fun deleteAllData()
}
