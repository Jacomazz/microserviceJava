package com.example.ItsMicroserciziExam.client;

import com.example.ItsMicroserciziExam.models.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        value = "weatherHolder",
        url = "https://api.open-meteo.com",
        fallback = WebClientWeatherFallback.class
)
public interface IWebClientWeather {

    @RequestMapping(method = RequestMethod.GET, value = "/v1/forecast/?latitude={latitude}&longitude={longitude}&current=temperature_2m,weather_code")
    WeatherDTO getWeather(@PathVariable("latitude") double latitude,
                          @PathVariable("longitude") double longitude);
}