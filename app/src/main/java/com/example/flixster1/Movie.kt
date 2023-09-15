package com.example.flixster1
import com.google.gson.annotations.SerializedName

class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO movieImageUrl
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

    //TODO description
    @SerializedName("overview")
    var description: String? = null

}