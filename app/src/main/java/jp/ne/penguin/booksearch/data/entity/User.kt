package jp.ne.penguin.booksearch.data.entity

import java.util.*

data class User (
    var id: Int,
    var username: String,
    var password_digest: String,
    var token: String,
    var role: Int,
    var email: String,
    var fcm_token: String,
    var enable_email_notify: Boolean,
    var enable_fcm_notify: Boolean,
    var created_at: Date,
    var updated_at: Date
)