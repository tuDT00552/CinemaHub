package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.entities.Movie;
import vn.cinemahub.cinemahub.entities.RoomEntity;
import vn.cinemahub.cinemahub.service.CinemaService;
import vn.cinemahub.cinemahub.service.RoomService;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping({"/api/room"})
public class RoomResource {
    @Autowired
    private RoomService roomService;

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<RoomEntity> findAll() {
        return roomService.findAll();
    }

    @PostMapping
    public RoomEntity save(@RequestBody RoomEntity roomEntity) {
        Date date = new Date();
        roomEntity.setCreatedAt(date);
        roomEntity.setUpdateAt(date);
        roomEntity.setStatus(1);
        roomEntity.setRap(cinemaService.findbyMarap(roomEntity.getRap().getMarap()).get());
        return roomService.save(roomEntity);
    }
}
