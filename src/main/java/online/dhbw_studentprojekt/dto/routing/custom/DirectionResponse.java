package online.dhbw_studentprojekt.dto.routing.custom;

import java.util.List;

public record DirectionResponse(
        List<Route> routes
) {
    public record Route(
            List<Leg> legs
    ) {}

    public record Leg(
            Time arrival_time,
            Time departure_time,
            Distance distance,
            Duration duration,
            String end_address,
            String start_address,
            List<Step> steps
    ) {}

    public record Time(
            String text,
            String time_zone,
            long value
    ) {}

    public record Distance(
            String text,
            int value
    ) {}

    public record Duration(
            String text,
            int value
    ) {}

    public record Step(
            Distance distance,
            Duration duration,
            String html_instructions,
            String travel_mode,
            List<Step> steps,
            String maneuver
    ) {}

}

