package com.jd.cleannotes.business.domain.util

import com.google.firebase.Timestamp
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DateUtil @Inject constructor(private val dateFormat: SimpleDateFormat) {

    // date format: "2021-07-23 HH:mm:ss
    // 2021-07-23

    fun removeTimeFromDateString(sd: String) =
        sd.substring(0, sd.indexOf(" "))

    fun convertFirebaseTimestampToStringDate(timestamp: Timestamp): String =
        dateFormat.format(timestamp.toDate())

    fun convertStringDateToFirebaseTimestamp(date: String) =
        Timestamp(dateFormat.parse(date))

    fun getCurrentTimestamp(): String = dateFormat.format(Date())
}