package vn.cinemahub.cinemahub.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.entities.GheEntity;
import vn.cinemahub.cinemahub.entities.RefundTicket;
import vn.cinemahub.cinemahub.repository.RefundTicketRepository;
import vn.cinemahub.cinemahub.repository.SeatRepository;
import vn.cinemahub.cinemahub.service.RefundTicketService;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class RefundTicketServiceImpl implements RefundTicketService {
    @Autowired
    private RefundTicketRepository refundTicketRepository;

    @Override
    public List<RefundTicket> findAll() {
        return this.refundTicketRepository.findAll();
    }

    @Override
    public RefundTicket save(RefundTicket refundTicket) {
        return refundTicketRepository.save(refundTicket);
    }

    @Override
    public void update(RefundTicket refundTicket) {
        refundTicketRepository.save(refundTicket);
    }

    @Override
    public void delete(Long id) {
        this.refundTicketRepository.deleteById(id);
    }

    @Override
    public Optional<RefundTicket> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<RefundTicket> findOne(Long id) {
        return refundTicketRepository.findById(id);
    }
}
