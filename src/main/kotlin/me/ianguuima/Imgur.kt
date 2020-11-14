package me.ianguuima

import com.fasterxml.jackson.databind.ObjectMapper
import me.ianguuima.exceptions.ImgurResponseException
import me.ianguuima.image.ImageUploadResponse
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import java.io.File

class Imgur(private val clientId : String) {

    private val client = OkHttpClient()
    private val mapper = ObjectMapper()

    fun upload(image: File): ImageUploadResponse {
        val mediaType = "image/png".toMediaType();

        val requestBody: RequestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("title", "Square Logo")
            .addFormDataPart("image", "logo-square.png",
                RequestBody.create(
                    mediaType,
                    image
                )
            )
            .build()

        val request = Request.Builder()
            .header("Authorization", "Client-ID $clientId")
            .url("https://api.imgur.com/3/image")
            .post(requestBody)
            .build()

        val response = client.newCall(request).execute()

        if (!response.isSuccessful) {
            throw ImgurResponseException(response.body?.string())
        }

        return mapper.readValue(response.body?.string(), ImageUploadResponse::class.java)
    }


}