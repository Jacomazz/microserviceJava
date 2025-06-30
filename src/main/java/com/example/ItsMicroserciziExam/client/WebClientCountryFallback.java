package com.example.ItsMicroserciziExam.client;

import com.example.ItsMicroserciziExam.models.CountryDTO;

import java.util.List;
import java.util.Map;

public class WebClientCountryFallback implements IWebClientCountry {

    @Override
    public List<Map<String, Object>> getCountry(String country) {
        return List.of();
    }
}