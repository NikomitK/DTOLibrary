package online.dhbw_studentprojekt.dto.chatgpt;

import java.util.List;


public record ChatGPTResponse(List<ChatGPTResponseChoice> choices) {

}
