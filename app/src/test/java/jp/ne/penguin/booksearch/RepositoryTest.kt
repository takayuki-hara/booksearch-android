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
    fun test_createUser() {
        val result = BookSearchRepository().createUser("test2","test2","test@gmal.com",true,true)
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.username, "test2")
    }

    @Test
    fun test_updateUser() {
        val result = BookSearchRepository().updateUser(37,"test3","test2","test@gmal.com",true,true)
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.username, "test2")
    }

    @Test
    fun test_deleteUser() {
        val result = BookSearchRepository().deleteUser(37)
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.message.get(0), "削除しました")
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

    @Test
    fun test_getKeywords() {
        val result = BookSearchRepository().getKeywords()
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.get(0).keyword, "android")
    }

    @Test
    fun test_registKeyword() {
        val result = BookSearchRepository().registKeyword("test", "001005")
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.keyword, "test")
    }

    @Test
    fun test_updateKeyword() {
        val result = BookSearchRepository().updateKeyword(38, "test2", "001005")
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.keyword, "test2")
    }

    @Test
    fun test_deleteKeyword() {
        val result = BookSearchRepository().deleteKeyword(40)
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.message.get(0), "削除しました")
    }

    @Test
    fun test_getFavorites() {
        val result = BookSearchRepository().getFavorites()
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.get(0).userId, 2)
    }

    @Test
    fun test_registFavorite() {
        val result = BookSearchRepository().registFavorite("Androidスマートフォン", 1188, "001005", "none", "", "", "", "2019年02月", "", "")
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.userId, 2)
    }

    @Test
    fun test_deleteFavorite() {
        val result = BookSearchRepository().deleteFavorite(44)
                .subscribeOn(Schedulers.io())
                .test()
                .await()
                .assertNoErrors()
                .assertComplete()
                .values().get(0)
        println(result)

        // ココは必要に応じて調整する
        Assert.assertEquals(result.message.get(0), "削除しました")
    }

}