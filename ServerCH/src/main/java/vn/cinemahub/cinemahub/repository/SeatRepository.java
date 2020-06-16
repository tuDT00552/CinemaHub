package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.GheEntity;

@Repository
public interface SeatRepository extends JpaRepository<GheEntity, Long> {
}
