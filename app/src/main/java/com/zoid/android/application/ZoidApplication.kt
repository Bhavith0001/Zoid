package com.zoid.android.application

import android.app.Application
import com.google.android.material.color.DynamicColors

class ZoidApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}