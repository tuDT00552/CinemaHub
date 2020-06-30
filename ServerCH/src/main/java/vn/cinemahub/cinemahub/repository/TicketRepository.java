package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.Cinema;
import vn.cinemahub.cinemahub.entities.Ticket;

import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
//    @Query("SELECT t FROM Ticket t where t.id = :maVe")
//    Optional<Ticket> findbyMave(int maVe);
//
//    @Query("SELECT t.id FROM Ticket t where t.id = :tenrap")
//    Long checkExitsTenRap(String tenrap);
//
//    @Query("SELECT c.id FROM Cinema c where c.marap = :marap")
//    Long checkExitsMaRap(int marap);

}
