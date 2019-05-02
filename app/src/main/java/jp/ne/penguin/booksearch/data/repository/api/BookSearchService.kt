package jp.ne.penguin.booksearch.data.repository.api

import io.reactivex.Single
import jp.ne.penguin.booksearch.data.entity.Favorite
import jp.ne.penguin.booksearch.data.entity.Keyword
import jp.ne.penguin.booksearch.data.entity.Message
import jp.ne.penguin.booksearch.data.entity.User
import retrofit2.http.*

interface BookSearchService {
    companion object {
        const val BASE_URL = "http://booksearch-bunl25ft.herokuapp.com/"
    }


    @Headers(
        "Accept: application/json",
        "Content-type: application/json"
    )

    @POST("api/v1/users/login")
    fun login(@Body body: LoginRequestModel): Single<User>

    @GET("api/v1/users")
    fun getUsers(@Header("Authorization") token: String): Single<List<User>>

    @GET("api/v1/users/me")
    fun getMe(@Header("Authorization") token: String): Single<User>

    @GET("api/v1/users/{id}")
    fun getUser(
            @Header("Authorization") token: String,
            @Path("id") userId: Int): Single<User>

    @POST("api/v1/users")
    fun createUser(@Body body: UserRequestModel): Single<User>

    @PUT("api/v1/users/{id}")
    fun updateUser(
            @Header("Authorization") token: String,
            @Path("id") userId: Int,
            @Body body: UserRequestModel): Single<User>

    @DELETE("api/v1/users/{id}")
    fun deleteUser(
            @Header("Authorization") token: String,
            @Path("id") userId: Int): Single<Message>

    @GET("api/v1/search")
    fun search(
            @Header("Authorization") token: String,
            @Query("keywd") keyword: String,
            @Query("page") page: Int,
            @Query("genre") genre: String): Single<BookSearchResponse>

    @GET("api/v1/keywords")
    fun getKeywords(@Header("Authorization") token: String): Single<List<Keyword>>

    @POST("api/v1/keywords")
    fun registKeyword(
            @Header("Authorization") token: String,
            @Body body: KeywordRequestModel): Single<Keyword>

    @PUT("api/v1/keywords/{id}")
    fun updateKeyword(
            @Header("Authorization") token: String,
            @Path("id") keywordId: Int,
            @Body body: KeywordRequestModel): Single<Keyword>

    @DELETE("api/v1/keywords/{id}")
    fun deleteKeyword(
            @Header("Authorization") token: String,
            @Path("id") keywordsId: Int): Single<Message>

    @GET("api/v1/favorites")
    fun getFavorites(@Header("Authorization") token: String): Single<List<Favorite>>

    @POST("api/v1/favorites")
    fun registFavorite(
            @Header("Authorization") token: String,
            @Body body: FavoriteRequestModel): Single<Favorite>


}