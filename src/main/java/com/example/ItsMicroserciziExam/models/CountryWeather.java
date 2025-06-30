package com.example.ItsMicroserciziExam.models;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Objects;

@Entity
public class CountryWeather {

    @Id
    @GeneratedValue
    private int id;
    private List<String> capital;
    private String population;
    private String currency;
    private String flagPng;
    private double temperature;
    private String code;
    private String retrievedAt;
    private boolean visited;
    private String notes;
    private double rating;
    private String coutryName;

    public CountryWeather() {
    }

    public CountryWeather(int id, List<String> capital, String population,
                          String currency, String flagPng, double temperature,
                          String code, String restrievedAt, boolean visited,
                          String notes, double rating, String countryName) {
        this.id = id;
        this.capital = capital;
        this.population = population;
        this.currency = currency;
        this.flagPng = flagPng;
        this.temperature = temperature;
        this.code = code;
        this.retrievedAt = restrievedAt;
        this.visited = visited;
        this.notes = notes;
        this.rating = rating;
        this.coutryName = countryName;
    }

    public String getCoutryName() {
        return coutryName;
    }

    public void setCoutryName(String coutryName) {
        this.coutryName = coutryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFlagPng() {
        return flagPng;
    }

    public void setFlagPng(String flagPng) {
        this.flagPng = flagPng;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRetrievedAt() {
        return retrievedAt;
    }

    public void setRetrievedAt(String retrievedAt) {
        this.retrievedAt = retrievedAt;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CountryWeather that)) return false;
        return id == that.id && Double.compare(temperature, that.temperature) == 0 && visited == that.visited && Double.compare(rating, that.rating) == 0 && Objects.equals(capital, that.capital) && Objects.equals(population, that.population) && Objects.equals(currency, that.currency) && Objects.equals(flagPng, that.flagPng) && Objects.equals(code, that.code) && Objects.equals(retrievedAt, that.retrievedAt) && Objects.equals(notes, that.notes) && Objects.equals(coutryName, that.coutryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capital, population, currency, flagPng, temperature, code, retrievedAt, visited, notes, rating, coutryName);
    }

    @Override
    public String toString() {
        return "CountryWeather{" +
                "id=" + id +
                ", capital=" + capital +
                ", population='" + population + '\'' +
                ", currency='" + currency + '\'' +
                ", flagPng='" + flagPng + '\'' +
                ", temperature=" + temperature +
                ", code='" + code + '\'' +
                ", retrievedAt='" + retrievedAt + '\'' +
                ", visited=" + visited +
                ", notes='" + notes + '\'' +
                ", rating=" + rating +
                ", coutryName='" + coutryName + '\'' +
                '}';
    }
}
