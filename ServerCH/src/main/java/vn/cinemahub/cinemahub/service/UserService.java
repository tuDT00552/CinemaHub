package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    User save(User user);
    User update(User user);
    void delete(Long id);
    Optional<User> findOne(Long id);
}
