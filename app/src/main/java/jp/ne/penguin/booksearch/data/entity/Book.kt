package jp.ne.penguin.booksearch.data.entity

import com.google.gson.annotations.SerializedName

data class Book (
        var id: Int?,
        var title: String,
        var price: Int,
        var genres: String,     // TODO: ここはサーバー側を直したほうが良さそう
        var author: String?,
        var publisher: String?,
        var isbn: String?,
        var caption: String?,
        @SerializedName("sales_date")
        var salesDate: String?,
        @SerializedName("item_url")
        var itemUrl: String?,
        @SerializedName("largeimage_url")
        var largeimageUrl: String?,
        @SerializedName("created_at")
        var createdAt: String?,
        @SerializedName("updated_at")
        var updatedAt: String?
)