package ru.myapp.quizapp.model

data class CityModel(
    val cityName: String,
    val temp: Int,
    val picPath: String,
    val wind: Int,
    val humidity: Int,
    val rain: Int
) {

}