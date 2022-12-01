package me.vuharev.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/to/hello")
    public String hello() {
        String nameProject = "Книга рецептов Web";
        String funcProject = "Вывод рецептов по запросу";
        String technologiessProject = "Будет включать в себя технологии Java/Spring";

        return nameProject + " " + "\n" +
                funcProject + " " + "\n" +
                technologiessProject;

    }

    @GetMapping("/")
    public String home() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {
        String studentName = "Николай Вихарев";
        String projectName = "Книга рецептов";
        String createDate = "1/12/2022";
        String descriptionProject = "Книга рецептов на Java";

        return studentName + " " + "\n" +
               projectName + " " + "\n" +
               createDate + " " + "\n" +
               descriptionProject + " ";
    }
}
