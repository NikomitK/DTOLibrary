package online.dhbw_studentprojekt.dto.speisekarte;

import java.util.List;

public record SpeisekarteAllergeneRequest(String date, List<String> allergene) {
}
