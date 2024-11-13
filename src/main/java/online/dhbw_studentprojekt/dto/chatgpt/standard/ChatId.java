package online.dhbw_studentprojekt.dto.chatgpt.standard;

public enum ChatId {
    DEFAULT("default"),
    TEST("test");

    private final String value;

    ChatId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
