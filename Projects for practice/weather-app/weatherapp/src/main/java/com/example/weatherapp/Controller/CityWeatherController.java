package com.example.weatherapp.Controller;

import com.example.weatherapp.Entity.CityWeatherSummary;
import com.example.weatherapp.Entity.ResponseEntity;
import com.example.weatherapp.Service.CityWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city-weather")
public class CityWeatherController {

    @Autowired
    CityWeatherService cityWeatherService;

    @Autowired
    ResponseEntity responseEntity;

    @GetMapping("/summary")
    public ResponseEntity getCityWeatherSummary(@RequestParam String cityName) {
        try {
            CityWeatherSummary weatherSummary = cityWeatherService.getCityWeatherSummary(cityName);
            return responseEntity.ok(weatherSummary, "Successfully fetched the weather summary.");
        } catch (Exception e) {
            return responseEntity.serverError(null, "Something went wrong : " + e.getMessage());
        }
    }
}
