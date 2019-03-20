package main;

import model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {

    List<Article> articleList = new ArrayList<Article>(Arrays.asList(
            new Article("1","Article1","Description01"),
            new Article("2","Article2","Description02"),
            new Article("3","Article3","Description03")
    ));

    public List<Article> getAllArticles()
    {
        return articleList;
    }
    public Article getArticle(String id)
    {
        return articleList.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }

}
