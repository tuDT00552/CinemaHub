package vn.cinemahub.cinemahub.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.cinemahub.cinemahub.entities.Ticket;
import vn.cinemahub.cinemahub.repository.TicketRepository;
import vn.cinemahub.cinemahub.service.TicketService;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository seatRepository;


    @Override
    public List<Ticket> findAll() {
        return this.seatRepository.findAll();
    }

    @Override
    public Ticket save(Ticket ticket) {
        return seatRepository.save(ticket);
    }

    @Override
    public void update(Ticket ticket) {
        seatRepository.save(ticket);
    }

    @Override
    public void delete(Long id) {
        this.seatRepository.deleteById(id);
    }

    @Override
    public Optional<Ticket> findByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Ticket> findOne(Long id) {
        return seatRepository.findById(id);
    }
}
