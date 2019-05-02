package jp.ne.penguin.booksearch.data.entity

import com.google.gson.annotations.SerializedName
import java.util.*

data class Keyword (
        var id: Int,
        @SerializedName("user_id")
        var userId: String,
        var keyword: String,
        var genre: String,
        @SerializedName("item_count")
        var itemCount: Int,
        @SerializedName("created_at")
        var createdAt: Date,
        @SerializedName("updated_at")
        var updatedAt: Date
)