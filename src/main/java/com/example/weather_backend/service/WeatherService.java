package com.example.weather_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    ApiService apiService;

    public Object getCityWeather(String cityName) {
        return apiService.callWeatherApi(cityName);
    }
}
