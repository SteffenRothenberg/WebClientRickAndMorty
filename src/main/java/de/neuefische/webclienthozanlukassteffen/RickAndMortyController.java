package de.neuefische.webclienthozanlukassteffen;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/rickandmorty")
    @RequiredArgsConstructor
    public class RickAndMortyController {
        private final RickAndMortyService service;
        @GetMapping
        RickAndMortyCharacter getAllCharacters(){
            return service.getAllCharacters();
        }
}
