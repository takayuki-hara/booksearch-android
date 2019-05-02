package jp.ne.penguin.booksearch.data.repository.api

import io.reactivex.Single
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

    @GET("api/v1/search")
    fun search(
            @Header("Authorization") token: String,
            @Query("keywd") keyword: String,
            @Query("page") page: Int,
            @Query("genre") genre: String): Single<BookSearchResponse>
}