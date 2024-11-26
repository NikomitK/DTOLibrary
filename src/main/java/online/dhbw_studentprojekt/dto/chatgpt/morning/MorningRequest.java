package online.dhbw_studentprojekt.dto.chatgpt.morning;

import online.dhbw_studentprojekt.dto.stock.Stock;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public record MorningRequest(String firstHeadline, String secondHeadline, String thirdHeadline, List<Stock> stocks, Map<String, Integer> unreadMails, Map<String, LocalDate> contactsLastCalled) {
    public MorningRequest(String firstHeadline, String secondHeadline, String thirdHeadline, List<Stock> stocks){
        this(firstHeadline, secondHeadline, thirdHeadline, stocks, null, null);
    }
}
