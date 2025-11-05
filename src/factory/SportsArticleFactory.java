package factory;

import model.Article;

import java.time.LocalDateTime;

public class SportsArticleFactory implements ArticleFactory {
    @Override
    public Article createArticle(String title, String content, String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .publishedDate(LocalDateTime.now())
                .category("SPORTS")
                .priority(5)
                .build();
    }
}
