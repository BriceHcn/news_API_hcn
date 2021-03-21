package com.bhcn.News_API_hcn.controller;

import com.bhcn.News_API_hcn.domain.ArticleData;
import com.bhcn.News_API_hcn.domain.NewsResult;
import com.bhcn.News_API_hcn.service.ArticleService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Controller
public class IndexController {

    @GetMapping({"","/"})
    public String index(Model model){ return "redirect:/category/general"; }
}
