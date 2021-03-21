package com.bhcn.News_API_hcn.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsResult {

    private String status;

    private Integer totalResults;

    private List<ArticleData> articles;
}
