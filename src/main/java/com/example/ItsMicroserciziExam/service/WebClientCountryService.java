package com.example.ItsMicroserciziExam.service;

import com.example.ItsMicroserciziExam.client.IWebClientCountry;
import com.example.ItsMicroserciziExam.models.CountryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WebClientCountryService {

    @Autowired
    private IWebClientCountry addressClient;

    public List<Map<String, Object>> getCountry(String country) {
        return addressClient.getCountry(country);
    }
}