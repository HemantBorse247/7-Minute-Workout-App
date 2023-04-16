package com.hemant.a7minuteworkoutapp

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel> {

        val exerciseList = ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel(1, "Jumping Jacks", R.drawable.jumping_jacks,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(2, "Wall Sit", R.drawable.wallsit,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(3, "Push Up", R.drawable.pushup,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch =
            ExerciseModel(4, "Abdominal Crunch", R.drawable.abdominal_crunch,
                isCompleted = false,
                isSelected = false
            )
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(
            5, "Step-Up onto Chair", R.drawable.step_up_onto_chair, isCompleted = false, isSelected = false
        )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(6, "Squat", R.drawable.squat,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(squat)

        val tricepsDipOnChair = ExerciseModel(
            7, "Triceps Dip On Chair", R.drawable.tricepsdips, isCompleted = false, isSelected = false
        )
        exerciseList.add(tricepsDipOnChair)

        val plank = ExerciseModel(8, "Plank", R.drawable.planks,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(
            9, "High Knees Running In Place", R.drawable.high_knees, isCompleted = false, isSelected = false
        )
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(10, "Lunges", R.drawable.lunges_exercise,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(lunges)

        val pushAndRotation = ExerciseModel(
            11, "Push up and Rotation", R.drawable.puhuprotation, isCompleted = false, isSelected = false
        )
        exerciseList.add(pushAndRotation)

        val sidePlank = ExerciseModel(12, "Side Plank", R.drawable.sideplank,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(sidePlank)

        return exerciseList
    }

}