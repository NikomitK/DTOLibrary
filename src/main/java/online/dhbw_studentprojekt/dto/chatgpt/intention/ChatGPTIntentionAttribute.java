package online.dhbw_studentprojekt.dto.chatgpt;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatGPTIntentionAttribute {
    private String name;
    private String value;

    @JsonCreator
    public ChatGPTIntentionAttribute(@JsonProperty("name") String name, @JsonProperty("value") String value) {
        this.name = name;
        this.value = value;
    }
}
