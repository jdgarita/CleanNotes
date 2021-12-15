package com.jd.cleannotes.business.interactors.notedetail

import com.jd.cleannotes.business.interactors.common.DeleteNote
import com.jd.cleannotes.framework.presentation.notedetail.state.NoteDetailViewState

// Use cases
class NoteDetailInteractors(
    val deleteNote: DeleteNote<NoteDetailViewState>,
    val updateNote: UpdateNote
)