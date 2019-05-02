package jp.ne.penguin.booksearch.data.repository.api

import io.reactivex.Single
import jp.ne.penguin.booksearch.data.entity.User
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class BookSearchApiClient {
    val service by lazy {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BookSearchService.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        retrofit.create(BookSearchService::class.java)
    }

    fun login(name: String, pass: String): Single<User> {
        return service.login(UserRequestModel(name, pass))
    }

    fun getUsers(): Single<List<User>> {
        return service.getUsers(getToken())
    }

    fun getMe(): Single<User> {
        return service.getMe(getToken())
    }

    fun getUser(userId: Int): Single<User> {
        return service.getUser(getToken(), userId)
    }

    fun search(keyword: String, page: Int, genre: String): Single<BookSearchResponse> {
        return service.search(getToken(), keyword, page, genre)
    }


    private fun getToken(): String {
        // TODO: 初回ログイン時にDB登録しておいて、あとはDBから読むようにする（ログアウト時に削除）
        return "Bearer XXX"
    }
}