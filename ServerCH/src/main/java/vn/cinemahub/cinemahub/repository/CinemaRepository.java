package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.Cinema;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    @Query("SELECT c FROM Cinema c where c.marap = :marap")
    Optional<Cinema> findbyMarap(int marap);
}
