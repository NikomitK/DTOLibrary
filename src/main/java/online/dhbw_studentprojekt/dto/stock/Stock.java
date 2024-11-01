package online.dhbw_studentprojekt.dto.stock;

public record Stock(String name, DataPoint yesterday, DataPoint yesteryesterday) {
    public record DataPoint(String date, String open, String low, String high, String close) {}
}
