package com.example.muzica.controller;

import com.example.muzica.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MusicController {

    @Autowired
    private MusicRepository musicRepository;

    @GetMapping("/musics")
    public String getMusic(Model model) {
        model.addAttribute("music", musicRepository.findAll());
        return "musics";
    }

    @GetMapping("/music/{id}")
    public String getMusic(@PathVariable Integer id, Model model) {
        model.addAttribute("music", musicRepository.findById(id).get());
        return "music";
    }
}
