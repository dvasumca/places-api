package com.assignment.placesapi.controller;

import com.assignment.placesapi.entity.FavoritePlace;
import com.assignment.placesapi.service.FavoriteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin(origins = "http://localhost:5173")
public class FavoriteController {

    private final FavoriteService service;

    public FavoriteController(FavoriteService service) {
        this.service = service;
    }

    @PostMapping
    public FavoritePlace save(@RequestBody FavoritePlace place) {
        return service.save(place);
    }

    @GetMapping
    public List<FavoritePlace> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}