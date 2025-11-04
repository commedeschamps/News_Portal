package factory;

import model.Article;

public class ArticleFactory {

    public static Article createNewsArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("News")
                .author(author)
                .priority(5)
                .build();
    }

    public static Article createTechnologyArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Technology")
                .author(author)
                .priority(7)
                .build();
    }

    public static Article createSportsArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Sports")
                .author(author)
                .priority(6)
                .build();
    }

    public static Article createPoliticsArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Politics")
                .author(author)
                .priority(8)
                .build();
    }

    public static Article createEntertainmentArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Entertainment")
                .author(author)
                .priority(4)
                .build();
    }

    public static Article createWeatherArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Weather")
                .author(author)
                .priority(9)
                .build();
    }

    public static Article createEducationArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Education")
                .author(author)
                .priority(7)
                .build();
    }

    public static Article createCrimeArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Crime")
                .author(author)
                .priority(10)
                .build();
    }

    public static Article createFoodArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Food")
                .author(author)
                .priority(5)
                .build();
    }

    public static Article createSpaceArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Space")
                .author(author)
                .priority(8)
                .build();
    }

    public static Article createMusicArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .category("Music")
                .author(author)
                .priority(6)
                .build();
    }

    public static Article createArticle(String title, String content, String category, String author, int priority) {
        return Article.builder()
                .title(title)
                .content(content)
                .category(category)
                .author(author)
                .priority(priority)
                .build();
    }
}
