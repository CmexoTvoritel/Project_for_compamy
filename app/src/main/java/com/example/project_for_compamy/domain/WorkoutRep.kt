package com.example.project_for_compamy.domain

import androidx.lifecycle.LiveData

interface WorkoutRep {

    fun getWorkoutList(): LiveData<List<WorkoutItem>>

}