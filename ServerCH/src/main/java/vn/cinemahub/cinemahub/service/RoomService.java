package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.RoomEntity;

import java.util.List;
import java.util.Optional;

public interface RoomService {
    List<RoomEntity> findAll();
    RoomEntity save(RoomEntity roomEntity);
    Optional<RoomEntity> findbyMaphong(int maphong);
}
