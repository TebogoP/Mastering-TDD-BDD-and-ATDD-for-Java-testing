// src/test/java/weather/WeatherServiceTest.java
package Mid;

import com.github.TebogoP.Mid.WeatherClient;
import com.github.TebogoP.Mid.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WeatherServiceTest {

    @Mock
    WeatherClient weatherClient;

    @InjectMocks
    WeatherService weatherService;

    // ---------------------------------------------------------------
    // Scenario 1: the client returns a valid temperature
    // What to stub:  weatherClient.fetchTemperature("Cape Town") → 22.5
    // What to call:  weatherService.getCurrentTemperature("Cape Town")
    // What to assert: result.isSuccess() == true
    //                 result.getTemperature() == 22.5
    // What to verify: weatherClient.fetchTemperature was called once with "Cape Town"
    // ---------------------------------------------------------------
    @Test
    void getCurrentTemperature_validCity_returnsSuccessfulResponse() throws IOException {
        // YOUR CODE HERE
    }

    // ---------------------------------------------------------------
    // Scenario 2: the client throws IOException (network failure)
    // What to stub:  weatherClient.fetchTemperature(any) → throws IOException
    // What to call:  weatherService.getCurrentTemperature("Johannesburg")
    // What to assert: result.isSuccess() == false
    //                 result.getErrorMessage() is not null and not blank
    // Key rule: the IOException must NOT bubble up — service catches it
    // ---------------------------------------------------------------
    @Test
    void getCurrentTemperature_clientThrowsIOException_returnsFailureResponse() throws IOException {
        // YOUR CODE HERE
    }

    // ---------------------------------------------------------------
    // Scenario 3: the client returns null (unexpected API response)
    // What to stub:  weatherClient.fetchTemperature(any) → null
    // What to call:  weatherService.getCurrentTemperature("Durban")
    // What to assert: result.isSuccess() == false
    //                 result.getErrorMessage() == "No data returned"
    // ---------------------------------------------------------------
    @Test
    void getCurrentTemperature_clientReturnsNull_returnsNoDataFailure() throws IOException {
        // YOUR CODE HERE
    }
}