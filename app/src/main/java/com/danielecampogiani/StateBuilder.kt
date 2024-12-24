package com.danielecampogiani

import arrow.core.NonEmptyList
import arrow.core.nonEmptyListOf
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Inject

internal fun interface StateBuilder {
    fun build(): NonEmptyList<String>
}

internal class StateBuilderImpl
    @Inject
    constructor() : StateBuilder {
        override fun build(): NonEmptyList<String> = nonEmptyListOf("A", "B", "C")
    }

@Module
@InstallIn(ViewModelComponent::class)
internal interface StateBuilderImplModule {
    @Binds
    fun stateBuilder(`impl`: StateBuilderImpl): StateBuilder
}
