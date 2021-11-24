package com.jd.cleannotes.di

import com.jd.cleannotes.business.data.cache.FakeNoteCacheDataSourceImpl
import com.jd.cleannotes.business.data.cache.abstraction.NoteCacheDataSource
import com.jd.cleannotes.business.data.network.FakeNoteNetworkDataSourceImpl
import com.jd.cleannotes.business.data.network.abstraction.NoteNetworkDataSource
import com.jd.cleannotes.business.domain.model.NoteFactory
import com.jd.cleannotes.business.domain.util.DateUtil
import com.jd.cleannotes.util.isUnitTest
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap

class DependencyContainer {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", Locale.ENGLISH)
    val dateUtil = DateUtil(dateFormat)
    lateinit var noteNetworkDataSource: NoteNetworkDataSource
    lateinit var noteCacheDataSource: NoteCacheDataSource
    lateinit var noteFactory: NoteFactory

    init {
        isUnitTest = true // for Logger.kt
    }

    fun build() {
        noteFactory = NoteFactory(dateUtil)
        noteNetworkDataSource = FakeNoteNetworkDataSourceImpl(
            notesData = HashMap(),
            deletedNotesData = HashMap()
        )
        noteCacheDataSource = FakeNoteCacheDataSourceImpl(
            notesData = HashMap(),
            dateUtil = dateUtil
        )
    }
}