package com.example.weatherapp.Entity.CityWeatherSummaryComponents;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
    @JsonProperty("3h")
    private double rainMeasurement;

    public double getRainMeasurement() {
        return rainMeasurement;
    }

    public void setRainMeasurement(double rainMeasurement) {
        this.rainMeasurement = rainMeasurement;
    }
}

