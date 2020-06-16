package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.GheEntity;

import java.util.List;
import java.util.Optional;

public interface SeatService {
    List<GheEntity> findAll();
    GheEntity save(GheEntity seat);
    void update(GheEntity seat);

    void delete(Long id);



    Optional<GheEntity> findByID(Long id);

    Optional<Object> findOne(Long id);
}
