package com.sangwon97.todo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo ( //이거는 데이타 클래스 소괄호 써야함 생성자한테 바로 적용할것
    @PrimaryKey(autoGenerate = true)
    val num:Int = 0,
    val title:String,
    val completed:Boolean = false

)