package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.cinemahub.cinemahub.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
