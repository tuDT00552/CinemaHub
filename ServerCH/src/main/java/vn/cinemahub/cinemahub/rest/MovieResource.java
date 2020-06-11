package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.Movie;
import vn.cinemahub.cinemahub.service.CinemaService;
import vn.cinemahub.cinemahub.service.MovieService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieResource {
    @Autowired
    private MovieService movieService;

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    @PostMapping
    public Movie save(@RequestBody Movie movie) {
        Date date = new Date();
        movie.setCreatedAt(date);
        movie.setUpdateAt(date);
        movie.setStatus(1);
        Cinema c = new Cinema();
        movie.setCinema(cinemaService.findByID((long) 203).get());
        return movieService.save(movie);
    }
}
