package com.jd.cleannotes.framework.presentation

import com.jd.cleannotes.di.DaggerTestAppComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

@FlowPreview
@ExperimentalCoroutinesApi
class TestBaseApplication : BaseApplication(){

    override fun initAppComponent() {
        appComponent = DaggerTestAppComponent
            .factory()
            .create(this)
    }

}