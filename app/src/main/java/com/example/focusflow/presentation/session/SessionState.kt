package com.example.focusflow.presentation.session

import com.example.focusflow.domain.model.Session
import com.example.focusflow.domain.model.Subject


data class SessionState(
    val subjects: List<Subject> = emptyList(),
    val sessions: List<Session> = emptyList(),
    val relatedToSubject: String? = null,
    val subjectId: Int? = null,
    val session: Session? = null
)