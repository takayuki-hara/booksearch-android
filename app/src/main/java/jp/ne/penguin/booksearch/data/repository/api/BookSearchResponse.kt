package jp.ne.penguin.booksearch.data.repository.api

import com.google.gson.annotations.SerializedName
import jp.ne.penguin.booksearch.data.entity.Book

data class BookSearchResponse (
        var count: Int,
        var page: Int,
        var first: Int,
        var last: Int,
        var hits: Int,
        var carrier: Int,
        var pageCount: Int,
        @SerializedName("Items")
        var items: List<Book>?
 )