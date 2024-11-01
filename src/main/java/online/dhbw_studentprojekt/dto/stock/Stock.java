package online.dhbw_studentprojekt.dto.stock;

/**
 * Represents a stock with its data points. The data points are the stock's data from yesterday and the day before yesterday.
 */
public record Stock(String name, DataPoint yesterday, DataPoint yesteryesterday) {
    public record DataPoint(String date, String open, String low, String high, String close) {}
}
