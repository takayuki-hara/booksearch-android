package jp.ne.penguin.booksearch.data.repository.api

import com.google.gson.annotations.SerializedName

data class FavoriteRequestModel (
        var title: String,
        var price: Int,
        var genres: String,
        var author: String,
        var publisher: String,
        var isbn: String,
        var caption: String,
        @SerializedName("sales_date")
        var salesDate: String,
        @SerializedName("item_url")
        var itemUrl: String,
        @SerializedName("largeimage_url")
        var largeimageUrl: String
)