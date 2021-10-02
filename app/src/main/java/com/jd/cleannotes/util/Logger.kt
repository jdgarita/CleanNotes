package com.jd.cleannotes.util

import android.util.Log
import com.jd.cleannotes.util.Constants.DEBUG
import com.jd.cleannotes.util.Constants.TAG

var isUnitTest = false

fun printLogD(className: String?, message: String ) {
    if (DEBUG && !isUnitTest) {
        Log.d(TAG, "$className: $message")
    }
    else if(DEBUG && isUnitTest){
        println("$className: $message")
    }
}