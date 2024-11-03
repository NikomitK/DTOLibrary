package online.dhbw_studentprojekt.dto.news;

public record Article(Source source, String author, String title, String description, String url, String urlToImage,
                      String publishedAt) {

    public record Source(String id, String name) {

    }

}
