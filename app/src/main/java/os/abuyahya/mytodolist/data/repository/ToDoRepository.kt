package os.abuyahya.mytodolist.data.repository

import androidx.lifecycle.LiveData
import os.abuyahya.mytodolist.data.ToDoDao
import os.abuyahya.mytodolist.data.model.ToDoData

class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData: LiveData<List<ToDoData>> = toDoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData){
        toDoDao.insertData(toDoData)
    }

    suspend fun updateData(toDoData: ToDoData){
        toDoDao.updateData(toDoData)
    }

    suspend fun deleteItem(toDoData: ToDoData){
        toDoDao.deleteItem(toDoData)
    }

    suspend fun deleteAllData(){
        toDoDao.deleteAllData()
    }

}
