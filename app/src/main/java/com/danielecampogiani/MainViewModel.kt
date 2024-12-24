package com.danielecampogiani

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
internal class MainViewModel
    @Inject
    constructor(
        private val builder: StateBuilder,
    ) : ViewModel() {
        fun viewState(): StateFlow<ViewState> = MutableStateFlow(ViewState(data = builder.build())).asStateFlow()
    }
