package factory;

import model.Article;

import java.time.LocalDateTime;


public class EntertainmentArticleFactory implements ArticleFactory {
    @Override
    public Article createArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .category("ENTERTAINMENT")
                .publishedDate(LocalDateTime.now())
                .priority(3)
                .build();
    }
}
