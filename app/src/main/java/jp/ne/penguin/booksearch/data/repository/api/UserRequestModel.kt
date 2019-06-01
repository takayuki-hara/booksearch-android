package jp.ne.penguin.booksearch.data.repository.api

import com.google.gson.annotations.SerializedName

data class UserRequestModel (
        var username: String,
        var password: String,
        @SerializedName("password_confirmation")
        var passwordConfirmation: String,
        var email: String,
        @SerializedName("fcm_token")
        var fcmToken: String,
        @SerializedName("enable_email_notify")
        var enableEmailNotify: Boolean,
        @SerializedName("enable_fcm_notify")
        var enableFcmNotify: Boolean
)