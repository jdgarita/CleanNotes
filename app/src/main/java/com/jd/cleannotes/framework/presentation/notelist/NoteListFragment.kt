package com.jd.cleannotes.framework.presentation.notelist

import android.view.*
import com.jd.cleannotes.R
import com.jd.cleannotes.framework.presentation.common.BaseNoteFragment

const val NOTE_LIST_STATE_BUNDLE_KEY =
    "com.jd.cleannotes.notes.framework.presentation.notelist.state"

class NoteListFragment : BaseNoteFragment(R.layout.fragment_note_list) {

    override fun inject() {
        TODO("prepare dagger")
    }
}