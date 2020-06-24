package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.entities.GheEntity;
import vn.cinemahub.cinemahub.service.RoomService;
import vn.cinemahub.cinemahub.service.SeatService;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping({"/api/seat"})
public class SeatResource {
    Date date = new Date();
    @Autowired
    private SeatService seatService;

    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<GheEntity> findAll() {
        return seatService.findAll();
    }

    @PostMapping
    public GheEntity save(@RequestBody GheEntity seat) {
        seat.setCreatedAt(date);
        seat.setUpdateAt(date);
        seat.setStatus(1);
        seat.setRoomEntity(roomService.findbyMaphong(seat.getRoomEntity().getMaphong()).get());
        return this.seatService.save(seat);
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody GheEntity gheEntity) {
        gheEntity.setCreatedAt(date);
        this.seatService.update(gheEntity);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity findOne(@PathVariable Long id) {
        return (ResponseEntity)this.seatService.findOne(id).map((gheEntity) -> {
            return new ResponseEntity(gheEntity, HttpStatus.OK);
        }).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.seatService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
