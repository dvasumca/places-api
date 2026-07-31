package com.assignment.placesapi.repository;

import com.assignment.placesapi.entity.FavoritePlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<FavoritePlace, Long> {
}