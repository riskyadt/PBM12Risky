package com.risky.pbm12.api
import com.risky.pbm12.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>

}