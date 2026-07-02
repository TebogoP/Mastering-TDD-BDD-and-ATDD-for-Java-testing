// src/main/java/weather/WeatherClient.java
package com.github.TebogoP.Mid;

import java.io.IOException;

public interface WeatherClient {

    /**
     * Calls an external weather API and returns the raw temperature in Celsius.
     *
     * @param city the city name to query
     * @return temperature in Celsius as a double
     * @throws IOException if the external API call fails (timeout, network error, etc.)
     */
    double fetchTemperature(String city) throws IOException;
}