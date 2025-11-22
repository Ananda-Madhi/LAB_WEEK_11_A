package com.example.lab_week_11_a

import android.app.Application
import com.example.lab_week_11_a.SettingsStore




class SettingsApplication : Application() {
    lateinit var settingsStore: SettingsStore
    override fun onCreate() {
        super.onCreate()
        settingsStore = SettingsStore(this)
    }
}