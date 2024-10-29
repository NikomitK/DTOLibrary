package online.dhbw_studentprojekt.dto.routing.geocoding;

import java.util.List;

public record GeoCodingResponse(
    List<Result> results,
    String status
) {}
