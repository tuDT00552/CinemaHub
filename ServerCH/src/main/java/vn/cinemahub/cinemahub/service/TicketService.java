package vn.cinemahub.cinemahub.service;

import vn.cinemahub.cinemahub.entities.GheEntity;
import vn.cinemahub.cinemahub.entities.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    List<Ticket> findAll();
    Ticket save(Ticket ticket);
    void update(Ticket ticket);
    void delete(Long id);
    Optional<Ticket> findByID(Long id);

    Optional<Ticket> findOne(Long id);
}
