package online.dhbw_studentprojekt.dto.chatgpt.standard;

import java.util.List;


public record ChatGPTResponse(List<ChatGPTResponseChoice> choices) {

}
