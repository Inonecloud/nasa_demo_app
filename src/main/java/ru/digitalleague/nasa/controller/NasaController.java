package ru.digitalleague.nasa.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.digitalleague.nasa.dto.RocketDto;

import java.net.URI;

@RestController
@RequestMapping("/")
public class NasaController {

    @GetMapping
    public ResponseEntity<RocketDto> getRocket(){
        URI resourceURI = URI.create("http://localhost:8081/rocket/get_rocket");
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<RocketDto> rocket = restTemplate.exchange(resourceURI, HttpMethod.GET, null, RocketDto.class);


        return rocket;

    }

}
