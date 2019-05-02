package jp.ne.penguin.booksearch.data.entity

import com.google.gson.annotations.SerializedName

data class Favorite (
        @SerializedName("user_id")
        var userId: Int,
        var book: Book,
        @SerializedName("created_at")
        var createdAt: String,
        @SerializedName("updated_at")
        var updatedAt: String
)