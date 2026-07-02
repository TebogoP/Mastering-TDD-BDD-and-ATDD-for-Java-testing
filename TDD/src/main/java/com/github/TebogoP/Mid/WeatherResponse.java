package com.github.TebogoP.Mid;

public class WeatherResponse {

    private final boolean success;
    private final double temperature;
    private final String errorMessage;

    // Private constructor — use the factory methods below
    private WeatherResponse(boolean success, double temperature, String errorMessage) {
        this.success = success;
        this.temperature = temperature;
        this.errorMessage = errorMessage;
    }

    public static WeatherResponse success(double temperature) {
        return new WeatherResponse(true, temperature, null);
    }

    public static WeatherResponse failure(String errorMessage) {
        return new WeatherResponse(false, 0.0, errorMessage);
    }

    public boolean isSuccess() { return success; }
    public double getTemperature() { return temperature; }
    public String getErrorMessage() { return errorMessage; }
}