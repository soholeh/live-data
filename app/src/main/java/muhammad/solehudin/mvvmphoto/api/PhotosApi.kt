package muhammad.solehudin.mvvmphoto.api

import io.reactivex.Single
import muhammad.solehudin.mvvmphoto.model.Photo
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}