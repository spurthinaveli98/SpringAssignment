package main;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getAllArticles()
    {
        return articleService.getAllArticles();
    }
    @RequestMapping("/articles/{id}")
    public Article getArticle(@PathVariable  String id)
    {
        return articleService.getArticle(id);
    }
}

