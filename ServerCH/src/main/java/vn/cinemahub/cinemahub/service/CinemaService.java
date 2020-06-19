package vn.cinemahub.cinemahub.service;
import vn.cinemahub.cinemahub.entities.Cinema;

import java.util.List;
import java.util.Optional;

public interface CinemaService {
    List<Cinema> findAll();
    Cinema save(Cinema cinema);
    public Optional<Cinema> findByID(Long id);
    Optional<Cinema> findbyMarap(int marap);
    Long checkExitsTenRap(String tenrap);
    Long checkExitsMaRap(int marap);
    void update(Cinema cinema);
    void delete(Long id);
    Optional<Cinema> findOne(Long id);
}
