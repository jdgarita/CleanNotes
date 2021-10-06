package com.jd.cleannotes.business.data.cache.implementation

import com.jd.cleannotes.business.data.cache.abstraction.NoteCacheDataSource
import com.jd.cleannotes.business.domain.model.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteCacheDataSourceImpl
@Inject
constructor(
    private val noteDaoService: NoteDaoService
) : NoteCacheDataSource {

    override suspend fun insertNote(note: Note) = noteDaoService.insertNote(note)

    override suspend fun deleteNote(primaryKey: String) =
        noteDaoService.deleteNote(primaryKey)

    override suspend fun deleteNotes(notes: List<Note>) = noteDaoService.deleteNotes(notes)

    override suspend fun updateNote(
        primaryKey: String,
        newTitle: String,
        newBody: String?
    ) = noteDaoService.updateNote(primaryKey, newTitle, newBody)

    override suspend fun searchNotes(
        query: String,
        filterAndOrder: String,
        page: Int
    ): List<Note> {
        TODO("Check filterAndOrder and make query")
    }

    override suspend fun searchNoteById(id: String) = noteDaoService.searchNoteById(id)

    override suspend fun getNumNotes() = noteDaoService.getNumNotes()

    override suspend fun insertNotes(notes: List<Note>) =
        noteDaoService.insertNotes(notes)
}