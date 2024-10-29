package online.dhbw_studentprojekt.dto.chatgpt;

import nikomitk.mschatgpt.dto.standard.ChatGPTMessage;

import java.util.List;
import java.util.Map;

public record ChatGPTIntentionRequest(String model, List<ChatGPTMessage> messages, Map<String, Object> response_format) {
}
