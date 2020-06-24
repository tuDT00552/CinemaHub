package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.Showtime;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime,Long> {
}
