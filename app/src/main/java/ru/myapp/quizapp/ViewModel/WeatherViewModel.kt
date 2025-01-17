//package ru.myapp.quizapp.ViewModel
//
//import androidx.lifecycle.ViewModel
//import ru.myapp.quizapp.repository.WeatherRepository
//import ru.myapp.quizapp.server.ApiClient
//import ru.myapp.quizapp.server.ApiServices
//
//class WeatherViewModel(val repository: WeatherRepository): ViewModel() {
//
//    constructor(): this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))
//
//    fun loadCurrentWeather(lat: Double, lng: Double, unit: String) =
//        repository.getCurrentWeather(lat, lng, unit)
//}