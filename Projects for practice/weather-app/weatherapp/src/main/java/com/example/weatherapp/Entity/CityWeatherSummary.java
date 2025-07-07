package com.example.weatherapp.Entity;

import com.example.weatherapp.Entity.CityWeatherSummaryComponents.City;
import com.example.weatherapp.Entity.CityWeatherSummaryComponents.WeatherData;

import java.util.List;

public class CityWeatherSummary {
    private String cod;
    private int message;
    private int cnt;
    private List<WeatherData> list;
    private City city;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<WeatherData> getList() {
        return list;
    }

    public void setList(List<WeatherData> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
