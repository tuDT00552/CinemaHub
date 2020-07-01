package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> findAll();
    Movie save(Movie movie);
    public Optional<Movie> findByID(Long id);
    Optional<Movie> findOne(Long id);
    Long checkExitsMid(Long id);
}
