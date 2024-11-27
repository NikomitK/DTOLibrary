package online.dhbw_studentprojekt.dto.wetter;

import java.util.List;

public record Wetter(
        String name,
        Main main,
        List<Weather> weather
) {
    public record Main(double temp, double feels_like, double temp_min, double temp_max) {
    }

    public record Weather(int id, String main, String description, String icon) {
    }
}
