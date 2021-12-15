package com.jd.cleannotes.di

import com.jd.cleannotes.framework.presentation.TempTest
import com.jd.cleannotes.framework.presentation.TestBaseApplication
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@FlowPreview
@Singleton
@Component(
    modules = [
        TestModule::class,
        AppModule::class
    ]
)
interface TestAppComponent : AppComponent {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance app: TestBaseApplication): TestAppComponent
    }

    fun inject(tempTest: TempTest)

}
