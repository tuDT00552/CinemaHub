package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.Cinema;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    List<T> findAll();

    Optional<T> get(Long id);

    T save(T t);

    void update(T t);

    void delete(Long id);
}
