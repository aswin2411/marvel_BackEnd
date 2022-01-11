package com.altplusplus.marvel.service;

import com.altplusplus.marvel.exceptions.ResourceNotFoundException;
import com.altplusplus.marvel.model.Avengers;
import com.altplusplus.marvel.repository.MarvelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MarvelServiceImpl implements MarvelService {

    private final MarvelRepository marvelRepository;

    @Override
    public List<Avengers> getAllAvengers() {
        return marvelRepository.findAll();
    }

    @Override
    public Avengers getAvenger(long id) {
        return marvelRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Avengers addAvenger(Avengers avengers) {
        return marvelRepository.save(avengers);
    }

    @Override
    public void deleteAvenger(long id) {
        marvelRepository.deleteById(id);
    }

}
