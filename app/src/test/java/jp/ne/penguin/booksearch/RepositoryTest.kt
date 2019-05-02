package jp.ne.penguin.booksearch

import io.reactivex.schedulers.Schedulers
import jp.ne.penguin.booksearch.data.repository.BookSearchRepository
import org.junit.Assert
import org.junit.Test

class RepositoryTest {

    fun sample() {
        // メインのコードで呼ぶ際のサンプル
        //BookSearchRepository().search("android", 1, "001005")
        //        .subscribeOn(Schedulers.io())
        //        .subscribeBy(
        //                onSuccess = {
        //                    Log.d("LOG", "Success")
        //                },
        //                onError = {
        //                    Log.d("LOG", "Error")
        //                }
        //        )
    }

    @Test
    fun test_login() {
        val result = BookSearchRepository().login("user", "user")
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.id, 2)
    }

    @Test
    fun test_getUsers() {
        val result = BookSearchRepository().getUsers()
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.get(0).id, 2)
    }

    @Test
    fun test_getMe() {
        val result = BookSearchRepository().getMe()
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.id, 2)
    }

    @Test
    fun test_getUser() {
        val result = BookSearchRepository().getUser(2)
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.id, 2)
    }

    @Test
    fun test_search() {
        val result = BookSearchRepository().search("swift", 1, "001005")
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.count, 41)
    }
}