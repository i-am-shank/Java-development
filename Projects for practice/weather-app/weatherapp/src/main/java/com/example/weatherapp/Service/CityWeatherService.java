package com.example.weatherapp.Service;

import com.example.weatherapp.Entity.CityWeatherSummary;

public interface CityWeatherService {
    /**
     * Gets cityName & returns it weather summary as a CityWeatherSummary object
     * @param cityName
     *
     * @return
     */
    public CityWeatherSummary getCityWeatherSummary(String cityName) throws Exception;
}