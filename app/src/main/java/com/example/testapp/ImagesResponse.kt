package com.example.testapp

data class ImagesResponse (
    val data : List<ImageObj>
)

 data class ImageObj (
    val logoImage : String,
    val offerImage : String
)