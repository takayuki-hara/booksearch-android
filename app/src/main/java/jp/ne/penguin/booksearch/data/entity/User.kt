package jp.ne.penguin.booksearch.data.entity

import com.google.gson.annotations.SerializedName
import java.util.*

data class User (
    var id: Int,
    var username: String,
    @SerializedName("password_digest")
    var passwordDigest: String,
    var token: String,
    var role: Int,
    var email: String,
    @SerializedName("fcm_token")
    var fcmToken: String,
    @SerializedName("enable_email_notify")
    var enableEmailNotify: Boolean,
    @SerializedName("enable_fcm_notify")
    var enableFcmNotify: Boolean,
    @SerializedName("created_at")
    var createdAt: Date,
    @SerializedName("updated_at")
    var updatedAt: Date
)