package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.Movie;
import vn.cinemahub.cinemahub.service.CinemaService;
import vn.cinemahub.cinemahub.service.MovieService;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/movie")
public class MovieResource {
    Date date = new Date();
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
        movie.setCreatedAt(date);
        movie.setUpdateAt(date);
        movie.setStatus(1);
        movie.setCinema(cinemaService.findbyMarap(movie.getCinema().getMarap()).get());
        return movieService.save(movie);
    }
}
