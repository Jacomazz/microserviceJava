package com.example.ItsMicroserciziExam.repository;

import com.example.ItsMicroserciziExam.models.CountryWeather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRecordRepository extends CrudRepository<CountryWeather, Integer> {
}
