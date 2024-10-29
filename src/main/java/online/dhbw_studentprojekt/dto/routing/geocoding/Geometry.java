package online.dhbw_studentprojekt.dto.routing.geocoding;

public record Geometry(
        Location location,
        String location_type,
        Viewport viewport
) {}
