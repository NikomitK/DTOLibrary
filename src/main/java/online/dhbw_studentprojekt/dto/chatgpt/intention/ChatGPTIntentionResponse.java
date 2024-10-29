package online.dhbw_studentprojekt.dto.chatgpt.intention;

import java.util.List;

public record ChatGPTIntentionResponse(String route, List<ChatGPTIntentionAttribute> attributes) {

}
