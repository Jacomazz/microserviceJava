package com.example.ItsMicroserciziExam.controller;


import com.example.ItsMicroserciziExam.models.CountryDTO;
import com.example.ItsMicroserciziExam.models.CountryWeather;
import com.example.ItsMicroserciziExam.models.InfoDTO;
import com.example.ItsMicroserciziExam.models.WeatherDTO;
import com.example.ItsMicroserciziExam.service.CountryRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/country-weather")
public class CountryRecordController {

    @Autowired
    private CountryRecordServiceImpl service;

    @GetMapping("/{countryName}")
    public ResponseEntity<CountryWeather> getCountry(@PathVariable String countryName) {
        CountryWeather countryWeather = service.getCountry(countryName);
//        System.out.println("OutputSeSpera" + countryWeather);
        return ResponseEntity.ok(countryWeather);
    }

    @PutMapping("/{countryName}")
    public ResponseEntity<CountryWeather> updateCountry(@RequestBody InfoDTO info, @PathVariable String countryName) {
        return ResponseEntity.ok(service.updateCountry(info, countryName));
    }






//    PER MOTIVI DI TEST

    @GetMapping("/weather/{countryName}")
    public WeatherDTO getWeather(@PathVariable String countryName) {
        return service.getWeather(countryName);
    }

    @GetMapping("/getcountry/{countryName}")
    public List<Map<String, Object>> getCountryDTO(@PathVariable String countryName) {
        return service.getCountryDTO(countryName);
    }
}
