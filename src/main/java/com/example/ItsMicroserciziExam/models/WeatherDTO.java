package com.example.ItsMicroserciziExam.models;

import jakarta.persistence.Embeddable;

import java.time.ZonedDateTime;
import java.util.Objects;

@Embeddable
public class WeatherDTO {
    private CurrentDTO current;
//    private double latitude;

    public WeatherDTO() {
    }

    public WeatherDTO(double temperature_2m, String weather_code, ZonedDateTime time, CurrentDTO current) {
        this.current = current;
    }

    public CurrentDTO getCurrent() {
        return current;
    }

    public void setCurrent(CurrentDTO current) {
        this.current = current;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WeatherDTO that)) return false;
        return Objects.equals(current, that.current);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(current);
    }

    @Override
    public String toString() {
        return "WeatherDTO{" +
                "current=" + current +
                '}';
    }
}
