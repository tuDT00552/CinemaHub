package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie save(Movie movie);
}
