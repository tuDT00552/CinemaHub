package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.RefundTicket;
import java.util.Optional;

@Repository
public interface RefundTicketRepository extends JpaRepository<RefundTicket,Long> {

    @Query("SELECT rt FROM RefundTicket rt, Ticket tk where rt.id = tk.id")
    Optional<RefundTicket> findById(Long id);
}
