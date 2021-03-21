package com.bhcn.News_API_hcn.service;

import com.bhcn.News_API_hcn.config.ConfigProperties;
import com.bhcn.News_API_hcn.domain.ArticleData;
import com.bhcn.News_API_hcn.domain.NewsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ConfigProperties configProp;

    public List<ArticleData> getArticles(String category, String language) {
        RestTemplate test = new RestTemplate();
        String apiKey = System.getenv("apiKey");//remove for prod
        apiKey = configProp.getConfigValue("bhcn.apiKey");

        String request = "https://newsapi.org/v2/top-headlines?apiKey=" + apiKey + "&country="+language+"&category="+category;
        NewsResult result = test.getForObject(request, NewsResult.class);

        return result.getArticles();
    }




}
