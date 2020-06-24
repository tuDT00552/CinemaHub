package vn.cinemahub.cinemahub.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.entities.Showtime;
import vn.cinemahub.cinemahub.service.ShowtimeService;


import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping({"/api/showtime"})
public class ShowtimeRecsource {
    private final ShowtimeService showtimeService;

    public ShowtimeRecsource(ShowtimeService showtimeService) {
        this.showtimeService = showtimeService;
    }

    @GetMapping
    public List<Showtime> findAll() {
        return showtimeService.findAll();
    }


    @PostMapping
    public Showtime save(@RequestBody Showtime showtime) {
        Date date = new Date();
        showtime.setCreatedAt(date);
        showtime.setUpdateAt(date);
        return this.showtimeService.save(showtime);
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Showtime showtime) {
        this.showtimeService.update(showtime);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity findOne(@PathVariable Long id) {
        return (ResponseEntity)this.showtimeService.findOne(id).map((showtime) -> {
            return new ResponseEntity(showtime, HttpStatus.OK);
        }).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.showtimeService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
