package online.dhbw_studentprojekt.dto.chatgpt.standard;

public enum PromptId {
    //"morning", "message", "intent"
    MORNING("morning"),
    MESSAGE("message"),
    INTENT("intent");

    private final String value;

    PromptId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
