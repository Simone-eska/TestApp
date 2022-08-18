package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.testapp.Fifth.Companion.offerImage
//import com.example.testapp.Fourth.Companion.logoImage
import com.google.gson.GsonBuilder
import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val api=
        retrofit().create(
            ImagesApi::class.java
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setupRv(ImagesResponse(List(10){
//            ImageObj(logoImage, offerImage)}))
//        lifecycleScope.launch {
//            val result = api.getImages()
//            withContext(Dispatchers.Main) {
//                if(result.isSuccessful)
//                    setupRv(result.body()!!)
//                else
//                }))
//            }
        }


    fun setupRv(body: ImagesResponse) {
        val rv = findViewById<RecyclerView>(R.id.btnRv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = Adapterr(body.data)
    }

    private fun retrofit(): Retrofit {
        val gson = GsonBuilder()
            .enableComplexMapKeySerialization()
            .serializeNulls()
            .create()  // Init Retrofit
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl("https://9d850dc4-4c91-432f-a3ca-f408cebedc42.mock.pstmn.io")
            .build()
    }




}