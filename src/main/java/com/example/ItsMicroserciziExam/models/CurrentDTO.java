package com.example.ItsMicroserciziExam.models;

public class CurrentDTO {
    private String time;
    private double temperature_2m;
    private String weather_code;

    public CurrentDTO() {
    }

    public CurrentDTO(String time, double temperature_2m, String weather_code) {
        this.time = time;
        this.temperature_2m = temperature_2m;
        this.weather_code = weather_code;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(double temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public String getWeather_code() {
        return weather_code;
    }

    public void setWeather_code(String weather_code) {
        this.weather_code = weather_code;
    }
}
