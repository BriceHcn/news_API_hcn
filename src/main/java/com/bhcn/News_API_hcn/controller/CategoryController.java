package com.bhcn.News_API_hcn.controller;


import com.bhcn.News_API_hcn.service.ArticleService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Getter
@Setter

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    ArticleService articleService;

    @GetMapping({"/{category}"})
    public String general(Model model, @PathVariable String category){
        model.addAttribute("articles", articleService.getArticles(category,"fr"));
        return "index";
    }

}
