package factory;

import model.Article;


public interface ArticleFactory {
    Article createArticle(String title, String content, String author);
}