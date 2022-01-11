package com.altplusplus.marvel.service;

import com.altplusplus.marvel.model.Avengers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MarvelService {

    // get all avengers
    List<Avengers> getAllAvengers();

    //get an avenger
    Avengers getAvenger(long id);

    //add avenger
    Avengers addAvenger(Avengers avengers);

    //delete avenger
    void deleteAvenger(long id);
}
