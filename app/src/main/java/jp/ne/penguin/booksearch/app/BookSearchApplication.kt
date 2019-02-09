package jp.ne.penguin.booksearch.app

import android.app.Application
import android.content.Context

class BookSearchApplication : Application() {
    init {
        instance = this
    }

    companion object {
        private var instance: BookSearchApplication? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }
}