package vn.cinemahub.cinemahub.service;


import vn.cinemahub.cinemahub.entities.RefundTicket;

import java.util.List;
import java.util.Optional;

public interface RefundTicketService {
    List<RefundTicket> findAll();
    RefundTicket save(RefundTicket refundTicket);
    void update(RefundTicket refundTicket);

    void delete(Long id);



    Optional<RefundTicket> findByID(Long id);

    Optional<RefundTicket> findOne(Long id);
}
