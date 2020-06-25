package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.Showtime;

import java.util.List;
import java.util.Optional;

public interface ShowtimeService {
    List<Showtime> findAll();
    Showtime save(Showtime showtime);
    void update(Showtime showtime);
    void delete(Long id);
    Optional<Showtime> findByID(Long id);

    Optional<Showtime> findOne(Long id);
}
