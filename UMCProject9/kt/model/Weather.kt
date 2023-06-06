package com.kjh.umc_project9.model

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("base") val base: String,
    @SerializedName("clouds") val clouds: Clouds,
    @SerializedName("cod") val cod: Int,
    @SerializedName("coord") val coord: Coord, // 위,경도
    @SerializedName("dt") val dt: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("main") val main: Main, // 메인
    @SerializedName("name") val name: String, // 도시
    @SerializedName("sys") val sys: Sys,
    @SerializedName("timezone") val timezone: Int,
    @SerializedName("visibility") val visibility: Int,
    @SerializedName("weather") val weather: List<WeatherDetail>,
    @SerializedName("wind") val wind: Wind
) {
    override fun toString(): String {
        return """
            |name : $name
            |base : $base
            |timezone : $timezone
            |visibility : $visibility
            |cod : $cod
            |dt : $dt
            |id : $id
            |clouds : $clouds
            |coord : $coord
            |main : $main
            |sys : $sys
            |weather : $weather
            |wind : $wind
        """.trimMargin()
    }
}

data class WeatherDetail(
    @SerializedName("description") val description: String,
    @SerializedName("icon") val icon: String,
    @SerializedName("id") val id: Int,
    @SerializedName("main") val main: String
)

data class Clouds(
    @SerializedName("all") val all: Int
)

data class Coord(
    @SerializedName("lat") val lat: Double,
    @SerializedName("lon") val lon: Double
)

data class Wind(
    @SerializedName("deg") val deg: Int,
    @SerializedName("gust") val gust: Double,
    @SerializedName("speed") val speed: Double
)

data class Sys(
    @SerializedName("country") val country: String,
    @SerializedName("id") val id: Int,
    @SerializedName("sunrise") val sunrise: Int,
    @SerializedName("sunset") val sunset: Int,
    @SerializedName("type") val type: Int
)

data class Main(
    @SerializedName("feels_like") val feelsLike: Double,
    @SerializedName("grnd_level") val grndLevel: Int,
    @SerializedName("humidity")val humidity: Int,
    @SerializedName("pressure") val pressure: Int,
    @SerializedName("sea_level") val seaLevel: Int,
    @SerializedName("temp") val temp: Double,
    @SerializedName("temp_max") val tempMax: Double,
    @SerializedName("temp_min") val tempMin: Double
)