package online.dhbw_studentprojekt.dto.chatgpt.standard;

import java.util.List;

public record ChatGPTRequest(String model, List<ChatGPTMessage> messages) {
}
