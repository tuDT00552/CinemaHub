package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.dto.CinemaDto;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.repository.CinemaRepository;
import vn.cinemahub.cinemahub.serviceImpl.CinemaService;


import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/cinema")
public class CinemaResource {
    Date date = new Date();
    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<Cinema> findAll() {
        return cinemaService.findAll();
    }

    @PostMapping
    public Cinema save(@RequestBody Cinema cinema) {
        cinema.setCreatedAt(date);
        cinema.setUpdateAt(date);
        cinema.setStatus(1);
        if (cinemaService.checkExitsTenRap(cinema.getTenrap()) == null
                && cinemaService.checkExitsMaRap(cinema.getMarap()) == null) {
            return cinemaService.save(cinema);
        }
        else
            return null;
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Cinema cinema) {
        cinema.setUpdateAt(date);
        cinemaService.update(cinema);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cinema> findOne(@PathVariable Long id) {
        return cinemaService.get(id).map(cinema -> new ResponseEntity<>(cinema, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cinemaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @GetMapping
//    public Page<CinemaDto> list(@RequestParam(name = "page", defaultValue = "0") int page,
//                                @RequestParam(name = "size", defaultValue = "5") int size) {
//        PageRequest pageRequest = PageRequest.of(page, size);
//        Page<Cinema> pageResult = cinemaRepository.findAll(pageRequest);
//        List<CinemaDto> todos = pageResult
//                .stream()
//                .map(CinemaDto::new)
//                .collect(pageResult.toList());
//
//        return new PageImpl<>(todos, pageRequest, pageResult.getTotalElements());
//
//    }
}
