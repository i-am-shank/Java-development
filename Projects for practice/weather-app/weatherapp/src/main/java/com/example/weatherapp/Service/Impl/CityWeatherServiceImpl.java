package com.example.weatherapp.Service.Impl;

import com.example.weatherapp.Constant.WeatherAppConstants;
import com.example.weatherapp.Entity.CityWeatherSummary;
import com.example.weatherapp.Service.CityWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CityWeatherServiceImpl implements CityWeatherService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public CityWeatherSummary getCityWeatherSummary(String cityName) throws Exception {
        String apiUrl = WeatherAppConstants.CITY_WEATHER_ENDPOINT_WITH_PARAM
                .replace("{city name}", cityName)
                .replace("{API key}", WeatherAppConstants.WEATHER_API_KEY);

        ResponseEntity<CityWeatherSummary> cityWeatherSummaryResponse = restTemplate.exchange(apiUrl, HttpMethod.GET, null, CityWeatherSummary.class);
        return cityWeatherSummaryResponse.getBody();
    }
}
