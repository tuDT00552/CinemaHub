package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.Ticket;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
    @Query("SELECT t FROM Ticket t where t.id = :maVe")
    List<Ticket> findByTicket(Long maVe);

//    @Query("select  r FROM  Room  r WHERE r.cinema.id =?1")
//    List<Room> findRoomByCinema_IdContains(Long name);
//
//    @Query("SELECT t.id FROM Ticket t where t.id = :tenrap")
//    Long checkExitsTenRap(String tenrap);
//
//    @Query("SELECT c.id FROM Cinema c where c.marap = :marap")
//    Long checkExitsMaRap(int marap);

}
