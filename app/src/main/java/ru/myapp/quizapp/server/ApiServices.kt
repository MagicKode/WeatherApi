//package ru.myapp.quizapp.server
//
//import retrofit2.Call
//import retrofit2.http.GET
//import retrofit2.http.Query
//
//interface ApiServices {
//
//    @GET("https://api.openweathermap.org")
//    fun getCurrentWeather(
//        @Query("lat") lat: Double,
//        @Query("lon") lon: Double,
//        @Query("units") units: String,
//        @Query("appid") ApiKey: String
//    ): Call<CurrentResponseApi>
//}