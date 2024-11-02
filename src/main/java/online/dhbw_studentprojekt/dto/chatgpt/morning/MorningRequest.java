package online.dhbw_studentprojekt.dto.chatgpt.morning;

import online.dhbw_studentprojekt.dto.stock.Stock;

import java.util.List;

public record MorningRequest(String firstHeadline, String secondHeadline, String thirdHeadline, List<Stock> stocks) {

}
