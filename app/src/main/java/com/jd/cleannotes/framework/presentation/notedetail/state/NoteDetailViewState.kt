package com.jd.cleannotes.framework.presentation.notedetail.state

import android.os.Parcelable
import com.jd.cleannotes.business.domain.model.Note
import com.jd.cleannotes.business.domain.state.ViewState
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NoteDetailViewState(

    var note: Note? = null,

    var isUpdatePending: Boolean? = null

) : Parcelable, ViewState

