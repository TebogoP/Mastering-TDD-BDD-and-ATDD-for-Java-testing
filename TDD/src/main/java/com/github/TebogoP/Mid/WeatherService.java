package com.github.TebogoP.Mid;

import java.io.IOException;

public class WeatherService {

    private final WeatherClient weatherClient;

    // Constructor injection — makes it testable (Task 3 concept applied here)
    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    /**
     * Gets the current temperature for a city.
     *
     * Business rules:
     * 1. If the client returns a temperature, wrap it in a successful response
     * 2. If the client throws IOException, return a failure response — do NOT propagate the exception
     * 3. If the client returns null, return a failure response with message "No data returned"
     */
    public WeatherResponse getCurrentTemperature(String city) {
        // TODO: you implement this — the tests will tell you when it's right
        return null;
    }
}
