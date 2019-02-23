package jp.ne.penguin.booksearch.data.repository

import io.reactivex.Single
import jp.ne.penguin.booksearch.data.entity.User
import jp.ne.penguin.booksearch.data.repository.api.BookSearchApiClient
import jp.ne.penguin.booksearch.data.repository.api.BookSearchResponse

class BookSearchRepository {
    fun login(name: String, pass: String): Single<User> {
        // TODO: キャッシュがあれば通信しない
        // TODO: キャッシュを導入するなら保存処理を挟む（Singleで返すべきかどうかも検討する）

        // APIで取得する
        return BookSearchApiClient().login(name, pass)
    }

    fun users(): Single<List<User>> {
        return BookSearchApiClient().users(getToken())
    }

    fun search(keyword: String, page: Int, genre: String): Single<BookSearchResponse> {
        return BookSearchApiClient().search(getToken(), keyword, page, genre)
    }

    private fun getToken(): String {
        return "Bearer XXX"
    }
}