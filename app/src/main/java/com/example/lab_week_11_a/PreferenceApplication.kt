package com.example.lab_week_11_a

import android.app.Application
import android.content.Context
import com.example.lab_week_11_a.PreferenceWrapper


class PreferenceApplication : Application() {
    lateinit var preferenceWrapper: PreferenceWrapper
    override fun onCreate() {
        super.onCreate()

        preferenceWrapper = PreferenceWrapper(
            getSharedPreferences(
                "prefs",
                Context.MODE_PRIVATE

                )
        )
    }
}
