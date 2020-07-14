package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.Ticket;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
    @Query("SELECT t FROM Ticket t where t.lichchieu = :showid")
    List<Ticket> findbyShow(Long showid);

    @Query("SELECT t FROM Ticket t where t.order.orderid = :ordid")
    List<Ticket> findbyOrdID(Long ordid);
//
//    @Query("SELECT t.id FROM Ticket t where t.id = :tenrap")
//    Long checkExitsTenRap(String tenrap);
//
//    @Query("SELECT c.id FROM Cinema c where c.marap = :marap")
//    Long checkExitsMaRap(int marap);

}
