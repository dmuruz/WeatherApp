package com.muruz.weather.domain.repository

import com.muruz.weather.domain.util.Resource
import com.muruz.weather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}