package com.example.focusflow.presentation.dashboard

import androidx.compose.ui.graphics.Color
import com.example.focusflow.domain.model.Session
import com.example.focusflow.domain.model.Subject

data class DashboardState(
    val totalSubjectCount: Int = 0,
    val totalStudiedHours: Float = 0f,
    val totalGoalStudyHours: Float = 0f,
    val subjectList: List<Subject> = emptyList(),
    val subjectName: String = "",
    val goalStudyHours: String = "",
    val subjectCardColors: List<Color> = Subject.subjectCardColors.random(),
    val session: Session? = null
) {

}