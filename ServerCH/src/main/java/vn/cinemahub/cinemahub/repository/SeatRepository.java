package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.dto.SeachSeatDto;
import vn.cinemahub.cinemahub.entities.GheEntity;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<GheEntity, Long> {
    @Query("SELECT s FROM GheEntity s WHERE lower(s.loaighe)=lower(?1) or lower(s.tenghe)=lower(?1) ")
    List<GheEntity> findByLoaigheAndTenghe(String name);
}
