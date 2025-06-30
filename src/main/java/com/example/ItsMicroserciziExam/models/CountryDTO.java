package com.example.ItsMicroserciziExam.models;

import java.util.Arrays;
import java.util.Objects;

public class CountryDTO {

    private CapitalInfo capitalInfo;
    private String country;
    private String[] capital; //Da fare una lista
    private String population;
    private Currencies currency;
    private Flags flagPng; // Da prendere da flags

//    Fare oggetto currencies E Flags

    public CountryDTO() {
    }

    public CountryDTO(CapitalInfo capitalInfo, String country, String[] capital, String population, Currencies currency, Flags flagPng) {
        this.capitalInfo = capitalInfo;
        this.country = country;
        this.capital = capital;
        this.population = population;
        this.currency = currency;
        this.flagPng = flagPng;
    }

    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getCapital() {
        return capital;
    }

    public void setCapital(String[] capital) {
        this.capital = capital;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public Flags getFlagPng() {
        return flagPng;
    }

    public void setFlagPng(Flags flagPng) {
        this.flagPng = flagPng;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CountryDTO that)) return false;
        return population == that.population && Objects.equals(capitalInfo, that.capitalInfo) && Objects.equals(country, that.country) && Objects.deepEquals(capital, that.capital) && Objects.equals(currency, that.currency) && Objects.equals(flagPng, that.flagPng);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capitalInfo, country, Arrays.hashCode(capital), population, currency, flagPng);
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "capitalInfo=" + capitalInfo +
                ", country='" + country + '\'' +
                ", capital=" + Arrays.toString(capital) +
                ", population=" + population +
                ", currency=" + currency +
                ", flagPng=" + flagPng +
                '}';
    }
}