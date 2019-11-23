package com.tingna.springwebservice.web;

import com.tingna.springwebservice.web.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main"; //src/main/resources/templates/main.hbs로 전환되어 View Resolver가 처리
    }
}
