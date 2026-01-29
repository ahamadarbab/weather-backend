package com.example.weather_backend.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    public Object callWeatherApi(String cityName) {
        String url = "http://api.weatherapi.com/v1/current.json?key=3138a7ac6f8b43548fb152440262801&q=" + cityName;
        RequestEntity request = RequestEntity.get(url).build();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object> resp = restTemplate.exchange(url, HttpMethod.GET, request, Object.class);
        return resp.getBody();
    }
}
