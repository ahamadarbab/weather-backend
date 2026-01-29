package com.example.weather_backend.controller;

import com.example.weather_backend.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/weather")
@RestController
public class WeatherController {

    // http://localhost:8080/api/v1/weather/get?cityName=

    @Autowired
    WeatherService weatherService;

    @GetMapping("/get")
    public Object getCityDetails(@RequestParam String cityName) {
        return weatherService.getCityWeather(cityName);
    }
}
