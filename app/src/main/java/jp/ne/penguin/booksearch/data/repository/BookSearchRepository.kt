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

    fun getUsers(): Single<List<User>> {
        return BookSearchApiClient().getUsers()
    }

    fun getMe(): Single<User> {
        return BookSearchApiClient().getMe()
    }

    fun getUser(id: Int): Single<User> {
        return BookSearchApiClient().getUser(id)
    }

    fun createUser(name: String, pass: String, email: String, enableEmail: Boolean, enableFcm: Boolean): Single<User> {
        return BookSearchApiClient().createUser(name, pass, email, enableEmail, enableFcm)
    }

    fun updateUser(userId: Int, name: String, pass: String, email: String, enableEmail: Boolean, enableFcm: Boolean): Single<User> {
        return BookSearchApiClient().updateUser(userId, name, pass, email, enableEmail, enableFcm)
    }

    fun deleteUser(userId: Int): Single<String> {
        return BookSearchApiClient().deleteUser(userId)
    }

    fun search(keyword: String, page: Int, genre: String): Single<BookSearchResponse> {
        return BookSearchApiClient().search(keyword, page, genre)
    }

}