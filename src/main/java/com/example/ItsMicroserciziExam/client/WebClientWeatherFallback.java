package com.example.ItsMicroserciziExam.client;

import com.example.ItsMicroserciziExam.models.CountryDTO;
import com.example.ItsMicroserciziExam.models.WeatherDTO;

public class WebClientWeatherFallback implements IWebClientWeather{

    @Override
    public WeatherDTO getWeather(double latitude, double longitude) {
        return null;
    }
}
