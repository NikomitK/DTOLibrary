package online.dhbw_studentprojekt.dto.chatgpt.intention;

import online.dhbw_studentprojekt.dto.chatgpt.standard.ChatGPTMessage;

import java.util.List;
import java.util.Map;

public record ChatGPTIntentionRequest(String model, List<ChatGPTMessage> messages, Map<String, Object> response_format) {
}
