package com.example.doxapi.service;

import com.example.doxapi.model.Film;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import java.io.InputStream;
import java.util.List;

@Service
public class FilmService {

    private List<Film> films;

    @PostConstruct
    public void init() throws Exception {
        // Jackson ObjectMapper til at parse JSON
        ObjectMapper mapper = new ObjectMapper();

        // Loader filen fra classpath: src/main/resources/data/cph_dox_program.json
        ClassPathResource resource = new ClassPathResource("data/cph_dox_program.json");
        try (InputStream is = resource.getInputStream()) {
            // Mapper JSON-array til List<Film>
            films = mapper.readValue(is, new TypeReference<List<Film>>() {});
        }
    }

    /** Returner alle film */
    public List<Film> getAllFilms() {
        return films;
    }

    /** Returner én film baseret på id, eller null hvis ikke fundet */
    public Film getFilmById(Long id) {
        return films.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

