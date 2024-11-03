package online.dhbw_studentprojekt.dto.trigger;

import java.util.List;

public record TriggerResponse(List<Trigger> triggers) {
    public record Trigger(String route, String time) {
    }
}
