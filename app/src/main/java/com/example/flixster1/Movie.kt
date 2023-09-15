package com.example.flixster1
import com.google.gson.annotations.SerializedName

class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO movieImageUrl
    @SerializedName("movie_image")
    var movieImageUrl: String? = null

    //TODO description
    @SerializedName("description")
    var description: String? = null

}