package vn.cinemahub.cinemahub.rest;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import vn.cinemahub.cinemahub.config.CinemaEntity;
//import vn.cinemahub.cinemahub.entities.Cinema;
//import vn.cinemahub.cinemahub.entities.Movie;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.service.CinemaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/cinema")
public class CinemaResource {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<Cinema> findAll() {
        return cinemaService.findAll();
    }

    @PostMapping
    public Cinema save(@RequestBody Cinema cinema) {
        Date date = new Date();
        cinema.setCreatedAt(date);
        cinema.setUpdateAt(date);
        cinema.setStatus(1);
        return cinemaService.save(cinema);
    }

}
