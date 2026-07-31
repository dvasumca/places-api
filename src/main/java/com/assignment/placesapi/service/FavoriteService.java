package com.assignment.placesapi.service;

import com.assignment.placesapi.entity.FavoritePlace;
import com.assignment.placesapi.repository.FavoriteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    private final FavoriteRepository repository;

    public FavoriteService(FavoriteRepository repository) {
        this.repository = repository;
    }

    public FavoritePlace save(FavoritePlace place) {
        return repository.save(place);
    }

    public List<FavoritePlace> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}