package com.example.project_for_compamy.domain

import androidx.lifecycle.LiveData

class GetWorkoutList(private val workoutRep: WorkoutRep) {
    fun getWorkoutList(): LiveData<List<WorkoutItem>> {
        return workoutRep.getWorkoutList()
    }
}