package com.jd.cleannotes.business.interactors.notelist

import com.jd.cleannotes.business.interactors.common.DeleteNote
import com.jd.cleannotes.framework.presentation.notelist.state.NoteListViewState

// Use cases
class NoteListInteractors(
    val insertNewNote: InsertNewNote,
    val deleteNote: DeleteNote<NoteListViewState>,
    val searchNotes: SearchNotes,
    val getNumNotes: GetNumNotes,
    val restoreDeletedNote: RestoreDeletedNote,
    val deleteMultipleNotes: DeleteMultipleNotes
)