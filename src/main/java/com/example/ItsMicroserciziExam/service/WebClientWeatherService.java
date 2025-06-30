package com.example.ItsMicroserciziExam.service;

import com.example.ItsMicroserciziExam.client.IWebClientWeather;
import com.example.ItsMicroserciziExam.models.WeatherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebClientWeatherService {

    @Autowired
    private IWebClientWeather addressClient;

    public WeatherDTO getWeather(double latitude, double longitude) {
        return addressClient.getWeather(latitude, longitude);
    }
}
