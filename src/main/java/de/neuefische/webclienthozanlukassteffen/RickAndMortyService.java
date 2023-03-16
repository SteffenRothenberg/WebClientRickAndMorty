package de.neuefische.webclienthozanlukassteffen;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class RickAndMortyService {
    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    RickAndMortyCharacter getAllCharacters(){
        ResponseEntity<RickAndMortyCharacter> responseEntity = webClient
                .get()
                .uri("/character/")
                .retrieve()
                .toEntity(RickAndMortyCharacter.class)
                .block();

        return Objects.requireNonNull(responseEntity).getBody();
    }

}
