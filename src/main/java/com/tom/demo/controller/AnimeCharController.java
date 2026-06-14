package com.tom.demo.controller;

import com.tom.demo.model.AnimeChar;
import com.tom.demo.repository.AnimeCharRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/characters")
public class AnimeCharController {
    private final AnimeCharRepository repository;
    AnimeCharController(AnimeCharRepository repository)
    {
        this.repository=repository;
    }
    @GetMapping("/random")
    public AnimeChar getChar()
    {
        List<AnimeChar> animechar=repository.findAll();
        Random random=new Random();
        return animechar.get(random.nextInt(animechar.size()));
    }
}