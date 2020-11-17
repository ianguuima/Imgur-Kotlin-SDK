package me.ianguuima.image

class ImageUploadResponse(
    val data : ImageData,
    val success : Boolean,
    val status : Int
)

class ImageData(
    id : String,
    title : String? = null,
    description : String? = null,
    datetime : Long,
    type : String,
    animated : Boolean,
    width : Int,
    height : Int,
    size : Int,
    views : Int,
    bandwidth : Int,
    vote : Any? = null,
    favorite : Boolean,
    nsfw : Any? = null,
    section : Any? = null,
    account_url : String? = null,
    account_id : Int = 0,
    is_ad : Boolean,
    in_most_viral : Boolean,
    tags : Array<String>,
    ad_type : Int = 0,
    ad_url : String,
    in_gallery : Boolean,
    deleteHash : String,
    name : String = "",
    link : String
)