package com.example.ItsMicroserciziExam.client;

import com.example.ItsMicroserciziExam.models.CountryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@FeignClient(
        value = "countryHolder",
        url = "https://restcountries.com",
        fallback = WebClientCountryFallback.class
)
public interface IWebClientCountry {

    @GetMapping("/v3.1/name/{country}")
    List<Map<String, Object>> getCountry(@PathVariable("country") String country);
}