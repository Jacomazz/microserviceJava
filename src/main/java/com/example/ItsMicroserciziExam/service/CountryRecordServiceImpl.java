package com.example.ItsMicroserciziExam.service;

import com.example.ItsMicroserciziExam.models.CountryWeather;
import com.example.ItsMicroserciziExam.models.CountryDTO;
import com.example.ItsMicroserciziExam.models.Flags;
import com.example.ItsMicroserciziExam.models.WeatherDTO;
import com.example.ItsMicroserciziExam.repository.CountryRecordRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CountryRecordServiceImpl implements ICountryRecordServiceImpl{

    @Autowired
    private CountryRecordRepository repository;

    @Autowired
    private WebClientCountryService webClientCountryService;

    @Autowired
    private WebClientWeatherService webClientWeatherService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CountryWeather getCountry(String countryName) {

        CountryWeather countryWeather = new CountryWeather();

        List<Map<String, Object>> countrydto = webClientCountryService.getCountry(countryName);

        WeatherDTO weatherdto = webClientWeatherService.getWeather(
                ((List<Double>) countrydto.get(0).get("latlng")).get(0),
                ((List<Double>) countrydto.get(0).get("latlng")).get(1)
        );

        countryWeather.setTemperature(weatherdto.getCurrent().getTemperature_2m());
        countryWeather.setCode(weatherdto.getCurrent().getWeather_code());
        countryWeather.setRetrievedAt(weatherdto.getCurrent().getTime());

        countryWeather.setPopulation((countrydto.get(0).get("population")).toString());
        countryWeather.setCapital((List<String>) countrydto.get(0).get("capital"));
        countryWeather.setCurrency(countrydto.get(0).get("currencies").toString());
        countryWeather.setFlagPng(countrydto.get(0).get("flags").toString());

//        System.out.println("OutputSeSpera" + countryWeather);

        repository.save(countryWeather);
        return countryWeather;
//        return null;
    }


    public WeatherDTO getWeather (String countryName) {
        List<Map<String, Object>> countrydto = webClientCountryService.getCountry(countryName);

        WeatherDTO weatherdto = webClientWeatherService.getWeather(
                ((List<Double>) countrydto.get(0).get("latlng")).get(0),
                ((List<Double>) countrydto.get(0).get("latlng")).get(1)
        );

        return weatherdto;
    }

    public List<Map<String, Object>> getCountryDTO (String countryName) {
        return webClientCountryService.getCountry(countryName);
    }

    public CountryWeather convertToEntity(CountryDTO dto) {
        return modelMapper.map(dto, CountryWeather.class);
    }

    public WeatherDTO getWeather(double latitude, double longitude) {
        return webClientWeatherService.getWeather(latitude, longitude);
    }
}