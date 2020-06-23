package vn.cinemahub.cinemahub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.cinemahub.cinemahub.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
